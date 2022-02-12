package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/print")
    public static String printSomething()
    {
        return "This is Balance Controller";
    }
}
