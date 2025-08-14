
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Scanner;


public class App {

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        taskmanagement manager = new taskmanagement();

        while (true) {
            System.out.println("-----To Do List-----");
            System.out.print("1. Add\n2. View\n3. Done\n4. Delete\n5. Exit\nChoice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String taskName = sc.nextLine();
                    System.out.print("Enter due date (YYYY-MM-DD): ");
                    LocalDate dueDate = LocalDate.parse(sc.nextLine());
                    manager.addTask(taskName, dueDate);
                      try (BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("sample2.txt"))) {
                        System.out.print("Saved task: ");
                        String str = "Task: " + taskName + " | Duedate: " + dueDate;
                        bout.write(str.getBytes());
                        bout.close();
                    }
                    try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("sample2.txt"))) {
                        int i;
                        while ((i = bin.read()) != -1) {
                            System.out.print((char) i);
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    System.out.print("Task number to mark done: ");
                    manager.markTaskDone(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Task number to delete: ");
                    manager.deleteTask(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
