import java.util.Scanner;

public class ServicioPrivado {

    int opcion;
    String fecha;
    String transporte;
    String destino;




    Scanner entradaString = new Scanner(System.in);
    Scanner entradaInt = new Scanner(System.in);

    public ServicioPrivado(int opcion){
        this.opcion=opcion;}


    public void EleccionPrivado() {

        if (opcion == 1) {
            System.out.println("Usted a elegido un servicio privado por lo cual:");

            System.out.println("Escriba fecha de salida:");
            fecha = entradaString.nextLine();

            System.out.println("Escriba tipo de transporte:");
            System.out.println("1. Camioneta <= 6 Personas");
            System.out.println("2. Furgoneta <= 15 Personas");

            transporte = entradaString.nextLine();

            System.out.println("Elija uno de nuestros destinos:");

            System.out.println("1. Toro Toro");
            System.out.println("2. Villa Tunari");
            System.out.println("3. Parque Nacional Sajama");
            System.out.println("4. Robore");
            System.out.print("Escriba opcion => ");
            destino = entradaString.nextLine();




        }
    }

    public void ImprimirServPrivado(){
        if(opcion==1){
            System.out.println("Destino:"+ destino +"\nFecha de salida:"+ fecha +
                    "\nTipo de transporte: " + transporte);
        }



    }
}
