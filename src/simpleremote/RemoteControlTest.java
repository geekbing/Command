package simpleremote;

import simpleremote.command.GarageDoorOpenCommand;
import simpleremote.command.LightOnCommand;
import simpleremote.object.GarageDoor;
import simpleremote.object.Light;

/**
 * Author: bing
 * Date: 2017-03-12 11:37
 * Email: dhuzbb@163.com
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageOpen);
        remoteControl.buttonWasPressed();
    }
}
