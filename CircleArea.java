//import java.util.Scanner;

public class CircleArea{
    private static double calculateArea(double n){
        return (n*Math.PI);
    }

    public static void main(String[] args){
        double result = calculateArea(9);
        System.out.println(result);
    }
}