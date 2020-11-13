package sample;
import java.util.Scanner;
public class Controller {
    // Mi edad es 41, cuyos restos son..... dividido entre 3=2, entre 5=1 y entre 7=6
    public static void main(String[] args) {
        String botName = "JavaBot";
        int birthYear = 2020;
        System.out.println("Hola, mi nombre es "+botName+"\n y fui creado el 5 de Octubre del "+birthYear+" \nen clase de programación de Rafa");
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, dime, ¿cuál es tu nombre? ");
        String name = input.nextLine();
        System.out.println("Qué nombre tan bonito tienes, "+name+"!");
        System.out.println("Déjame adivinar tu edad, "+name);
        System.out.println("Para ello, ingresa, primero, el resto de dividir tu edad entre 3");
        int remainder3 = input.nextInt();
        System.out.println("Ahora, el resto de dividir tu edad entre 5");
        int remainder5 = input.nextInt();
        System.out.println("Y por último, el resto de dividir tu edad entre 7");
        int remainder7 = input.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println(name+", tienes "+age+" años, ¿cierto?");
    }
}