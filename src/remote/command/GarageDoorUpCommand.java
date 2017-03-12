package remote.command;

import remote.object.GarageDoor;

/**
 * Author: bing
 * Date: 2017-03-12 11:46
 * Email: dhuzbb@163.com
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
