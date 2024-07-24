import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner cb = new Scanner(System.in);
        int[] numeros = new int[4];
        boolean aritmetica = true;

        for (int i = 0; i < 4; i++) {
    
            System.out.println("Ingrese el numero "+(i+1));
            numeros[i]=cb.nextInt();

            
        }
        int resultado = numeros[1] - numeros[0] ;
        for (int i = 1; i < numeros.length-1    ; i++) {
            if (numeros[i+1]-numeros[i]!=resultado) {
                aritmetica = false;
        
        }
        if (aritmetica) {
            System.out.println("La cadena es aritmetica");
        }else{
            System.out.println("Lacadena no es aritmetica");
        }
    }
}
