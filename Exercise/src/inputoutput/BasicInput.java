package inputoutput;

import java.util.Scanner;

public class BasicInput {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //System.out.println("Please enter a number: ");
        System.out.println("Please enter a text: ");
        //int number = input.nextInt();
        //String text = input.next();
        //System.out.println("Your entered : " + input.nextInt());
        //System.out.println("You entered " + input.next());
        System.out.println("You entered " + input.nextLine());
        //tenemos que cerrar el objeto escaner utilizando el metodo close
        input.close();
    }
}
