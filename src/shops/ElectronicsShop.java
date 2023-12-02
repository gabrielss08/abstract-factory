package shops;

public class ElectronicsShop {
    private devices.factories.ElectronicDeviceFactory deviceFactory;
    private devices.Smartphone smartphone;
    private devices.Laptop laptop;

    public ElectronicsShop(devices.factories.ElectronicDeviceFactory factory) {
        deviceFactory = factory;
        smartphone = deviceFactory.createSmartphone();
        laptop = deviceFactory.createLaptop();
    }

    public void displayProducts() {
        smartphone.displayInfo();
        laptop.displayInfo();
    }

    public static void main(String[] args) {
        // Escolhendo a factory para dispositivos Apple
        devices.factories.ElectronicDeviceFactory appleFactory = new devices.factories.apple.AppleDeviceFactory();
        ElectronicsShop appleShop = new ElectronicsShop(appleFactory);
        appleShop.displayProducts();

        // Escolhendo a factory para dispositivos Samsung
        devices.factories.ElectronicDeviceFactory samsungFactory = new devices.factories.samsung.SamsungDeviceFactory();
        ElectronicsShop samsungShop = new ElectronicsShop(samsungFactory);
        samsungShop.displayProducts();
    }
}
