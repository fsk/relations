package org.fsk.onetoonejoincolumn.controller;


import lombok.RequiredArgsConstructor;
import org.fsk.onetoonejoincolumn.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public void loadData() {
        userService.loadDataToDb();
    }
}
