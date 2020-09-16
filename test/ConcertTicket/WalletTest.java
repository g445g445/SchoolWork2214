/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcertTicket;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author bebpo
 */
public class WalletTest {

    public WalletTest() {
    }

    /**
     * Test of add method, of class Wallet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Wallet instance = new Wallet();
        ConcertTicket ct1, ct2;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        try {
            ct1 = new ConcertTicket("Band 1", df.parse("09/20/2020"), 18.5);
            ct2 = new ConcertTicket("Band 2", df.parse("09/30/2020"), 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail("Exception declaring ConcertTicket objects");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of resize method, of class Wallet.
     */
    @Test
    public void testResize() {
        System.out.println("resize");
        Wallet instance = new Wallet();
        instance.resize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Wallet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Wallet instance = new Wallet();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Wallet.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Wallet instance = new Wallet();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Wallet.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Wallet instance = new Wallet();
        ConcertTicket expResult = null;
        ConcertTicket result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
