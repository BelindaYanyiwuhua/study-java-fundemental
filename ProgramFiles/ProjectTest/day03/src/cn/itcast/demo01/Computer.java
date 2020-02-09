public class Computer {
    public static void powerOn(){
        System.out.println("笔记本开机");
    }
    public static void powerOff(){
        System.out.println("笔记本关机");
    }

    public static void userDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse =(Mouse) usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard =(Keyboard)usb;
        }
        usb.close();
    }
}
