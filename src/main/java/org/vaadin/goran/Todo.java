package org.vaadin.goran;

/**
 * A class that has information of a todo name and it's status.
 */
public class Todo {

    private String description;
    private boolean done;

    public Todo(String description) {
        this.description = description;
    }

    public Todo(String description, boolean completed) {
        this.description = description;
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
