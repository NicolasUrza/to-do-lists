package com.ensolvers.todolist.models;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="lists")
@ToString @EqualsAndHashCode
public class list {
    @Getter @Setter @Column(name="listid") @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listid;
    @Getter @Setter @Column(name="name")
    private String name;
    @Getter @Setter @Column(name="active")
    private Boolean active;
}
