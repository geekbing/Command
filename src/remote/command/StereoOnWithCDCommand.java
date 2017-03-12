package remote.command;

import remote.object.Stereo;

/**
 * Author: bing
 * Date: 2017-03-12 11:50
 * Email: dhuzbb@163.com
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
