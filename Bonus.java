import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 10;

        // Arrays
        double[] salary = new double[size];
        double[] years = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        // Totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input
        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < size; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double yr = sc.nextDouble();

            // Validation
            if (sal < 0 || yr < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to re-enter
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        // Calculating bonus and new salary
        for (int i = 0; i < size; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Summary (Zara) ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}