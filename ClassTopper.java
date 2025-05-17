import java.util.Scanner;

public class Topper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents, numSubjects;
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();
        int[][] marks = new int[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < numSubjects; j++) {
            int maxMarks = marks[0][j];
            int topper = 0;
            for (int i = 1; i < numStudents; i++) {
                if (marks[i][j] > maxMarks) {
                    maxMarks = marks[i][j];
                    topper = i;
                }
            }
            System.out.println("Topper in Subject " + (j + 1) + ": Student " + (topper + 1) + " with marks " + maxMarks);
        }
        int[] totalMarks = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += marks[i][j];
            }
            totalMarks[i] = sum;
        }

        int maxTotalMarks = totalMarks[0];
        int overallTopper = 0;
        for (int i = 1; i < numStudents; i++) {
            if (totalMarks[i] > maxTotalMarks) {
                maxTotalMarks = totalMarks[i];
                overallTopper = i;
            }
        }

        System.out.println("Overall Topper: Student " + (overallTopper + 1) + " with total marks " + maxTotalMarks);
    }
}
