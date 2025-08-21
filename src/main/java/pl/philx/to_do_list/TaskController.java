package pl.philx.to_do_list;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return List.of(new Task(0L, "Task1", false), new Task(1L, "Task2", true));
    }
}
