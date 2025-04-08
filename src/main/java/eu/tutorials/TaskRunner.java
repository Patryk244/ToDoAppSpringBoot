package eu.tutorials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskRunner implements CommandLineRunner {

    private final TaskService taskService;

    public TaskRunner(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Starting TaskRunner ===");

        // Dodajemy kilka zadań
        taskService.addTask("Buy milk");
        taskService.addTask("Finish Spring tutorial");
        taskService.addTask("Walk the dog");

        // Wyświetlamy listę
        taskService.listTasks();

        // Oznaczamy "Buy milk" jako zrobione
        taskService.markTaskAsDone("Buy milk");

        // Ponownie wyświetlamy listę
        taskService.listTasks();

        System.out.println("=== TaskRunner finished ===");
    }
}
