package com.ensolvers.todolist.models;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="lists")
@ToString @EqualsAndHashCode
public class lists {
    @Getter @Setter @Column(name="listCod") @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listCod;
    @Getter @Setter @Column(name="folderCod")
    private Long folderCod;
    @Getter @Setter @Column(name="name")
    private String name;
    @Getter @Setter @Column(name="active")
    private Boolean active;
}
