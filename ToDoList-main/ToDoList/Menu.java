package ToDoList;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public int getChoice() {
        System.out.println("\n1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public String getTaskName() {
        sc.nextLine();
        System.out.print("Enter task: ");
        return sc.nextLine();
    }

    public int getDeleteIndex() {
        System.out.print("Enter task number to delete: ");
        return sc.nextInt() - 1;
    }
}

