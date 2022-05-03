package tempconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mistakes = 0;
        while (mistakes < 3) {
            System.out.println("C - Celsius\nF - Fahrenheit");
            Scanner input = new Scanner(System.in);
            String type = input.next();

            double number = input.nextDouble();
            switch (type) {
                case "C", "c" -> CelsiusToFahrenheit(number);
                case "F", "f" -> FahrenheitToCelsius(number);
                default -> {
                    System.out.println("Unknown type");
                    mistakes++;
                }
            }
        }
    }

    static void CelsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit);
    }

    static void FahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(celsius);
    }
}