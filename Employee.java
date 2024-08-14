import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    private ArrayList<Task> tasks = new ArrayList<Task>(); // for this project, we assume each employee will be assigned maximum of 20 tasks
    private String name;
    private int level = 0;
    private static int count = 0;
    private String password;

    // All employees must have a name, or the user will not be able to create an employee
    public Employee(String name, String password) {
        this.name = name;
        this.password = password;
        count++;
    }

    public Employee(String name, String password, int level) {
        this.name = name;
        this.password = password;
        this.level = level;
        count++;
    }

    public Employee() {
        this.name = "xx" + count;
        this.password = "123";
        count++;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void setTaskStatus(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the task you would like to update: (please enter the title of an existing task of this user)");
        String taskName = in.nextLine();
        for (Task t: tasks) {
            if (t.getTitle().equals(taskName)){
                System.out.println("Please enter the new status: \n 1. Not Started \n 2. In Progress \n 3. Completed");
                String choice = in.nextLine();
                switch (choice) {
                    case "1":
                        t.setStatus(0, this.name);
                        break;
                    case "2":
                        t.setStatus(1, this.name);
                        break;
                    case "3":
                        t.setStatus(2, this.name);
                        break;
                    default:
                        System.out.println("Incorrect Option");
                        break;
                }
                
            }
        }
        
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    
    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public int getLevel() {
        return this.level;
    }

    public void acceptTask(){
        Scanner in = new Scanner(System.in);
        for (Task t : getTasks()) {
            if (t.getAccept().equals("No")){
                System.out.println("Task: " + t.getTitle()+ " Would you like to accept? (Y/N)");
                String choice = in.nextLine();
                if (choice.equals("Y")){
                    t.setAccept(1, this.name);
                }
            } 
        }
        
    }

    public void viewTasks() {
        printLine();
        System.out.println("Tasks: \n");
        System.out.printf("| %-18s | %-10s | %-10s | %-20s |%n", "TASK NAME", "IS ACCEPTED", "STATUS", "DETAIL");
        printLine();
        for (Task t : getTasks()) {
            System.out.printf("| %-18s | %-10s | %-10s | %-20s |%n", t.getTitle(), t.getAccept(), t.getStatus(), t.getDetail());
        }
    }

    public void printLine() {
        System.out.println("-----------------------------------------------------");
    }


}