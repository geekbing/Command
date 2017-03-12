package remote.command;

import remote.object.Hottub;

/**
 * Author: bing
 * Date: 2017-03-12 11:47
 * Email: dhuzbb@163.com
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }
}

