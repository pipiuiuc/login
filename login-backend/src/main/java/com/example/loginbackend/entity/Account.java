package com.example.loginbackend.entity;

import lombok.Data;

@Data
public class Account {
    int id;
    String username;
    String password;
    String email;
}