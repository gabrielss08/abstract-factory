package devices.factories.samsung;

public class SamsungDeviceFactory implements devices.factories.ElectronicDeviceFactory {
    public devices.Smartphone createSmartphone() {
        return new devices.samsung.SamsungPhone();
    }

    public devices.Laptop createLaptop() {
        return new devices.samsung.SamsungLaptop();
    }
}