/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.io.Serializable;

/**
 *
 * @author buimi
 */
public class User implements Serializable{
    private String Username;
    private String Password;
    private String role;

    public User() {
    }

    public User(String Username, String Password, String role) {
        this.Username = Username;
        this.Password = Password;
        this.role = role;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
