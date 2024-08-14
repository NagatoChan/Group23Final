import java.util.Scanner;

public class Admin extends Manager{
    private String name;
    private int level = 2;
    private String password;

    public Admin(String name, String password, int level){
        super(name, password, level);
    }

    public void addUser(USystem s) {
        printLine();
        System.out.println("Enter new user name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Enter new password: ");
        String password = in.nextLine();
        System.out.println("Is this user a manager? (Y/N)");
        String isManager = in.nextLine();
        if (isManager.equals("Y") && addManager(s, name, password) > 0){

        } else if (addEmployee(s, name, password) > 0){
            
        } else {
            System.out.println("User name already taken!");
        }
        
    }

    public int addEmployee(USystem s, String name, String password) {
        if (s.addName(name) < 0) {
            return -1;
        }
        Employee emp = new Employee(name, password);
        s.addEmployee(emp);
        return 1;
    }

    public int addManager(USystem s, String name, String password) {
        if (s.addName(name) < 0) {
            return -1;
        }
        Manager man = new Manager(name, password);
        s.addManager(man);
        return 1;
    }

    public void printLine() {
        System.out.println("-----------------------------------------------------");
    }
}