package party.command;

/**
 * Author: bing
 * Date: 2017-03-12 14:45
 * Email: dhuzbb@163.com
 */
public interface Command {
    void execute();

    void undo();
}
