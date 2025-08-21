package pl.philx.to_do_list;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public Task addTask(String taskName) {
        Long taskId = counter.incrementAndGet();
        Task task = new Task(taskId, taskName, false);
        tasks.put(taskId, task);
        return task;
    }

    public Map<Long, Task> getAllTasks() {
        return tasks;
    }

    public Task getTask(Long id) {
        return tasks.get(id);
    }

    public Task completeTask(Long id) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setDone(true);
        }
        return task;
    }

    public void deleteTask(Long id) {
        tasks.remove(id);
    }
}
