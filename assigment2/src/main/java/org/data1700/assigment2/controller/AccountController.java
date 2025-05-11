package org.data1700.assigment2.controller;

import org.data1700.assigment2.repository.AccountRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
private final AccountRepository rep;


public AccountController(AccountRepository rep){
    this.rep = rep;
}

}
