package org.romanzhula.springjwt.controllers;

import org.romanzhula.springjwt.model.User;
import org.romanzhula.springjwt.responses.AuthenticationResponse;
import org.romanzhula.springjwt.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private final AuthService authService;

    public AuthenticationController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/registration")
    public ResponseEntity<AuthenticationResponse> registration(
            @RequestBody User request
    ) {
        return  ResponseEntity.ok(authService.registration(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody User request
    ) {
        return ResponseEntity.ok(authService.authenticate(request));
    }
}
