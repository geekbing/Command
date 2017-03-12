package remote.command;

import remote.object.Light;

/**
 * Author: bing
 * Date: 2017-03-12 11:48
 * Email: dhuzbb@163.com
 */

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
