import java.util.Scanner;

public class StockProducto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}