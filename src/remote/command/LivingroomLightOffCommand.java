package remote.command;

import remote.object.Light;

/**
 * Author: bing
 * Date: 2017-03-12 11:48
 * Email: dhuzbb@163.com
 */

public class LivingroomLightOffCommand implements Command {
    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
