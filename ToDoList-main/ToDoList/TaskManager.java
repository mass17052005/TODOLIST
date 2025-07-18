package ToDoList;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> list = new ArrayList<>();

    public void add(String name) {
        list.add(new Task(name));
    }

    public void show() {
        if (list.isEmpty()) {
            System.out.println("No tasks.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i).name);
            }
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid number.");
        }
    }
}
