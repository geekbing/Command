package simpleremote;

import simpleremote.command.Command;

/**
 * Author: bing
 * Date: 2017-03-12 11:36
 * Email: dhuzbb@163.com
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
