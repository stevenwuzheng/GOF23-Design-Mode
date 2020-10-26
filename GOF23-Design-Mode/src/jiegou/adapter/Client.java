package jiegou.adapter;

public class Client {
    public static void main(String[] args) {

        UsbAdapter usbAdapter = new UsbAdapter();
        LaptopComputer computer = new LaptopComputer();
        computer.getInputWords(usbAdapter); //对电脑来说，适配器就相当于一个usb键盘


        System.out.println("---------------------------");

        PS2Keyboard keyboard = new PS2Keyboard();  //被适配的对象
        UsbAdapter2 usbAdapter2 = new UsbAdapter2(keyboard); //适配器
        LaptopComputer computer2 = new LaptopComputer(); //需要使用适配器的对象
        computer2.getInputWords(usbAdapter2); //对电脑来说，适配器就相当于一个usb键盘
    }
}
