import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0); // Para aceptar minúsculas también

        double descuento = 0;

        if (categoria == 'A') {
            descuento = 0.10;
        } else if (categoria == 'B') {
            descuento = 0.15;
        } else if (categoria == 'C') {
            descuento = 0.20;
        } else {
            System.out.println("Categoría no válida.");
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
