package com.example.loginapp.models;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> users;
    public Users(){

    }
    public ArrayList<User>getUsers(){
        return users;
    }

    public void setUsers(ArrayList<User> users){
        this.users = users;
    }
}
