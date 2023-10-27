import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorN=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un numero: ");
            int numero = sc.nextInt();
            if (numero<0) {
                contadorN++;
            }
        }
        if (contadorN>0){
            System.out.println("Hay un total de "+ contadorN + " numeros negativos");
        }else{
            System.out.println("No hay numeros negativos");
        }


    }
}
