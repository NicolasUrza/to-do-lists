package com.ensolvers.todolist.models;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name="to-do-items")
@ToString @EqualsAndHashCode
public class ToDoItem {
    @Getter @Setter @Column(name= "itemId") @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    @Getter @Setter @Column(name= "listId")
    private Long listId;
    @Getter @Setter @Column(name= "description")
    private String description;
    @Getter @Setter @Column(name= "checked")
    private Boolean checked;
    @Getter @Setter @Column(name= "active")
    private Boolean active;
}
