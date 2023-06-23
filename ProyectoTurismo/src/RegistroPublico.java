import java.util.Scanner;

public class RegistroPublico {

    String nombre;
    int ci;
    int nit;
    int celular;
    int cantPersonas;
    int numdías=3;
    int precioDia=250;
    int total=0;
    int opcion;

    Scanner entradaInt=new Scanner(System.in);
    Scanner entradaString=new Scanner(System.in);

    public RegistroPublico(int opcion){
        this.opcion=opcion;
    }

    public void DatosPersonales(){
        if(opcion==2) {
            System.out.println("Ingrese su nombre completo:");
            nombre = entradaInt.nextLine();
            System.out.println("Ingrese su carnet de identidad:");
            ci = entradaInt.nextInt();
            System.out.println("Ingrese su nit para la factura:");
            nit = entradaInt.nextInt();
            System.out.println("Ingrese su celular:");
            celular=entradaInt.nextInt();

            System.out.println("Registrando....");
            System.out.println("                                     ");
            System.out.println("Ya fue registrado =>  AHORA PAGUE ! :D");
            System.out.println("                                    ");
        }
    }
    public void PagoServicio(){
        if(opcion==2){
            System.out.println("El numero de dias de Turismo es: "+ numdías + "dias");
            System.out.println("El precio persona/día:"+ precioDia + "Bs");
            System.out.println("Ingrese cantidad de personas que va viajar:");
            cantPersonas=entradaInt.nextInt();
            total=cantPersonas*precioDia*numdías;
        }
    }
    public void ImprimirDatos(){
        System.out.println("Turista :"+ nombre+
                "\nCarnet de identidad :" + ci +
                "\nNit :"+ nit+
                "\nCelular :" + celular);
    }

    public void ImprimirPrecioTotal(){
        System.out.println("Cantidad de personas :"+ cantPersonas+
                "\nEL numero de dias del tour: "+ numdías+
                "\nEl precio del paquete turistico es:"+total + " Bs");
        System.out.println("---------------------------------------------------------");
        System.out.println("Imprimiendo factura...");
        System.out.println("Listo Bye");

    }
}
