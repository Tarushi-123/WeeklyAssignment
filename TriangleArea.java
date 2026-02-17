import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter base (in cm): ");
        float base = sc.nextFloat();

        System.out.print("Enter height (in cm): ");
        float height = sc.nextFloat();

        // Area in sq cm
        float areaCm = 0.5f * base * height;

        // Convert to sq inches (1 inch = 2.54 cm)
        float areaInches = areaCm / (2.54f * 2.54f);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInches
                + " and sq cm is " + areaCm);

        sc.close();
    }
}
