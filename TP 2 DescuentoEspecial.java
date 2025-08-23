import java.util.Scanner;

public class DescuentoEspecial {

    // Variable global
    static double descuentoGlobal = 0.10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }

    public static void calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
