import java.util.Scanner;

public class Manager extends Employee{
    private int level;

    public Manager(String name, String password) {
        super(name, password, 1);
    }

    public Manager(String name, String password, int level) {
        super(name, password, level);
    }

    public Manager() {
        super(); 
        level = 1;
    }

    public void createTask(USystem sys) {
        printLine();
        System.out.println("Enter name of the user you want to assign to: (Please enter correct and existing user name)");
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        Employee emp = sys.searchEmployeeByName(userName);
        System.out.println("Enter title of the task: ");
        String title = in.nextLine();
        if(sys.addTaskName(title) > 0) {
            System.out.println("Enter detail of the task: ");
            String detail = in.nextLine();

            Task task = new Task(emp, title, detail);
            sys.addTask(task);
            emp.addTask(task);
        } else {
            System.out.println("The title has already been taken!");
        }
        
    }

    public void editTaskDetail(Task task, String detail){
        task.setDetail(detail);
    }

    public void setTaskTitle(Task task, String title){
        task.setTitle(title);
    }

    public void viewUser(USystem s, int level) {
        printLine();
        if (level == 0) {
            System.out.println("Employees: ");
            System.out.printf("| %-18s | %-5s  |%n", "NAME", "LEVEL");
            for (Employee e : s.getEmployees()){
                System.out.printf("| %-18s | %-5s  |%n", e.getName(), e.getLevel());
            }
        } else {
            System.out.println("Managers: ");
            System.out.printf("| %-18s | %-5s  |%n", "NAME", "LEVEL");
            for (Manager e : s.getManagers()){
                System.out.printf("| %-18s | %-5s  |%n", e.getName(), e.getLevel());
            }
        }

    }

    public void viewTasks(USystem s) {
        printLine();
        System.out.println("Tasks: \n");
        System.out.printf("| %-18s | %-18s | %-12s | %-15s | %-20s |%n", "TASK NAME", "EMPLOYEE", "IS ACCEPTED", "STATUS", "DETAIL");
        printLine();
        for (Employee emp : s.getEmployees()) {
            for (Task t : emp.getTasks()) {
                System.out.printf("| %-18s | %-18s | %-12s | %-15s | %-20s |%n", t.getTitle(), emp.getName(), t.getAccept(), t.getStatus(), t.getDetail());
            }
            
        }
        for (Employee emp : s.getManagers()) {
            for (Task t : emp.getTasks()) {
                System.out.printf("| %-18s | %-18s | %-5s | %-10s | %-20s |%n", t.getTitle(), emp.getName(), t.getAccept(), t.getStatus(), t.getDetail());
            }
            
        }
        for (Task t : s.getAdmin().getTasks()) {
            System.out.printf("| %-18s | %-18s | %-5s | %-10s | %-20s |%n", t.getTitle(), s.getAdmin().getName(), t.getAccept(), t.getStatus(), t.getDetail());
        }
    }

    public void printLine() {
        System.out.println("-----------------------------------------------------");
    }
}
