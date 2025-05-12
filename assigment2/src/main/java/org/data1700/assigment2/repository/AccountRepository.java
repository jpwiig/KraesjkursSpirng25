package org.data1700.assigment2.repository;

import org.data1700.assigment2.models.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
        String sql = "insert into accounts (username, password) values (admin, 12345)";
        db.update(sql);

    }

    public boolean validate( Account account){
        RowMapper<Account>accountRowMapper = (resultSet, RowNum) -> new Account(
            resultSet.getString("username"),
            resultSet.getString("password")
        );
        String sql = "select * from account where username = ? and password = ?";
        Account res = db.queryForObject(sql,accountRowMapper, account.getUsername(), account.getPassword());
        if(res.getUsername().equals(account.getUsername())){
            if(res.getPassword().equals(account.getPassword())){
                return true;
            } else return false;
        } return false;
    };


    public boolean createAccount(){
    return false;
    }
}
