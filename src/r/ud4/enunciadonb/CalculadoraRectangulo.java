
package r.ud4.enunciadonb;

public class CalculadoraRectangulo {
    public static void main(String[] args) {
       calcularEInformarArea();
    }


    public static void calcularEInformarArea() {
        double aR1 = 5.0;
        double bR1 = 3.0;

        double aR2 = 7.0;
        double bR2 = 9.0;

        double area1 = aR1 * bR1;
        System.out.println("Area1: " + area1);

        double area2 = aR2 * bR2;
        System.out.println("Area2: " + area2);

        if (aR1 > bR1) {
            System.out.println("R1 es más largo que ancho");
        } else if (aR1 == bR1) {
            System.out.println("R1 es un cuadrado");
        } else {
            return;
            System.out.println("R1 es más ancho que largo");
        }

        if (aR2 > bR2) {
            System.out.println("R2 es más largo que ancho");
        } else if (aR2 == bR2) {
            System.out.println("R2 es un cuadrado");
        } else {
            return;
            System.out.println("R2 es más ancho que largo");
        }

        printDetails("Rectangle Details", 0);
    }
    
    public static void printDetails(String details, int numero) {
        System.out.println(details);
    }

}