package codsoft;

import java.util.Scanner;

public class Student_Grade_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        // Initialize variables
        int totalMarks = 0;

        // Get marks for each subject
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter the marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate the marks (assuming the marks are between 0 and 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                i--; // Decrement i to repeat the current iteration
            } else {
                totalMarks += marks;
            }
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Determine the grade based on the average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}