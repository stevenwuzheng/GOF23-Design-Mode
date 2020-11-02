package xingwei.strategy;

import java.util.Arrays;

//策略模式：分离算法，选择实现； Spring切换各种连接池、各种log框架
public class Client {
    public static void main(String[] args) {
        System.out.println("---策略模式，代替switch或if/else..if多分支，或切换算法");
        getPrice(95,100);


        System.out.println("-------------------------------------");


        BigCustomer bigCustomer = new BigCustomer();
        Context context = new Context(bigCustomer);
        context.invokeStrategy(100);

    }




    public static double getPrice(Integer number, double price) {
        if (number < 10) {
            System.out.println("订货数<10k，不打折：" + number);
            return price;
        } else if (number >= 10 && number < 100) {
            System.out.println("10k<=订货数<100k，打9折:" + number);
            return price*0.9;
        } else if (number > 100) {
            System.out.println("订货数>100k，打8折:" + number);
            return price;
        }

        return price;
    }


}