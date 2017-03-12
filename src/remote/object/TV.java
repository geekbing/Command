package remote.object;

/**
 * Author: bing
 * Date: 2017-03-12 11:43
 * Email: dhuzbb@163.com
 */
public class TV {
    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println("Channel is set for VCR");
    }
}
