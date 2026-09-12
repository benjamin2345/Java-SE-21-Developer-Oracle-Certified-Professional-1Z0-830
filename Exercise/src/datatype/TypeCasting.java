package datatype;

public class TypeCasting {

    public static void main(String[] args){

        int a = 124;
        long b = a;
        double d = b;

        System.out.println("int value : " + a);
        System.out.println("long value : " + b);
        System.out.println("double value : " + d);

        double dbl = 135.35;
        long lng = (long) dbl; //es necesario realizar un encasillamiento por que el tipo long es mas pequenio que el tipo doble
        byte byt = (byte) lng;

        System.out.println("--------------------------");
        System.out.println("double value : " + dbl);
        System.out.println("long value : " + lng);
        System.out.println("byte value : " + byt);  //-121 es por que se esta perdiendo informacion
    }
}
