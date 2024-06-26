package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

    @Value("${greeting.message}")
    private String message;

}
