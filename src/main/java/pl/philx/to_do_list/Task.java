package pl.philx.to_do_list;

public class Task {
    private Long id;
    private String name;
    private boolean isDone;

    public Task() {}

    public Task(Long id, String name, boolean isDone) {
        this.id = id;
        this.name = name;
        this.isDone = isDone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return isDone;
    }
}
