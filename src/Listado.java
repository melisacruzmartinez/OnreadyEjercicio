import java.util.ArrayList;
import java.util.Collections;

public class Listado {

    static void listaStock() {
        ArrayList<Vehiculo> listadoVehiculos = new ArrayList<Vehiculo>();

        Auto auto1 = new Auto("Peugeot", "206", 200000.0, 4);
        Moto moto1 = new Moto("Honda", "Titan", 60000.0, 125);
        Auto auto2 = new Auto("Peugeot", "208", 250000.0, 5);
        Moto moto2 = new Moto("Yamaha", "YBR", 80500.50, 160);

        listadoVehiculos.add(auto1);
        listadoVehiculos.add(moto1);
        listadoVehiculos.add(auto2);
        listadoVehiculos.add(moto2);

        Vehiculo vehiculoY = new Vehiculo("marca", "modelo", 0.0);

        for (Vehiculo vehiculo : listadoVehiculos) {
            // Se puede imprimir el resultado de dos formas
            // System.out.println(listadoVehiculos);
            System.out.println(vehiculo.toString());
            if (vehiculo.getModelo().contains("Y")) {
                vehiculoY = vehiculo;
            }

        }

        // con collection sort ordenamos la lista.
        Collections.sort(listadoVehiculos);
        Vehiculo vehiculoCaro = listadoVehiculos.get(listadoVehiculos.size() - 1);
        Vehiculo vehiculoBarato = listadoVehiculos.get(0);
        System.out.println("\n" + "==================================" + "\n");

        if (vehiculoCaro.getPrecio() == vehiculoBarato.getPrecio()) {
            System.out.println("Parece que todos los precios son iguales");

        } else {
            System.out.println("Vehiculo mas caro: " + vehiculoCaro.getMarca() + " " + vehiculoCaro.getModelo());
            System.out.println("Vehiculo mas barato: " + vehiculoBarato.getMarca() + " " + vehiculoBarato.getModelo());
        }


        System.out.println("Vehiculo que contiene en el modelo la letra 'Y':  " + vehiculoY.getMarca() + " "
                + vehiculoY.getModelo() + " $" + vehiculoY.getPrecio());
        System.out.println("\n" + "==================================" + "\n");
        System.out.println("Vehiculos ordenados por precio de mayor a menor: " );

        Collections.reverse(listadoVehiculos);
        for (Vehiculo vehiculo : listadoVehiculos) {

            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
        }

    }

}
