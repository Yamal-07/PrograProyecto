import java.util.Scanner;

public class MetodoPago {
    String tipoPago;
    int op;

    Scanner entradaString=new Scanner(System.in);
    Scanner entradaInt=new Scanner(System.in);


    public void TipodePago(){
        System.out.println("-----------------METODO DE PAGO---------------------------");
        System.out.println("1. Pago online");
        System.out.println("2. Pago contado");
        System.out.println("Digite opcion =>");
        op=entradaInt.nextInt();
        switch(op){
            case 1:
                System.out.println("Eligio el metodo de pago en linea:");
                System.out.println("Enviaremos Factura digital a su correo electronico");
                System.out.println("Gracias...!");
                System.out.println("Listo Bye");
                break;
            case 2:
                System.out.println("Pase por nuestras instalaciones para el pago correspondiente");
                System.out.println("Gracias");
                System.out.println("Listo Bye");
        }

    }
}
