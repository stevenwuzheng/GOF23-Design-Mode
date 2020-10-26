package jiegou.adapter;

/*
* 对电脑来说，适配器就相当于一个usb键盘，如果让适配器拥有键盘的功能呢？有2种方式：
* 1.继承：适配器 继承 键盘
* 2.组合：适配器 拥有 键盘 作为属性
* */
public class UsbAdapter extends PS2Keyboard implements Usb { //继承

    @Override
    public void handleComputerInputRequest() {
        System.out.println("usb转换器(继承)---handleComputerInputRequest");
        //this.inputWords(); //调用父类的方法
        super.inputWords();
    }

}
