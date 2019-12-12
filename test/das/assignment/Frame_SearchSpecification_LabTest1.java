/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das.assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import das.assignment.Frame_Search_Compp_Lab;


/**
 *
 * @author justd
 */
public class Frame_SearchSpecification_LabTest1 {
    Frame_SearchSpecification fss = new Frame_SearchSpecification();
    
    public Frame_SearchSpecification_LabTest1() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of specialChar method, of class Frame_SearchSpecification.
     */
    @Test
    public void testSpecialChar() {
        System.out.println("Special Character");
        System.out.println("==================================");
        assertTrue(fss.specialChar("@#$"));
        assertFalse(fss.specialChar(""));
        assertFalse(fss.specialChar("12345"));
        assertFalse(fss.specialChar("testing"));
    }

    /**
     * Test of isEmpty method, of class Frame_SearchSpecification.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("Check Empty");
        System.out.println("==================================\n");
        assertTrue(fss.isEmpty(""));
        assertFalse(fss.isEmpty("test"));
    }
    
}
