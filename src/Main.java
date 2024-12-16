import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Rando del numero aleatorio
        int min = 1;
        int max = 100;

        // Generar el numero aleatorio
        int numAleatorio = random.nextInt(max - min + 1) + min;

        // Variable para contar los intentos
        int intentos = 0;
        int numUsuario;

        System.out.println("****Adivina el número****");
        System.out.println("Tienes que adivinar el número entre " + min + " y " + max + ".");

        do{
            System.out.println("Introduce un numero: ");
            numUsuario = scanner.nextInt();
            intentos++;

            if(numUsuario < numAleatorio){
                System.out.println("El número es mayor. Intentalo de nuevo");
            } else if (numUsuario > numAleatorio) {
                System.out.println("El número es menor. Intentalo de nuevo");
            }else{
                System.out.print("¡Felicidades! Has acertado el número en "+ intentos + " intentos.");
            }

        }while (numUsuario != numAleatorio);

        scanner.close();
    }
}