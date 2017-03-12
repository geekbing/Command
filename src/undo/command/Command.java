package undo.command;

/**
 * Author: bing
 * Date: 2017-03-12 14:19
 * Email: dhuzbb@163.com
 */
public interface Command {

    void execute();

    void undo();
}
