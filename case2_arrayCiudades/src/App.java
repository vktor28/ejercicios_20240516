import java.util.ArrayList;
import java.util.Random;

public class App {
/*
2- Tienes un array o arraylist de 20 ciudades.
Se seleccionan aleatoriamente 3 de ellas y se imprimen. Visualiza
las variables en el debugger. ¿Qué ocurre con el índice del bucle? y
con el número random?
 */
    public static void main(String[] args) throws Exception {
        ArrayList <String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("Londres");
        ciudades.add("Barcelona");
        ciudades.add("Manchester");
        ciudades.add("París");
        ciudades.add("Munich");
        ciudades.add("Buenos Aires");

    Random RanCiudades = new Random();
      int numItems = 3;
      System.out.println("\nLas ciudades seleccionadas son:");
      for (int i = 0; i < numItems; i++) {
         int rndmIndx = RanCiudades.nextInt(ciudades.size());
         String ciudadRandom = ciudades.get(rndmIndx);
         System.out.println(ciudadRandom);
      }

    }
}
