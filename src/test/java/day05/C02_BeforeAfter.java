package day05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {

    @Before
    public void setUp(){
        System.out.println("Her Test methodundan önce calisir");
    }

    @After
    public void tearDown(){
        System.out.println(" Her Test methodundan sonra calisir");
    }

    @Test
    public void test01(){
        System.out.println("Test01");
    }

    @Test
    public void test02(){
        System.out.println("Test02");
    }
}
