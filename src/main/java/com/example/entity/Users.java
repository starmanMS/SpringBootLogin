package com.example.entity;

import lombok.Data;

@Data
public class Users {
    private int id;
    private String username;
    private String password;
    private String role;
}
