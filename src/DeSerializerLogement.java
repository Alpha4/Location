import java.io.*;

public class DeSerializerLogement {

  public static void main(String argv[]) {
    try {
      FileInputStream fichier = new FileInputStream("logement.ser");
      ObjectInputStream ois = new ObjectInputStream(fichier);
      Logement logement = (Logement) ois.readObject();
      Logement log=(Logement) ois.readObject();
      System.out.println(logement.toString());
      System.out.println(log.toString());
    } 
    catch (java.io.IOException e) {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
   }
}