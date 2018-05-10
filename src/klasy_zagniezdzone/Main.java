package klasy_zagniezdzone;

public class Main {
    public static void main(String[] args) {

        A zewnetrzna = new A();

        A.B tmp = zewnetrzna.new B();

        A.C tmp2 = new A.C();



    }
}

class A{

    private int test;
    static int test2;

    A() {
        System.out.println("Jestem z klasy zewnetrznej A");
    }

    void cos2(){
//        tmp = 2; nie widzi
        B obj = new B();
    }

    class B{

        private int tmp;
//        static int bla; tylko statyczna klasa zagnieżdżona może mieć ststyczne pole

        public B() {
            System.out.println("Jestem z klasy zagnieżdżonej B");
        }

        void cos(){
            test = 5; //widzi pole klasy A
//            this.test = 5; nie działa this
        }
    }
    static class C{

        static int cal;

        public C() {
            System.out.println("Jestem z klasy zagnieżdżonej C");
        }
    }

}