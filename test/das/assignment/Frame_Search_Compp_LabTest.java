///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package das.assignment;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import das.assignment.Frame_Search_Compp_Lab;
//
//
///**
// *
// * @author justd
// */
//public class Frame_Search_Compp_LabTest {
//    Frame_Search_Compp_Lab fscl = new Frame_Search_Compp_Lab();
//    
//    public Frame_Search_Compp_LabTest() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//
//    /**
//     * Test of specialChar method, of class Frame_Search_Compp_Lab.
//     */
//    @Test
//    public void testSpecialChar() {
//        System.out.println("Special Character");
//        System.out.println("==================================");
//        assertTrue(fscl.specialChar("@#$"));
//        assertFalse(fscl.specialChar(""));
//        assertFalse(fscl.specialChar("12345"));
//        assertFalse(fscl.specialChar("testing"));
//    }
//
//    /**
//     * Test of isInteger method, of class Frame_Search_Compp_Lab.
//     */
//    @Test
//    public void testIsInteger() {
//        System.out.println("Check Integer");
//        System.out.println("==================================\n");
//        assertTrue(fscl.isInteger("2"));
//        assertFalse(fscl.isInteger("test"));
//    }
//
//    /**
//     * Test of inputNum method, of class Frame_Search_Compp_Lab.
//     */
//    @Test
//    public void testInputNum() {
//        System.out.println("Input Length");
//        System.out.println("==================================\n");
//        assertEquals(5,fscl.inputNum("hello"));
//        assertEquals(4,fscl.inputNum("wuek"));
//    }
//    
//}
