package org.data1700.assigment2.controller;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.ReportAsSingleViolation;
import org.data1700.assigment2.models.Account;
import org.data1700.assigment2.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/v1/Accounts")
public class AccountController {
private final AccountRepository rep;
public AccountController(AccountRepository rep,){
    this.rep = rep;
}

@GetMapping("/hello")
public String helloWorld(){
    return "hei verden";
    }

    @PostMapping("/validate")
    public boolean validate(@RequestBody Account account, HttpSession session) {
    //session.setAttribute("account", true);
    boolean ok = rep.validate(account);
    return ok;

    }
}
