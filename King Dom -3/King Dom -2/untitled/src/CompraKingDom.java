import java.util.ArrayList;

public class CompraKingDom {
    public static void main(String[] args) {
     Empleado cajero=new Empleado("Claudia", 1256743, 7034567, "claudia@gmail.com", 0001 );
        System.out.println(cajero.toString());
     Empleado operador1=new Empleado("Ruben", 1283843, 7078464, "ruben@gmail.com", 0002);
        System.out.println(operador1.toString());
     Empleado operador2=new Empleado("Danilo", 4283122, 6530004, "danilo@gmail.com", 0003);
        //System.out.println(operador2.toString());

     Cliente comprador1=new Cliente("Juan C", 27263636);
     Cliente comprador2=new Cliente("Dario C", 12345677);
     Cliente comprador3=new Cliente("Cathe V", 536356);
        System.out.println(comprador1.toString());

     CuartoPollo compra1=new CuartoPollo("Normal", "Aplica", "Aplica", "1/4 Pollo", "Aplica");
     MedioPollo compra2= new MedioPollo("Normal", "Aplica", "Aplica", "1/2 Pollo", "Aplica");
     SoloMedio compra3=new SoloMedio("No aplica", "Aplica", "Aplica", "1/2 Pollo", "No Aplica");
        //System.out.println(compra1.toString());
        ArrayList<SuperMenu> carrito = new ArrayList<>();
        carrito.add(compra1);
        carrito.add(compra2);
        carrito.add(compra3);
        for (SuperMenu datos:carrito) {
            System.out.println(datos.toString());
        }

    }
}
