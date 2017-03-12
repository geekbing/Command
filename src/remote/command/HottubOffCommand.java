package remote.command;

import remote.object.Hottub;

/**
 * Author: bing
 * Date: 2017-03-12 11:47
 * Email: dhuzbb@163.com
 */

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
