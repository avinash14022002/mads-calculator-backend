package com.example.madscalculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * User: Avinash Vijayvargiya
 * Date: 05-May-22
 * Time: 12:51 AM
 */
@RestController
public class AuthController {
    @PostMapping("/auth")
    public ResponseEntity<String> auth(AuthModel authModel) {
        try {
            if (Objects.equals(authModel.getUsername(), "flytBase") && Objects.equals(authModel.getPassword(), "flytBase123")) {
                return new ResponseEntity<>("Auth successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Invalid password", HttpStatus.FORBIDDEN);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
