package oopFinalProject;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

        while (userChoice != 6) {
            userChoice = Handler.printAndGetChoices(scanner);
            switch (userChoice) {
                case 1:
                    Handler.viewTasks();
                    break;
                case 2:
                    Handler.acceptOrRejectTask(scanner);
                    break;
                case 3:
                    Handler.updateTaskProgress(scanner);
                    break;
                case 4:
                    Handler.assignTask(scanner);
                    break;
                case 5:
                    Handler.editTask(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            if (userChoice != 6) {
                System.out.println("============================================");
                System.out.println("Press enter key to continue..");
                scanner.nextLine(); // To pause the execution until user presses enter
            }
        }
        scanner.close();
    }
}
