package controller;

/**
 * @author Charchit [charchit.patodi@gmail.com]
 * Part of Coronathon
 * on 29/03/20.
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user/{user_id}")
    ResponseEntity getUser(@PathVariable("user_id") int user_id)
    {
        return ResponseEntity.ok("Fetch Success");
    }

    @PostMapping("/user")
    ResponseEntity addUser() {
        return ResponseEntity.ok("Created Successfully");
    }
}
