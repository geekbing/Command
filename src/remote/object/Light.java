package remote.object;

/**
 * Author: bing
 * Date: 2017-03-12 11:42
 * Email: dhuzbb@163.com
 */
public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
