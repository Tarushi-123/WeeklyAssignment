import java.util.Scanner;

public class VotingEligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define array of 10 students
        int[] ages = new int[10];

        // Taking input
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } 
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } 
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}