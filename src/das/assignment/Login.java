/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das.assignment;

/**
 *
 * @author DELL
 */
import java.util.*;
import javax.swing.*;

public class Login implements LoginADT {

    private String username;
    private String password;
    private String user;

    Login() {

    }

    Login(String username, String password, String user) {
        this.username = username;
        this.password = password;
        this.user = user;
    }

    public LoginADT loginn(String username, String password, String cmb) {
        Login login = new Login();
        Database database = new Database();
        database.getAllData();
        switch (cmb) {
            case "Student":
                try {
                    ArrayList<Student> studList = database.getStudent();
                    int size = studList.size();
                    for (int i = 0; i < studList.size(); i++) {
                        if (studList.get(i).getStudentUsn().compareTo(username) == 0 && studList.get(i).getStudentPwd().compareTo(password) == 0) {
                            //new Frame_Student_Profile(studList.get(i).getStudentID(),studList.get(i).getStudentName(),studList.get(i).getStudentIC(),studList.get(i).getStudentPhone(),studList.get(i).getStudentAddress(),studList.get(i).getStudentEmail()).setVisible(true);                           
                            try {

                                JOptionPane.showMessageDialog(null, "Student Login Success!");
                                break;

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Insert Error, " + e);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Login Failed, please try again!");
                            break;
                        }
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Login Error, " + e);
                }
                break;
            case "Admin":
                try {
                    ArrayList<Admin> adminList = database.getAdmin();
                    int size = adminList.size();
                    for (int i = 0; i < size; i++) {
                        String adminUser = adminList.get(i).getStaffUsn();
                        String adminPsw = adminList.get(i).getStaffPwd();
                        if (adminUser.compareTo(username) == 0 && adminPsw.compareTo(password) == 0) {
                            try {
                                JOptionPane.showMessageDialog(null, "Admin Login Success!");
                                break;

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Insert Error, " + e);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Login Failed, please try again!");
                            break;
                        }
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Login Error, " + e);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please select an user type!");
                break;
        }

        return login;
    }

    public String getUser() {
        return user;
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

}
