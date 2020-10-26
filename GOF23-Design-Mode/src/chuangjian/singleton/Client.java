package chuangjian.singleton;

public class Client {
    public static void main(String[] args) {

        int i = 3;
        switch (i) {
            case 1:
                test1();
                break;
            case 2:
                test2();
                break;
            case 3:
                test3();
                break;
            case 4:
                test4();
                break;
        }

    }


    private static void test1() {
        SingleDemo1 single1 = SingleDemo1.shared();
        System.out.println("---single1 = " + single1);
        SingleDemo1 single2 = SingleDemo1.shared();
        System.out.println("---single2 = " + single2);
    }

    private static void test2() {
        SingleDemo2 single1 = SingleDemo2.shared();
        System.out.println("---single1 = " + single1);
        SingleDemo2 single2 = SingleDemo2.shared();
        System.out.println("---single2 = " + single2);
    }

    private static void test3() {
        SingleDemo3 single1 = SingleDemo3.shared();
        System.out.println("---single1 = " + single1);
        SingleDemo3 single2 = SingleDemo3.shared();
        System.out.println("---single2 = " + single2);
    }

    private static void test4() {
        SingleDemo4 single1 = SingleDemo4.SHARED;
        System.out.println("---single1 = " + single1);
        SingleDemo4 single2 = SingleDemo4.SHARED;
        System.out.println("---single2 = " + single2);
    }

}
