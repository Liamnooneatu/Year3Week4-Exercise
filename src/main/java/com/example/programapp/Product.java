package com.example.programapp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok. AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank(message = "This product cannot be blank")
private String name;
    @Min(value = 1, message = ("Value greater than 1"))
    private int code;
}
