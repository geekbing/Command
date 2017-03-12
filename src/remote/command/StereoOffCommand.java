package remote.command;

import remote.object.Stereo;

/**
 * Author: bing
 * Date: 2017-03-12 11:49
 * Email: dhuzbb@163.com
 */

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
