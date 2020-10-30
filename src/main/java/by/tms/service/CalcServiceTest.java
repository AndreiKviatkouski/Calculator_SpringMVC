package by.tms.service;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {

    @org.junit.jupiter.api.Test
    void calculator()throws Exception {
        assertEquals(17,15,30,symbol());
    }

    private void assertEquals(int i, int i1, int i2, String symbol) {
    }

    @org.junit.jupiter.api.Test
     String symbol(){
       return "sum"; 
    }

    private void assertEquals(String sum) {
    }
}