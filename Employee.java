package oopFinalProject;
public class Employee extends User {

    public Employee(String userID, String username, String password) {
        super(userID, username, password);
    }

    @Override
    public void viewTasks() {
        System.out.println("Viewing tasks assigned to " + username);
        // TODO: Implement logic to view tasks
    }

    public void acceptTask(Task task) {
        System.out.println(username + " has accepted the task: " + task.getTaskName());
        // TODO: Implement logic to accept tasks
    }

    public void rejectTask(Task task) {
        System.out.println(username + " has rejected the task: " + task.getTaskName());
        // TODO: Implement logic to reject tasks
    }

    public void updateTaskProgress(Task task, String status) {
        task.updateStatus(status);
        System.out.println(username + " has updated the task: " + task.getTaskName() + " to status " + status);
    }
}
