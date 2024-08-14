import java.util.ArrayList;

public class USystem {
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Manager> managers = new ArrayList<Manager>();
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String> taskNames = new ArrayList<String>();
    private Admin admin = new Admin("Bob", "admin", 2);

    public USystem(){
        names.add("Bob");
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void addEmployee(Employee emp){
        this.employees.add(emp);
    }

    public void addManager(Manager man){
        this.managers.add(man);
    }

    public int addName(String name){
        if (names.contains(name)) {
            return -1;
        }
        names.add(name);
        return 1;
    }

    public int addTaskName(String name) {
        if (taskNames.contains(name)) {
            return -1;
        }
        taskNames.add(name);
        return 1;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public Admin getAdmin() {
        return admin;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public Employee searchEmployeeByName(String name) {
        for (Employee e: employees){
            if (e.getName().equals(name)){
                return e;
            }
        }
        for (Manager m: managers) {
            if (m.getName().equals(name)){
                return m;
            }
        }
        return admin;
    }

    public Manager searchManagerByName(String name) {
        for (Manager m: managers) {
            if (m.getName().equals(name)){
                return m;
            }
        }
        return admin;
    }
}