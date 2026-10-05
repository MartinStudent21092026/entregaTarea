import java.io.PrintStream;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejercicio5();
    }

    public static void ejercicio1() {
        //Modelos de vehiculos
        String modeloCoche = "Toyota Corolla";
        String modeloMoto = "Honda SH125";
        String modeloPatinete = "Xiaomi Pro 2";
        String modeloFurgonete = "Ford Transit";

        //Número de plazas
        int cantCoche = 5;
        int cantMoto = 2;
        int cantPatinete = 1;
        int cantFurgoneta = 3;

        //Precio por día
        double precioCoche = 35.5;
        double precioMoto = 18.0;
        double precioPatinete = 8.5;
        double precioFurgonete = 50.0;

        //Imprimir en consola
        System.out.println(modeloCoche + " (" + cantCoche + "plazas) - " + precioCoche + " €/día");
        System.out.println(modeloMoto + " (" + cantMoto + "plazas) - " + precioMoto + " €/día");
        System.out.println(modeloPatinete + " (" + cantPatinete + "plazas) - " + precioPatinete + " €/día");
        System.out.println(modeloFurgonete + " (" + cantFurgoneta + "plazas) - " + precioFurgonete + " €/día");

    }

    public static void ejercicio2() {
        //Precio por día
        double precioCoche = 35.5;
        double precioMoto = 18.0;
        double precioPatinete = 8.5;
        double precioFurgonete = 50.0;
        //Numero de vehiculos alquilados
        int alquiCoche = 10;
        int alquiMoto = 15;
        int alquiPatinete = 20;
        int alquiFurgonete = 17;
        //Ingresos totales en un dia
        double total = precioCoche * alquiCoche + precioMoto * alquiMoto + precioPatinete * alquiPatinete + precioFurgonete * alquiFurgonete;
        //Se imprimi en consola los ingresos totales
        System.out.println("Ingresos totales: " + total + " €");
    }

    public static void ejercicio3() {
        String vehiculo = "Ford Transit";
        int uds = 5;
        double subtotal = 250.0;
        double descuento = 10;
        double total = 250 * 0.9;

        System.out.println("Vehículo: " + vehiculo + "\nUnidades: " + uds + "\nSubtotal: " + subtotal + " €\nDescuento: " + descuento +
                "%" + "\nTotal: " + total + " €");

    }

    public static void ejerccio4() {
        //Precio de los vehiculos
        double precioCoche = 35.5;
        double precioMoto = 18.0;
        double precioPatinete = 8.5;
        double precioFurgonete = 50.0;
        //Precio medio
        double precioMedio = (precioCoche + precioMoto + precioPatinete + precioFurgonete) / 4;
        //El precio medio se imprime
        System.out.println("Precio medio: " + precioMedio);
    }

    public static void ejercicio5() {
        //Cantidad de vehiculos alquilados
        int alquiCoche = 10;
        int alquiMoto = 15;
        int alquiPatinete = 20;
        int alquiFurgonete = 17;
        //Total de vehiculos alquilados
        int total = alquiCoche + alquiMoto + alquiPatinete + alquiFurgonete;
        //Codigo para formatear los decimales a 2 digitos
        DecimalFormat df = new DecimalFormat("#.00");
        //Porcentajes de coches alquilados
        double porceCoche = ((double) alquiCoche / total) * 100;
        double porceMoto = ((double) alquiMoto / total) * 100;
        double porcePatinete = ((double) alquiPatinete / total) * 100;
        double porceFurgonete = ((double) alquiFurgonete / total) * 100;
        //Se imprime en consola los porcentajes
        System.out.println("Total de vehiculos: " + total + "\nCoches: " + df.format(porceCoche) + "%\nMotos: " + df.format(porceMoto) + "%\nPatienetes: " + df.format(porcePatinete) + "%\nFurgonete: " + df.format(porceFurgonete) + "%");
    }
}