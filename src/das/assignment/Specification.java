/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author justd
 */
public class Specification {

    String deviceIDD;
    String processor;
    String ram;
    String os;
    String version;
    String manufacturer;
    String system;
    
    public void show_comp(String labID, String deviceID) {
        try {
            String line;
            String[] field;
            BufferedReader comppp = new BufferedReader(new FileReader(labID));
            while ((line = comppp.readLine()) != null) {
                field = line.split(",");
                for (String idd : field) {
                    if (idd.matches(deviceID)) {
                        deviceIDD = field[0];
                        processor = field[2];
                        ram = field[3];
                        os = field[4];
                        version = field[5];
                        manufacturer = field[6];
                        system = field[7];                     
                        break;
                    }                 
                }
            }
            comppp.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, " + e);
        }
    }
    
    public String getProcessor(){
        return processor;
    }
    
    public String getRam(){
        return ram;
    }
    
    public String getOS(){
        return os;
    }
    
    public String getVersion(){
        return version;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public String getSystem(){
        return system;
    }

}
