package org.romanzhula.springjwt.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @GetMapping("/greeting")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello authorized USER!");
    }

    @GetMapping("/if_you_admin")
    public ResponseEntity<String> adminOnly() {
        return ResponseEntity.ok("Hello ADMIN!");
    }

    @GetMapping("/if_you_manager")
    public ResponseEntity<String> managerOnly() {
        return ResponseEntity.ok("Hello MANAGER!");
    }
}
