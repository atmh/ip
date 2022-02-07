package echo.task;

/**
 * Encapsulates a task.
 */
public class Task {
    /** Description of task. */
    protected final String DESCRIPTION;

    /** Status of task. */
    private boolean isDone;

    /**
     * Constructor for Task class.
     *
     * @param desc Description of task.
     */
    public Task(String desc) {
        this.DESCRIPTION = desc;
        this.isDone = false;
    }

    /**
     * Marks task.
     */
    public void mark() {
        this.isDone = true;
    }

    /**
     * Unmarks task.
     */
    public void unmark() {
        this.isDone = false;
    }

    /**
     * Returns status icon of task.
     *
     * @return String representing the status of task.
     */
    private String getStatusIcon() {
        return isDone ? "X" : " ";
    }

    /**
     * String representation of task for saving.
     *
     * @return String representation of task for saving.
     */
    public String saveFormat() {
        int isDoneInt = isDone ? 1 : 0;
        return String.format("%s | %s", isDoneInt, DESCRIPTION);
    }

    /**
     * String representation of task.
     *
     * @return String representation of task.
     */
    @Override
    public String toString() {
        return String.format("[%s] %s", this.getStatusIcon(), DESCRIPTION);
    }
}
