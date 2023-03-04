package FrizzBuzz;

public class FrizzBuzz {
    public FrizzBuzz(){}

    public String prueba(int i){

        if (i%15==0)
            return  "FizzBuzz";
        else if (i%5==0)
            return "Buzz";
        else if (i%3==0)
            return "Fizz";
        return String.valueOf(i);
    }
}
