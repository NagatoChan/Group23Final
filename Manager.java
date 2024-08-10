package oopFinalProject;
public class Manager extends Employee {

    public Manager(String userID, String username, String password) {
        super(userID, username, password);
    }

    public void assignTask(Employee employee, Task task) {
        System.out.println(username + " has assigned the task: " + task.getTaskName() + " to " + employee.getUsername());
        // TODO: Implement logic to assign tasks to employees
    }

    public void editTask(Task task, String newDescription) {
        task.updateStatus(newDescription);
        System.out.println(username + " has updated the task description to: " + newDescription);
        // TODO: Implement logic to edit tasks
    }

    @Override
    public void viewTasks() {
        System.out.println("Viewing all tasks assigned by " + username);
        // TODO: Implement logic to view tasks
    }
}
