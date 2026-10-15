package day01;

// Question 02: Area of a Circle
public class question02 {
    public static void main(String[] args) {
        float pye = 3.14159f;
        int r = 10;

        float result = pye * r * r;

        System.out.println("Area of the circle: " + result); // output: Area of the circle: 314.159
     // To display two digits after the decimal point, use printf with "%.2f".
        System.out.printf("Area of the circle: %.2f%n", result); // output: Area of the circle: 314.16
    }
}