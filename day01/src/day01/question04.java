package day01;

// Question 04: Temperature Conversion (Celsius to Fahrenheit)
public class question04 {
    public static void main(String[] args) {
        float celsius = 25f;
        float fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit); // output: Temperature in Fahrenheit: 77.00
    }
}