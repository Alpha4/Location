import java.util.*;
import java.io.*;

/**	Classe : ListeResa
*	Méthodes :
* 		Constructeur avec saisie des données
* 		
*/
public class ListeResa implements java.io.Serializable
{
	private List <Reservation> resas;
	
	/** Constructeur
	*	avec saisie des données
	*/
	public ListeResa ()
	{
		this.resas=new Vector <Reservation>();
	}
	
	public String toString()
	{
		String str="";
		for (Reservation r : resas)
		{
			str=str+r.toString();
		}
		return str;
	}
	
	public void add(Reservation res)
	{
		resas.add(res);
	}
	
	public void serializer()
	{
		try 
		{	
			FileOutputStream fichier = new FileOutputStream("reserv.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);
			oos.writeObject(this);
			oos.flush();
			oos.close();
		}
		catch (java.io.IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
