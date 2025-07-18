package ToDoList;

public class ToDoListApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Menu menu = new Menu();
        int choice;

        do {
            choice = menu.getChoice();
            if (choice == 1) {
                String task = menu.getTaskName();
                manager.add(task);
                System.out.println("Task added.");
            } else if (choice == 2) {
                manager.show();
            } else if (choice == 3) {
                int index = menu.getDeleteIndex();
                manager.delete(index);
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
