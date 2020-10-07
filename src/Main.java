public class Main {
    String operate(String a, Main.MyInterface op) {
        return op.myFunction(a);
    }

    interface MyInterface {
        String myFunction(String text);

    }
    public static void main(String[] args) {
        Student student1 = new Student("Janko", "Hrasko", 34);

        Main main =new Main();

        MyInterface upperCase = name -> name.toUpperCase();
        MyInterface length = name -> String.valueOf(name.length());
        MyInterface inicial = name -> String.valueOf(name.charAt(0));

        System.out.println(main.operate(student1.getFname(), upperCase));
        System.out.println(main.operate(student1.getFname(), length));
        System.out.println(main.operate(student1.getFname(), inicial));

    }
}
