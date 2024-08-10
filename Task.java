package oopFinalProject;
public class Task {
    private String taskName;
    private String taskDescription;
    private String assignedTo;
    private String status; // e.g., "Not Started", "In Progress", "Completed"

    public Task(String taskName, String taskDescription, String assignedTo) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.assignedTo = assignedTo;
        this.status = "Not Started";
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
