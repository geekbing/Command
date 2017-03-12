package simpleremote.command;

import simpleremote.object.Light;

/**
 * Author: bing
 * Date: 2017-03-12 11:35
 * Email: dhuzbb@163.com
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
