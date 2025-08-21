package pl.philx.to_do_list;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @GetMapping("/tasks")
    public List<String> getTasks() {
        return List.of("Task1", "Task2", "Task3");
    }
}
