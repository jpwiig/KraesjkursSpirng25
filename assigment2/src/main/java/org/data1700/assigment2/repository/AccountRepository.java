package org.data1700.assigment2.repository;

import org.data1700.assigment2.models.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;



@Repository
public class AccountRepository {
    private final JdbcTemplate db;

    public AccountRepository(JdbcTemplate db){
        this.db=db;
    }
    public void load(){
        //as no db is added:

    }
    public List<Account> getAccounts(){
        List<Account> account = new ArrayList<>();
        String sql = "";
        return account;
    }
    public boolean createAccount(){
    return false;
    }
}
