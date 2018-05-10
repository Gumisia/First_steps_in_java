package metody_domyślne;

public class Main {
    public static void main(String[] args) {

        Formula f = (int a) -> {
              return Math.sqrt(a)*2;
        };

        System.out.println(f.calculate(2));
        System.out.println(f.sqrt(3));

        A test = new A(5);
        System.out.println(test.calculate(test.a));


    }

}

interface Formula{
    double calculate(int a); // musi być jedna metoda domyślna na dany interfejs

    default double sqrt(int a){ // motoda domyślna - może mieć właściwąściwą implementacje w ciele interfejsy
        return Math.sqrt(a);
    }
}

class A implements Formula{

    int a;

    A(int a){
        this.a = a;
    }

    @Override
    public double calculate(int a) {
        return this.sqrt(a * 5);
    }
}
