package org.data1700.assigment2.models;

import jakarta.validation.constraints.Pattern;

public class Account {
private long id;
@Pattern(regexp = "^[A-Za-z0-9]{4,100}$",message = "Validation is wrong")
private String username;
@Pattern(regexp = "^[A-Za-z0-9]{20,100}$",message = "Validation is wrong for password")
private String password;
}
