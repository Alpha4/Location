import java.io.*;
import java.util.*;
   
public class SerializerLogement {
   
  public static void main(String argv[]) {
    Maison a=new Maison("La Davière",50);
    Logement b=new Chalet("balbla",500);
    try {
      FileOutputStream fichier = new FileOutputStream("logement.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fichier);
      oos.writeObject(a);
      oos.writeObject(b);
      oos.flush();
      oos.close();
    }
    catch (java.io.IOException e) {
      e.printStackTrace();
    }
  }
}