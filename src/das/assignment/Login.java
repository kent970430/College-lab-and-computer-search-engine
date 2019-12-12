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
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import javax.swing.*;

public class Login implements LoginADT {

    private String username;
    private String password;
    private String user;
    private String[] records;
    private static int flag;

    Login() {

    }

    Login(String username, String password, String user) {
        this.username = username;
        this.password = password;
        this.user = user;
    }

    public void loginn(String username, String password, String cmb) {
        //Login login = new Login();
        Database database = new Database();
        database.getAllData();
        switch (cmb) {
            case "Student":
                try {
                    //ArrayList<Student> studList = database.getStudent();
                    //int size = studList.size();
//                    BufferedReader user = new BufferedReader(new FileReader("user.txt"));
//                    String line;
//                    while ((line = user.readLine()) != null) {
//                        records = line.split(",");
//                        if (username.contains(records[0]) && password.contains(records[1])) {
//                            //new Frame_Student_Profile(studList.get(i).getStudentID(),studList.get(i).getStudentName(),studList.get(i).getStudentIC(),studList.get(i).getStudentPhone(),studList.get(i).getStudentAddress(),studList.get(i).getStudentEmail()).setVisible(true);                           
//                            
//                                JOptionPane.showMessageDialog(null, "Student Login Success!");
//                                break;
//
//                            
//                        } else {
//
//                            JOptionPane.showMessageDialog(null, "Login Failed, please try again!");
//                            
//                        }
//                    }
//                    user.close();

                    BufferedReader user = new BufferedReader(new FileReader("user.txt"));
                    String line;
                    while ((line = user.readLine()) != null) {
                        records = line.split(",");
                        if (username.equals(records[0]) && password.equals(records[1])) {
                            flag = 1;
                            //JOptionPane.showMessageDialog(null, "Student Login Success!");
                            break;
                        } else if (!username.equals(records[0]) && password.equals(records[1])) {
                            flag = 3;
                            break;
                            //JOptionPane.showMessageDialog(null, "Login Failed, please try again!");
                        } else if (username.equals(records[0]) && !password.equals(records[1])) {
                            flag = 4;
                            break;
                        } else {
                            flag = 6;
                        }
                    }
                    user.close();

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
                        if (adminUser.equals(username) && adminPsw.equals(password)) {
                            try {
                                flag = 2;
                                //JOptionPane.showMessageDialog(null, "Admin Login Success!");
                                break;

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Insert Error, " + e);
                            }

                        } else if (!adminUser.equals(username) && adminPsw.equals(password)) {
                            flag = 3;
                            break;
                            //JOptionPane.showMessageDialog(null, "Login Failed, please try again!");
                        } else if (adminUser.equals(username) && !adminPsw.equals(password)) {
                            flag = 4;
                            break;
                            //JOptionPane.showMessageDialog(null, "Login Failed, please try again!");
                        } else {
                            flag = 6;
                            //JOptionPane.showMessageDialog(null, "Login Failed, please try again!");
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

        //return login;
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

    public int getFlag() {
        return flag;
    }
    
    // public int
}
