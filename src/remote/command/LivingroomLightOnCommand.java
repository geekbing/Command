package remote.command;

import remote.object.Light;

/**
 * Author: bing
 * Date: 2017-03-12 11:49
 * Email: dhuzbb@163.com
 */

public class LivingroomLightOnCommand implements Command {
    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

