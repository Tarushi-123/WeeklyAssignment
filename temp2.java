import java.util.Scanner;

public class temp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        // Conversion
        float celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.println("The " + fahrenheit + " fahrenheit is " 
                           + celsiusResult + " celsius");

        sc.close();
    }
}
