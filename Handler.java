package oopFinalProject;
import java.util.Scanner;

public class Handler {

    public static int printAndGetChoices(Scanner scanner) {
        System.out.println("Please choose one of the following options:");
        System.out.println("(1) View Tasks");
        System.out.println("(2) Accept/Reject Task");
        System.out.println("(3) Update Task Progress");
        System.out.println("(4) Assign Task");
        System.out.println("(5) Edit Task");
        System.out.println("(6) Exit");
        System.out.println("=============================================");
        System.out.print("What's your choice: ");
        return scanner.nextInt();
    }

    public static void viewTasks() {
        System.out.println("Viewing tasks...");
        // TODO: Add logic to display tasks
    }

    public static void acceptOrRejectTask(Scanner scanner) {
        System.out.println("Accepting or Rejecting tasks...");
        // TODO: Add logic to accept or reject tasks
    }

    public static void updateTaskProgress(Scanner scanner) {
        System.out.println("Updating task progress...");
        // TODO: Add logic to update task progress
    }

    public static void assignTask(Scanner scanner) {
        System.out.println("Assigning tasks...");
        // TODO: Add logic to assign tasks to employees
    }

    public static void editTask(Scanner scanner) {
        System.out.println("Editing tasks...");
        // TODO: Add logic to edit task details
    }
}
