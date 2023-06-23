import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;


        Scanner entradaInt=new Scanner(System.in);

        System.out.println("------------EMPRESA DE TURISMO--------------------");
        System.out.println("Que tipo de servicio desea:");
        System.out.println("--------------------------------------------------");
        System.out.println("Servicio Privado: Digite el numero 1");
        System.out.println("Servicio Publico: Digite el numero 2");
        System.out.println("--------------------------------------------------");

        opcion=entradaInt.nextInt();

        if(opcion==1) {
            ServicioPrivado Servicio1 = new ServicioPrivado(opcion);
            Servicio1.EleccionPrivado();
            RegistroPrivado Registro1=new RegistroPrivado(opcion);
            System.out.println("--------------REGISTRO CLIENTE--------------------------");
            Registro1.DatosPersonales();
            System.out.println("---------------PAGO SERVICIOS----------------------------");
            Registro1.PagoServicio();
            System.out.println("---------------RESULTADOS DE LA COMPRA--------------------");
            Registro1.ImprimirDatos();
            Servicio1.ImprimirServPrivado();
            Registro1.ImprimirPrecioTotal();
            MetodoPago TipoPago1=new MetodoPago();
            TipoPago1.TipodePago();
        }
        if(opcion==2){
            ServicioPublico Servicio2=new ServicioPublico(opcion);
            Servicio2.eleccionPublico();
            RegistroPublico Registro2=new RegistroPublico(opcion);
            System.out.println("--------------REGISTRO CLIENTE--------------------------");
            Registro2.DatosPersonales();
            System.out.println("---------------PAGO SERVICIOS----------------------------");
            Registro2.PagoServicio();
            System.out.println("---------------RESULTADOS DE LA COMPRA--------------------");
            Registro2.ImprimirDatos();
            Servicio2.ImprimirServPublico();
            Registro2.ImprimirPrecioTotal();
            MetodoPago TipoPago2=new MetodoPago();
            TipoPago2.TipodePago();

        }


    }
}