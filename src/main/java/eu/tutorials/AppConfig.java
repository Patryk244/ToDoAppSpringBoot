package eu.tutorials;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TaskService taskService() {
        return new TaskService();
    }
}
