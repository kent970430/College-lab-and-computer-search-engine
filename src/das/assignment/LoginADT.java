/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das.assignment;

/**
 *
 * @author justd
 */
public interface LoginADT {
    String getUsername();
    void setUsername(String username);
    String getPassword();
    void setPassword(String password);
    
    LoginADT loginn(String username, String password, String cmb);
    
}
