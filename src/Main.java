import java.io.PrintStream;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejercicio3();
    }

    public static void ejercicio1() {
        //Modelos de vehículos
        String modeloCoche = "Toyota Corolla";
        String modeloMoto = "Honda SH125";
        String modeloPatinete = "Xiaomi Pro 2";
        String modeloFurgoneta = "Ford Transit";

        //Número de plazas
        int plazaCoche = 5;
        int plazaMoto = 2;
        int plazaPatinete = 1;
        int plazaFurgoneta = 3;

        //Precio del alquiler de vehiculos por dia
        double precioCoche = 35.5;
        double precioMoto = 18.0;
        double precioPatinete = 8.5;
        double precioFurgoneta = 50.0;

        //Imprimir en consola
        System.out.println("COCHE: " + modeloCoche + " (" + plazaCoche + " plazas) - " + precioCoche + " €/día");
        System.out.println("MOTO: " + modeloMoto + " (" + plazaMoto + " plazas) - " + precioMoto + " €/día");
        System.out.println("PATINETE: " + modeloPatinete + " (" + plazaPatinete + " plazas) - " + precioPatinete + " €/día");
        System.out.println("FURGONETA: " + modeloFurgoneta + " (" + plazaFurgoneta + " plazas) - " + precioFurgoneta + " €/día");

    }

    public static void ejercicio2() {
        //Precio del alquiler de vehículos por dia
        double precioCoche = 35.5;
        double precioMoto = 18.0;
        double precioPatinete = 8.5;
        double precioFurgoneta = 50.0;
        //Numero de vehículos alquilados
        int alquiCoche = 10;
        int alquiMoto = 15;
        int alquiPatinete = 20;
        int alquiFurgoneta = 17;
        //Ingresos totales en un dia
        double total = precioCoche * alquiCoche + precioMoto * alquiMoto + precioPatinete * alquiPatinete + precioFurgoneta * alquiFurgoneta;
        //Se imprime en consola los ingresos totales
        System.out.println("Ingresos totales: " + total + " €");
    }

    public static void ejercicio3() {
        //Se declara las variables
        String vehiculo = "Ford Transit";
        final double DESCUENTO = 0.9;
        int uds = 5;
        double precioFurgoneta = 50.0;
        double subtotal = precioFurgoneta * uds;
        double total = 250 * DESCUENTO;
        //Se imprime
        System.out.println("Vehículo: " + vehiculo + "\nUnidades: " + uds + "\nSubtotal: " + subtotal + " €\nDescuento: 10%" + "\nTotal: " + total + " €");

    }

    public static void ejercicio4() {
        //Precio del alquiler de vehículos por dia
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
        //Cantidad de vehículos alquilados
        int alquiCoche = 10;
        int alquiMoto = 15;
        int alquiPatinete = 20;
        int alquiFurgoneta = 17;
        //Total de vehículos alquilados
        int total = alquiCoche + alquiMoto + alquiPatinete + alquiFurgoneta;
        //Codigo para formatear los decimales a 2 digitos
        DecimalFormat df = new DecimalFormat("#.0");
        //Porcentajes de coches alquilados
        double porceCoche = ((double) alquiCoche / total) * 100;
        double porceMoto = ((double) alquiMoto / total) * 100;
        double porcePatinete = ((double) alquiPatinete / total) * 100;
        double porceFurgoneta = ((double) alquiFurgoneta / total) * 100;
        //Se imprime en consola los porcentajes
        System.out.println("Total vehículos: " + total + "\nCoches: " + df.format(porceCoche) + "%\nMotos: " + df.format(porceMoto) + "%\nPatinetes: " + df.format(porcePatinete) + "%\nFurgonetas: " + df.format(porceFurgoneta) + "%");
    }
}