package com.example.users.users;

import javax.persistence.*;
@Entity
@Table(name = "users")
public class TableUser{
    @Id
    private int id;
    private String name;
    private String email;

    public TableUser(){

    }

    public TableUser(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public  int getId(){
        return  id;
    }
    public void  setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }

}
