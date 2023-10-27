public class Ejercicio8 {
    public static void main(String[] args) {
        int sumaPares=0,sumaImpares=0;
        for (int i = 100; i <=200 ; i++) {
            if(i%2==0){
                sumaPares  += i;
            }else{
                sumaImpares += i;
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }
}
