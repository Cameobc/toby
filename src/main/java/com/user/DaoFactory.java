package com.user;

public class DaoFactory {

    public UserDao userDao(){
        return new UserDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker(){
        return new SimpleConnectionMaker();
    }
}
