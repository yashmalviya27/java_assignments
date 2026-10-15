package day01;

// Question 03: Simple Interest
public class question03 {
    public static void main(String[] args) {
        float p = 10000f; 
        float r = 5.5f;   
        float t = 2f;    

        // Simple Interest = (Principal × Rate × Time) / 100
        float si = (p * r * t) / 100;
        // Total amount = Principal + Simple Interest
        float amount = p + si;
        
        System.out.printf("Simple Interest: %.2f%n", si); // output: Simple Interest: 1100.00
        System.out.printf("Total Amount: %.2f%n", amount); // output: Total Amount: 11100.00
    }
}