public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.powerOn();
        USB usb = new Mouse();
        computer.powerOff();
        computer.userDevice(usb);
    }
}
