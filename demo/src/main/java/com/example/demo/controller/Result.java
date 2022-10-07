package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Result {
    int code;
    String message;
    Object data;
}
