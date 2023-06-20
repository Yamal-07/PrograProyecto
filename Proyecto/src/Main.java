import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        destinos destino1=new destinos("Tunari","60 km","1 JULIO 2023");

        int op;
        int op1;
        Scanner sc=new Scanner(System.in);

        System.out.println(" Elija destino:");
        System.out.println("1. Tunari ");
        System.out.println("2. Villa Tunari");
        System.out.println("3. Toro Toro");
        System.out.println("4. Ninguno");

        op= sc.nextInt();

        switch(op){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            default:
        }


        System.out.println("Elija tipo de servicio:");
        System.out.println("1. Publico");
        System.out.println("2. Privado");
        op1= sc.nextInt();

        if (op1==1){
            System.out.println("fecha establecida de salida");

        }

        else{
            System.out.println("defina fecha de salida ");
            System.out.println("elija tipo de transporte");
            System.out.println("elija tipo de atencion");
        }





    }
}