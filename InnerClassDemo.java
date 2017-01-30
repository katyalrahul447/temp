class Outer {
    int a = 10;

    void show() {
        System.out.println("Value of a: "+ a);
        Inner obj = new Inner();
        System.out.println("Value of b: "+ obj.b); 
    }
    class Inner {
        int b = 20;  //instance variable
    }
}


class Main {
    public static void main(String[] arg) {
        Outer obj = new Outer();
    }
}