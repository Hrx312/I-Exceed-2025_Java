import java.time.LocalDate;

public class task {

    private String name;
    private boolean done;
    private LocalDate dueDate;

    public task(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.done = false;
    }

    public void markDone() {
        this.done = true;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
         String status = done ? "[\u2713]" : "[\u2717]";
        String dateInfo = done ? "Completed" : "Due: " + dueDate;
        return status + " " + name + " (" + dateInfo + ")";
    }
}
