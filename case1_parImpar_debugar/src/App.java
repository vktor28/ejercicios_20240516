import java.util.Scanner;

public class App {
    /*
    1- Par o impar? Multiplica!
El usuario entra dos números. Se hace un bucle del primero al segundo,
y si es par, multiplica por dos, si es impar multiplica por tres.

Mostrar todos los resultados, y decir de la serie inicial cuántos son
impares y cuántos son pares (debe dar la misma cantidad o uno de diferencia).
     */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---MULTIPLICACIÓN---");
        System.out.println("introduce el primer número");
        int num1=teclado.nextInt();
        teclado.nextLine();
        System.out.println("introduce el segudno número");
        int num2=teclado.nextInt();
        teclado.nextLine();
        for(int i=num1; i<=num2; i++)
        {
            int operacion;
            if (i % 2 == 0) {
                operacion=i*2;
                System.out.println(operacion + " era el num par: "+i);

            } else {
                operacion=i*3;
                System.out.println(operacion + " era el num impar: " + i);}
        }
}
}