import java.util.Scanner;

public class cliente {

    private String nombre;
    private int ci;
    private String email;
    private int nit;
    private int celular;

    Scanner entradaInt=new Scanner(System.in);
    Scanner entradaString= new Scanner(System.in);
    static void registrar(){

        System.out.println("Ingrese mombre del cliente: ");
        nombre=entradaString.nextLine();

    }


}



