package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/print")
    public static String printSomething()
    {
        return "This is Accounts Controller";
    }
}
