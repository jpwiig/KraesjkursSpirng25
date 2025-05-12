package org.data1700.assigment2.models;

import jakarta.validation.constraints.Pattern;

public class Account {
private long id;
@Pattern(regexp = "^[A-Za-z0-9]{4,100}$",message = "Validation is wrong")
private String username;
@Pattern(regexp = "^[A-Za-z0-9]{20,100}$",message = "Validation is wrong for password")
private String password;
public Account(String username, String password){
    this.username = username;
    this.password = password;

}
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
