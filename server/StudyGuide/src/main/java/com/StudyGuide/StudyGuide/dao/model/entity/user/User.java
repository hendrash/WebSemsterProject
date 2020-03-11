package com.StudyGuide.StudyGuide.dao.model.entity.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="user", uniqueConstraints = {
        @UniqueConstraint(name="uq_email",columnNames = {"email"})
})
public class User {
    @Column(name="user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private Long userId;

    @Column(name="email")
    @Getter @Setter
    @NotNull
    private String email;

    @Column(name="uname")
    @Getter @Setter
    @NotNull
    private String uname;

    @Column(name="password")
    @Setter @Getter
    @NotNull
    private String password;

    @Column(name="first_name")
    @Setter @Getter
    private String firstName;

    @Column(name="last_name")
    @Setter @Getter
    private String lastName;

}
