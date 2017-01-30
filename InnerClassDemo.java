class Outer {
   static int a = 10;

//    void disp() {
//        Inner in = new Inner();
//        in.show();
//    }
   static class Inner {   
        int b = 20;  //instance variable
        static void show() {
            System.out.println("Value of a: "+ a);
            System.out.println("Value of b: "+ b); 
        }        
    }
}


class Main {
    public static void main(String[] arg) {
        // Outer out = new Outer();
        // out.disp();
        // Outer.Inner in = out.new Inner();
        // in.show();

        Outer.Inner in1 = new Outer.Inner();
        // in1.show();
    }
}