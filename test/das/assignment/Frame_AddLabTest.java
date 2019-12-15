/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class Frame_AddLabTest {

    Frame_AddLab instance = new Frame_AddLab();
    List<Lab> list = instance.getLab();

    public Frame_AddLabTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of add method, of class Frame_AddLab.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("\nAdd");

        Lab lab = new Lab("104", "B", "1", "Data Structure", 25);
        Lab lab1 = new Lab("105", "D", "2", "Networking", 26);
        list.add(lab);
        assertTrue(list.contains(lab));
        assertFalse(list.contains(lab1));
    }

    /**
     * Test of formatList method, of class Frame_AddLab.
     */
    @Test
    public void testFormatList() {
        System.out.println("\nDisplay List");
        Lab lab = new Lab("104", "B", "1", "Web Design", 25);
        list.add(lab);
        assertEquals("104,B,1,Web Design,25\n", instance.formatList());
    }

    /**
     * Test of specialChar method, of class Frame_AddLab.
     */
    @Test
    public void testSpecialChar() {
        System.out.println("\nSpecial Character");
        assertTrue(instance.specialChar("@#$"));
        assertFalse(instance.specialChar(""));
        assertFalse(instance.specialChar("12345"));
        assertFalse(instance.specialChar("testing"));
    }

    /**
     * Test of isInteger method, of class Frame_AddLab.
     */
    @Test
    public void testIsInteger() {
        System.out.println("\nCheck Integer");
        assertTrue(instance.isInteger("2"));
        assertFalse(instance.isInteger("test"));
    }

    /**
     * Test of inputNum method, of class Frame_AddLab.
     */
    @Test
    public void testInputNum() {
        System.out.println("\nInput Length");
        assertEquals(5,instance.inputNum("hello"));
        assertEquals(4,instance.inputNum("wuek"));
    }

}
