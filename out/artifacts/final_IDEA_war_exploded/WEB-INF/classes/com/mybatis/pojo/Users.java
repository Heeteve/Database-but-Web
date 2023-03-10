package com.mybatis.pojo;

public class Users {
    private int id;
    private String username;
    private String password;
    private int role;

    public Users() {

    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Users(int id, String username, String password, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" + "ID=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", role=" + role + '}';
    }
}
