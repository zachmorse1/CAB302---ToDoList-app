public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description

    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsDone() {
        return this.isDone;
    }


    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }
    // Add getters and setters for each field
}

