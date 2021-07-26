package examen.test;

import mainprogram.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    void test(){
        Main.main(new String[]{});
        Assert.assertTrue(true);
    }
}
