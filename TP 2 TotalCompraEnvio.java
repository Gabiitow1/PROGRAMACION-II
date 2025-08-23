import java.util.Scanner;

public class TotalCompraEnvio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();

        scan.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scan.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona no válida, se asume Nacional.");
            return peso * 5;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
