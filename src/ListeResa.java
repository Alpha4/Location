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
	
	/** Méthode toString retournant 
	* 	toutes les réservations (nom du locataire, prix)
	* @see Reservation#toString()  
	*/
	public String toString()
	{
		String str="Nom|Prix\n";
		for (Reservation r : resas)
		{
			str=str+r.toString()+"\n";
		}
		return str;
	}
	
	/** Méthode add  
	* 	ajoute la réservation à la liste et la valide
	* @see Reservation#valide()  
	*/
	public void add(Reservation res)
	{
		res.valide();
		resas.add(res);
	}
	
	/** Méthode serializer
	* 	écrit l'objet dans un fichier  
	*/
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
