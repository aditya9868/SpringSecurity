package com.example.demo4.SecurityApp.controllers;

import com.example.demo4.SecurityApp.dto.SignUpDto;
import com.example.demo4.SecurityApp.dto.UserDTO;
import com.example.demo4.SecurityApp.entities.User;
import com.example.demo4.SecurityApp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> signUp(@RequestBody SignUpDto signUpDto) {
        UserDTO userDTO = userService.signUp(signUpDto);
        return ResponseEntity.ok(userDTO);
    }
}
