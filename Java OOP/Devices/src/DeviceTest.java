import com.phone.*;
import com.*;
public class DeviceTest {
    public static void main(String[] args) {
        Device d1=new Device();
        Phone p1=new Phone();
        System.out.println( d1.getStatus());
        System.out.println(p1.makeCall());
        System.out.println(p1.makeCall());
        System.out.println(p1.makeCall());
        System.out.println(p1.playGame());
        System.out.println(p1.playGame());
        System.out.println(p1.playGame());
        System.out.println(p1.playGame());
        System.out.println(p1.phoneCharging());
        System.out.println(p1.playGame());


    }
}
