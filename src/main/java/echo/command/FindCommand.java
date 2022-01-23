package echo.command;

import echo.main.EchoException;
import echo.storage.Storage;
import echo.task.TaskList;
import echo.ui.Ui;

/**
 * This class inherits from the Command class and encapsulates the find command.
 */
public class FindCommand extends Command {

    /** String that represents the find command. */
    public static final String COMMAND = "find";

    /** Description of find command. */
    private final String DESCRIPTION;

    /**
     * Constructor for FindCommand.
     *
     * @param description Description of find command.
     */
    public FindCommand(String description) {
        this.DESCRIPTION = description;
    }

    /**
     * Execute command.
     *
     * @param tasks TaskList containing list of tasks.
     * @param ui Ui that deals with user interactions.
     * @param storage Storage deals with loading tasks from the file and saving tasks in the file.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        String find = tasks.find(DESCRIPTION);
        if (find.length() == 0) {
            ui.showCantFind();
        } else {
            ui.showFind(find);
        }
    }
}
