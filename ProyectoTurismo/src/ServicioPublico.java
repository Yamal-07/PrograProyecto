import java.util.Scanner;

public class ServicioPublico {
    String destino1 = " Lugar: Toro Toro   \nFecha de salida: 01 Julio 2023  \nHora de salida: 6AM  \nDepartamento: Potosi \nTransporte: Furgoneta ";
    String destino2 = " Lugar: Villa Tunari   \nFecha de salida: 03 Julio 2023  \nHora de salida: 7AM  \nDepartamento: Cochabamba \nTransporte: Furgoneta  ";
    String destino3 = " Lugar: Sajama   \nFecha de salida: 10 Julio 2023  \nHora de salida: 8AM  \nDepartamento: Oruro \nTransporte: Furgoneta ";
    String destino4 = " Lugar: Robore   \nFecha de salida: 22 Julio 2023  \nHora de salida: 11PM  \nDepartamento:Santa cruz \nTransporte: Furgoneta ";
    int opcion;
    int eleccion;

    Scanner entradaInt = new Scanner(System.in);


    public ServicioPublico(int opcion) {
        this.opcion = opcion;

    }

    public void eleccionPublico() {
        if (opcion == 2) {
            System.out.println("Usted a elegido un servicio publico por lo cual:");
            System.out.println("Existen paquetes definidos");

            System.out.println("Selecione destino");
            System.out.println("1. Toro Toro");
            System.out.println("2. Villa Tunari");
            System.out.println("3. Parque Nacional Sajama");
            System.out.println("4. Robore");
            System.out.print("Digite opcion => ");
            eleccion = entradaInt.nextInt();

        }
    }

    public void ImprimirServPublico() {
        switch (eleccion) {

            case 1:
                System.out.println("Eligio el destino:" + destino1);
                break;
            case 2:
                System.out.println("Eligio el destino:" + destino2);
                break;
            case 3:
                System.out.println("Eligio el destino:" + destino1);
                break;
            case 4:
                System.out.println("Eligio el destino:" + destino1);
                break;

            default:
                break;

        }
    }
}



