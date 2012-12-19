import java.io.*;

public class DeSerializerPersonne {

  public static void main(String argv[]) {
    try {
      FileInputStream fichier = new FileInputStream("logement.ser");
      ObjectInputStream ois = new ObjectInputStream(fichier);
      Logement logement = (Logement) ois.readObject();
      System.out.println(logement.toString()));
    } 
    catch (java.io.IOException e) {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
   }
}