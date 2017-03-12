package simpleremote.command;

import simpleremote.object.GarageDoor;

/**
 * Author: bing
 * Date: 2017-03-12 11:34
 * Email: dhuzbb@163.com
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
