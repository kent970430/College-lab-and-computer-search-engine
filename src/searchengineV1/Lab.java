/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchengineV1;

/**
 *
 * @author DELL
 */
import java.io.*;

public class Lab {

    private String labID;
    private String block;
    private String level;
    private String specification;
    private int numberss;

    public Lab() {

    }

    public Lab(String labID, String block, String level, String specification, int numberss) {
        this.labID = labID;
        this.block = block;
        this.level = level;
        this.specification = specification;
        this.numberss = numberss;
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getNumberss() {
        return numberss;
    }

    public void setNumberss(int numberss) {
        this.numberss = numberss;
    }

    public String toString() {
        return String.format(labID + "," + block + "," + level + "," + specification + "," + numberss + "\n");
    }
}
