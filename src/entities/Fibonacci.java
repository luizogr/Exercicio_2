package entities;

public class Fibonacci {
    
    public int a = 0;
    public int b = 1;
    public int c = 0;
    public int number;

    public String calculaFibonacci(int number) {
        while (c < number) {
                c = a + b;
                a = b;
                b = c;
            }
        if (c > number) {
            return "O número informado não pertence a sequência";
        }
        else {
            return "O número informado pertence a sequência";
        }
    }

}
