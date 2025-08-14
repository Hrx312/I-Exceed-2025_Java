import java.time.LocalDate;
import java.util.ArrayList;

public class taskmanagement {

    private ArrayList<task> tasks = new ArrayList<>();

    public void addTask(String name, LocalDate dueDate) {
        tasks.add(new task(name, dueDate));
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markTaskDone(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.get(index - 1).markDone();
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.remove(index - 1);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
