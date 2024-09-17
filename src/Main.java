import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first score: ");
        double score1 = scan.nextDouble();
        System.out.print("Enter the weight for the first score (in %): ");
        double weight1 = scan.nextDouble();

        System.out.print("Enter the second score: ");
        double score2 = scan.nextDouble();
        System.out.print("Enter the weight for the second score (in %): ");
        double weight2 = scan.nextDouble();

        System.out.print("Enter the third score: ");
        double score3 = scan.nextDouble();
        System.out.print("Enter the weight for the third score (in %): ");
        double weight3 = scan.nextDouble();

        if (weight1 + weight2 + weight3 != 100) {
            System.out.println("The weights must sum to 100%!");
        } else {

            double finalGrade = (score1 * weight1 / 100) + (score2 * weight2 / 100) + (score3 * weight3 / 100);
            System.out.printf("The final grade is: %.2f%n", finalGrade);
        }
        scan.close();
    }
}