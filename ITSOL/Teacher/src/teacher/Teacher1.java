/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

/**
 *
 * @author Hong Beo
 */
public class Teacher1 {
    
    private String account;
    private String firstname;
    private String lastname;
    private String email;

    public Teacher1() {
    }

    public Teacher1(String account, String firstname, String lastname, String email) {
        this.account = account;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    @Override
    public String toString() {
        return "Teacher {" + "Account=" + account + ", First-Name=" + firstname + ", Last-Name=" + lastname + ", Email=" + email + '}';
    }
    
    
}
