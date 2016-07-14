/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.domain;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author mukesh
 */
public class User implements Serializable{

    private int userId;
    @NotNull(message = "{NotNull.User.username.validation}")
    @Size(min = 5, max = 50, message = "{Size.User.username.validation}")
    private String userName;
    @Size(min = 8, max = 50, message = "{Size.User.password.validation}")
    @NotNull(message = "{NotNull.User.password.validation}")
    private String password;
    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "{Pattern.User.email.validation}")
    @NotNull(message = "{NotNull.User.email.validation}")
    private String email;
    @NotNull(message = "{NotNull.User.email.validation}")
    private String phone;
    @NotNull(message = "{NotNull.User.firstname.validation}")
    private String firstName;
    @NotNull(message = "{NotNull.User.lastname.validation}")
    private String lastName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User(String userName, String password, String email, String phone, String firstName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }
}
