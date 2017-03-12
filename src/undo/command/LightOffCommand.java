package undo.command;


import undo.object.Light;

/**
 * Author: bing
 * Date: 2017-03-12 14:23
 * Email: dhuzbb@163.com
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
