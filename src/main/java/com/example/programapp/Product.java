package com.example.programapp;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok. AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank(message = "This product cannot be blank")
    private String name;
    @PositiveOrZero(message = "cannot be negative")
    @NotNull(message = "must not be 0")
    @Max(value = 99, message = ("Value greater than 99"))
    @Min(value = 1, message = ("Value greater than 1"))
    private int code;
    @NotBlank(message = "This product cannot be blank")
    private String Title;
    @NotBlank(message = "This product cannot be blank")
    private String Employed;
    @Min(value = 1, message = ("Value greater than 1"))
    private int age;
    @NotBlank(message = "This product cannot be blank")
    @Email(message = "Must be a real email")
    private String Email;
    @NotBlank(message = "This product cannot be blank")
    private String Department;
    @NotBlank(message = "This product cannot be blank")
    private String Position;
}
