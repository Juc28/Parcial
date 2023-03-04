package FrizzBuzz.app;
import FrizzBuzz.FrizzBuzz;
import org.junit.Assert;
import org.junit.Test;


public class Puebas {

    public FrizzBuzz prueba = new FrizzBuzz();

    @Test
    public void prueba_deberiaMandarElMismoNumero() {
        // Arrange
        int num = 1;
        // Act
        String resultado = prueba.prueba(1);
        // Assert
        Assert.assertEquals("1",resultado);
    }
    @Test
    public void prueba_deberiaMandarElFrizzBuzzPorqueEsMultiploDe3y5() {
       // Arrange
        int num = 15;
        // Act
        String resultado = prueba.prueba(15);
        // Assert
        Assert.assertEquals("FizzBuzz",resultado);
    }

    @Test
    public void prueba_deberiaMandarElFrizzBuzzPorqueEsMultiploDe3() {
        // Arrange
        int num = 9;
        // Act
        String resultado = prueba.prueba(num);
        // Assert
        Assert.assertEquals("Fizz",resultado);
    }


    @Test
    public void prueba_deberiaMandarElFrizzBuzzPorqueEsMultiploDe5() {
       // Arrange
        int num = 10;
        // Act
        String resultado = prueba.prueba(num);
        // Assert
        Assert.assertEquals("Buzz",resultado);
        // Arrange
        int num1 = 52;
        // Act
        String resultado1 = prueba.prueba(num);
        // Assert
        Assert.assertEquals("Buzz",resultado1);
   
    }
}
