package eu.tutorials;

public class Task {
    private final String name;
    private boolean done;

    public Task(String name) {
        this.name = name;
        this.done = false;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", done=" + done +
                '}';
    }
}
