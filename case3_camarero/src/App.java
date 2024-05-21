import java.util.Scanner;

public class App {

/*
 * 3- Eres el camarero/a de un bar de copas. Mientras
 * siga sonando la música, vas por las mesas preguntando si quieren
 * tomar algo más. SI NO SUENA LA MUSICA NO LES PREGUNTAS MAS. Si la gente 
 * te dice que sí quieren tomar algo más, sigues preguntando a otros si quieren tomar algo más.
 * Si alguien te dice que no, dejas de preguntar si quieren algo más
 * (aunque siga sonando la música).
 * 
 */
    public static void main(String[] args) throws Exception {
        boolean musica=true;
        Scanner teclado = new Scanner(System.in);
        boolean ventaSugentiva=true;
        if(musica){System.out.println("--> Música: LALALALAALA...");}
        while (ventaSugentiva) {
            System.out.println("¿Quieren toma algo?(SI/NO)");
            if(teclado.nextLine().equalsIgnoreCase("SI")){
                musica=true;
            }else{
                System.out.println("Gracia, sigan disfrutando de la música.");
                ventaSugentiva=false;
            }
            
        }
    }
}
