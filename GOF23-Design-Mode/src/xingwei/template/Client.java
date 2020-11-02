package xingwei.template;


//模板模式：jdbcTemplate 在抽象父类中预先定义好需要的步骤和顺序，具体的每一步可以交由子类来实现
public class Client {
    public static void main(String[] args) {

        ///单独创建一个类继承抽象类，就是为了实现抽象方法
        GovermentTemplate template = new DrawMoney();
        template.process();


        System.out.println("-----------------------------");



        ///需要单独创建一个类来继承抽象类，或者实现接口方法时，此时就可以使用匿名内部类(只使用一次)，来实现抽象类或接口的钩子方法
        GovermentTemplate template1 = new GovermentTemplate() {
            @Override
            protected void handleBusiness() {
                System.out.println("办业务：我有100w，现在要存钱!!");
            }
        };
        template1.process();

    }
}
