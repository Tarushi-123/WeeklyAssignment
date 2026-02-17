import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();

        // Conversion
        float fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " 
                           + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}
