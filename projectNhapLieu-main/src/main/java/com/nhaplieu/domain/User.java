package com.nhaplieu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "username")
    private String username;
    
    @Column(name = "user_id")
    private String user_id;
    
   

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

}
