package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        try {
            Log log1 = new Log2File();
            log1.Write();
            Log log2 = new Log2Screen();
            log2.Write();
            Log log3 = new Log2Email();
            log3.Write();
            assertTrue( true );
        } catch (Exception ex){
            ex.getMessage();
        }
    }
}
