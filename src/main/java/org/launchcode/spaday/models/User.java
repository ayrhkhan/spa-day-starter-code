package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {


    @NotBlank(message ="username can be blank")
    @Size(min =5, max= 15, message ="username must be between 5 and 15 characters")
    private String username;

    @Email
    private String email;
   @NotBlank(message = "password cannot be blank")
   @Size(min =6,  message ="password must at least 6 characters")
    private String password;

   public int id;
   public static int nextId = 1;


    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }


    //   @NotNull
//   private String verify;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
