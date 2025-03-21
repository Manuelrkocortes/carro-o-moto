import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Vehiculo> concesionario = new ArrayList<>();
        boolean estado = true;
        int tipoVehiculo;
        while (estado) {
            System.out.println("""
                    1. AGREGAR VEHICULO
                    2. MOSTRAR VEHICULOS 
                    3. CALCULAR PRECIO FINAL
                    4. SALIR
                    """);
            int op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Seleccione el tipo de vehículo (1: Auto, 2: Moto):");
                    tipoVehiculo= teclado.nextInt();

                    if (tipoVehiculo == 1) { // Agregar un carro
                        System.out.println("Ingrese el número de puertas:");
                        int numeroPuertas = teclado.nextInt();
                        System.out.println("Ingrese la marca del vehículo:");
                        String marca = teclado.next();

                        System.out.println("Ingrese el modelo del vehículo:");
                        String modelo = teclado.next();

                        System.out.println("Ingrese el año del vehículo:");
                      int  año = teclado.nextInt();

                        System.out.println("Ingrese el precio base del vehículo:");
                        double precioBase = teclado.nextDouble();

                        concesionario.add(new auto(marca,modelo,año,    precioBase, numeroPuertas));
                    } else if (tipoVehiculo == 2) { // Agregar una moto
                        System.out.println("Ingrese la cilindrada:");
                        int cilindrada = teclado.nextInt();
                        System.out.println("Ingrese la marca del vehículo:");
                        String marca = teclado.nextLine();

                        System.out.println("Ingrese el modelo del vehículo:");
                        String modelo = teclado.nextLine();

                        System.out.println("Ingrese el año del vehículo:");
                       int año = teclado.nextInt();

                        System.out.println("Ingrese el precio base del vehículo:");
                       double precioBase = teclado.nextDouble();
                        concesionario.add(new moto(marca , modelo , año , precioBase , cilindrada));
                    } else {
                        System.out.println("TIPO DE VEHICULO INVALIDO.");
                    }
                }
                case 2 -> {
                    System.out.println("VEHICULOS REGISTRADOS:");
                    if (concesionario.isEmpty()) {
                        System.out.println("NO HAY VEHICULOS REGISTRADOS.");
                    } else {
                        for (int i = 0; i < concesionario.size(); i++) {
                            System.out.println("VEHICULO #" + (i + 1) + ":");
                            System.out.println(concesionario.get(i).toString()); // Muestra todos los datos del vehículo
                            System.out.println("-----------------------------------");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("PRECIOS FINALES:");
                    if (concesionario.isEmpty()) {
                        System.out.println("NO HAY VEHICULOS REGISTRADOS.");
                    } else {
                        for (Vehiculo vehiculo : concesionario) {
                            System.out.println(vehiculo + ", PRECIO FINAL: " + vehiculo.calcularPrecioFinal());
                        }
                    }
                }
                case 4 -> {
                    estado = false;
                }
                default -> System.out.println("OPCION INVALIDA. INTENTE NUEVAMENTE");
            }
        }

    }
}