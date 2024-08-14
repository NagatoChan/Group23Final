
import java.util.Date;

public class Task {
    private Employee AssignedTo;
    private int status = 0;
    private String title;
    private String detail;
    private Date timeCreated = new Date();
    private int accepted = 0;
    private static int count = 0;

    // All tasks created must have at least employee and title. 
    // If not, the GUI page will not allow creation of tasks. 
    public Task(Employee emp, String title, String detail) {
        this.AssignedTo = emp;
        this.title = title;
        this.detail = detail;
        count++;
    }

    public Task(Employee emp, String title) {
        this.AssignedTo = emp;
        this.title = title;
        this.detail = "";
        count++;
    }

    public Task() {
        this.title = "Task"+count;
        count++;
    }

    public void setStatus(int newStatus, String name) {
        if (!AssignedTo.getName().equals(name)) {
            return;
        }
        this.status = newStatus;
    }

    public void setAccept(int accept, String name) {
        if (!AssignedTo.getName().equals(name)) {
            return;
        }
        this.accepted = accept;
    }

    public void setDetail(String newDetail) {
        this.detail = newDetail;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        switch (status) {
            case 0:
                return "Not Started";
            case 1:
                return "In Progress";
            case 2:
                return "Completed";
            default:
                throw new AssertionError();
        }
    }

    public String getDetail() {
        return detail;
    }

    public String getAccept() {
        if (accepted == 1) {
            return "Yes";
        } else {
            return "No";
        }
    }

}