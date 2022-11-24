import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Richard Lopez on 24/11/2022
 * Visit Linkedin https://www.linkedin.com/in/richard-lopez-/
 **/
public class testClculadora {
    @Test
    public void suma(){
        ////
        Assertions.assertEquals(Calculadora.suma(5,5),10,"La suma no es correcta");
    }
    @Test
    public void resta(){
        Assertions.assertEquals(Calculadora.resta(5,5),0,"La resta no es correcta");
    }
}
