package application;

import java.util.Scanner;

import entities.Fibonacci;

public class App {
    public static void main(String[] args) throws Exception {
        /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 
        2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
        informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
        IMPORTANTE:
        Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; */
        
        Scanner sc = new Scanner(System.in);

        Fibonacci fibonacci = new Fibonacci();
        
        System.out.println("Digite um número: ");
        fibonacci.number = sc.nextInt();

        int number = fibonacci.number;
        fibonacci.calculaFibonacci(number);

        System.out.println(fibonacci.calculaFibonacci(number));

        sc.close();
    }
}
