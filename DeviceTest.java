import java.util.ArrayList;
public class DeviceTest {
    public static void main(String[] args){
        Device device1 = new Smartphone("Apple", "Iphone", 7);
        Device device2 = new Smartphone("Android", "Phone", 7);
        Device device3 = new Laptop("Lenovo", "Yoga", "Intel Ultra 5");
        Device device4 = new Laptop("Asus", "ZenBook", "Intel Ultra 7");
        ArrayList<Device> list = new ArrayList<Device>();
        list.add(device1);
        list.add(device2);
        list.add(device3);
        list.add(device4);
        System.out.println("Electronic Device");
        System.out.println("-----------------");
        System.out.println("");
        for (Device device: list){
            device.turnOn();
            System.out.println();
        }
    }
}
