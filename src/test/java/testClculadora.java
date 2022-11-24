
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Richard Lopez on 24/11/2022
 * Visit Linkedin https://www.linkedin.com/in/richard-lopez-/
 **/
public class testClculadora {
    @Test
    public void suma(){
        //
        Assert.assertEquals(Calculadora.suma(5,5),11,"La suma no es correcta");
    }
    @Test
    public void resta(){
        Assert.assertEquals(Calculadora.resta(5,5),0,"La resta no es correcta");
    }
}
