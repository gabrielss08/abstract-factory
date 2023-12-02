package devices.factories.apple;

public class AppleDeviceFactory implements devices.factories.ElectronicDeviceFactory {
    public devices.Smartphone createSmartphone() {
        return new devices.apple.ApplePhone();
    }

    public devices.Laptop createLaptop() {
        return new devices.apple.AppleLaptop();
    }
}