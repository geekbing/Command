package remote.command;

import remote.object.CeilingFan;

/**
 * Author: bing
 * Date: 2017-03-12 11:45
 * Email: dhuzbb@163.com
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }
}
