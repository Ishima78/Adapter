package org.example;

public class Main {
    public static void main(String[] args) {

        Ints calc = new IntsCalculator(new Calculator());
        int result =calc.sum(2,3);
        System.out.println(result);

       int res = calc.mult(2,3);
       System.out.println(res);

       int res2 = calc.pow(2,2);
       System.out.println(res2);
    }
}