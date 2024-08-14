import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        USystem system = new USystem();
        Scanner inputs = new Scanner(System.in);
        while (true) { 
            System.out.println("Welcome to the user management system");
            printLine();
            System.out.println("Login: \n");
            System.out.println("Please enter your user name: (Enter exit to exit program)");
            String user = inputs.nextLine();
            if (user.equals("exit")) {
                return;
            }
            
            System.out.println("Please enter your password: ");
            String password = inputs.nextLine();
            if (system.getNames().contains(user)){
                Employee emp = system.searchEmployeeByName(user);
                if (emp.getPassword().equals(password)){
                    System.out.println("Welcome, " + emp.getName());
                    String option;
                    switch (emp.getLevel()) {
                        case 2:
                            Admin admin = system.getAdmin();
                            while(true) {
                                printLine();
                                System.out.println("Please choose from the following options:\n");
                                System.out.println("""
                                                   1. Add User 
                                                    2. View Users 
                                                    3. Create Task 
                                                    4. View All Tasks 
                                                    5. View Own Tasks 
                                                    6. Accept Task 
                                                    7. Update Task Status 
                                                    8. Exit""" 
                                );
                                System.out.println("Please enter your choice: ");
                                option = inputs.nextLine();
                                switch (option) {
                                    case "1":
                                        admin.addUser(system);
                                        break;
                                    case "2":
                                        admin.viewUser(system, 1);
                                        admin.viewUser(system, 0);
                                        break;
                                    case "3":
                                        admin.createTask(system);
                                        break;
                                    case "4":
                                        admin.viewTasks(system);
                                        break;
                                    case "5":
                                        admin.viewTasks();
                                        break;
                                    case "6":
                                        admin.acceptTask();
                                        break;
                                    case "7":
                                        admin.setTaskStatus();
                                        break;
                                    default:
                                        break;
                                }
                                if (option.equals("8")){
                                    break;
                                }
                            }
                            admin = null;
                            break;
                        case 1:
                            Manager man = system.searchManagerByName(user);
                            while (true) { 
                                printLine();
                                System.out.println("Please choose from the following options:\n");
                                System.out.println("1. View Users \n 2. Create Task \n 3. View All Tasks \n 4. View Own Tasks \n 5. Accept Task \n 6. Update Task Status \n 7. Exit");
                                System.out.println("Please enter your choice: ");
                                option = inputs.nextLine();
                                switch (option) {
                                    case "1":
                                        man.viewUser(system, 1);
                                        man.viewUser(system, 0);
                                        break;
                                    case "2":
                                        man.createTask(system);
                                        break;
                                    case "3":
                                        man.viewTasks(system);
                                        break;
                                    case "4":
                                        man.viewTasks();
                                        break;
                                    case "5":
                                        man.acceptTask();
                                        break;
                                    case "6":
                                        man.setTaskStatus();
                                        break;
                                    default:
                                        break;
                                }
                                if (option.equals("7")){
                                    break;
                                }
                                
                            }
                            man = null;
                            break;
                        default:
                            while (true) { 
                                printLine();
                                System.out.println("Please choose from the following options:\n");
                                System.out.println("1. View Tasks \n 2. Accept Tasks \n 3. Update Task Status \n 4. Exit");
                                System.out.println("Please enter your choice: ");
                                option = inputs.nextLine();
                                switch (option) {
                                    case "1":
                                        emp.viewTasks();
                                        break;
                                    case "2":
                                        emp.acceptTask();
                                        break;
                                    case "3":
                                        emp.setTaskStatus();
                                        break;
                                    default:
                                        break;
                                }
                                if (option.equals("4")){
                                    break;
                                }
                                
                            }
                            break;
                    }
                } 
            } else {
                System.out.println("Incorrect user name or password!");
            }
        }

    }

    static void printLine() {
        System.out.println("-----------------------------------------------------");
    }

    
}
