package eu.tutorials;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String name) {
        tasks.add(new Task(name));
        System.out.println("Task added: " + name);
    }

    public void markTaskAsDone(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                task.setDone(true);
                System.out.println("Task marked as done: " + name);
                return;
            }
        }
        System.out.println("Task not found: " + name);
    }
    public void listTasks() {
        System.out.println("----- Current tasks -----");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("-------------------------");
    }
}
