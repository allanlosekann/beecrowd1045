import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Setup
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Input
        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();
        double v3 = sc.nextDouble();

        //Logic
        double a, b, c;
        if (v1 >= v2 && v1 >= v3) {
            a = v1;
            b = Math.max(v2, v3);
            c = Math.min(v2, v3);
        } else if (v2 >= v1 && v2 >= v3) {
            a = v2;
            b = Math.max(v1, v3);
            c = Math.min(v1, v3);
        } else {
            a = v3;
            b = Math.max(v1, v2);
            c = Math.min(v1, v2);
        }

        //Logic and Output
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    } 
}