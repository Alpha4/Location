import java.util.*;
import java.io.*;

/**	Classe : Logement
*	Méthodes :
* 		Constructeur avec saisie
*/
public abstract class Logement implements java.io.Serializable
{
	private String type,adresse;
	private int capacite;
	private int prix;
	
	/**	Constructeur
	* 	avec saisie des données
	*/
	public Logement (String type,int capacite,String adresse,int prix)
	{
		this.type=type;
		this.adresse=adresse;
		this.capacite=capacite;
		this.prix=prix;		
	}
	
	/** getType : retourne le type de Logement
	* @return type le type de Logement
	*/
	public String getType()
	{
		return this.type;
	}
	
	/** getAdresse : retourne l'adresse du Logement
	* @return adresse l'adresse du Logement
	*/
	public String getAdresse()
	{
		return this.adresse;
	}
	
	/** getCapacite : retourne la capacité du Logement
	* @return capacite la capacité du Logement
	*/
	public int getCapacite()
	{
		return this.capacite;
	}
	
	/** getPrix : retourne le prix du Logement
	* @return prix le prix du Logement
	*/
	public int getPrix()
	{
		return this.prix;
	}
	
	public abstract int calculprix(int nba,int nbe);

	
	public String toString()
	{
		return "Le logement de type " + this.type + " à l'adresse " + this.adresse + " peut acceuillir " + this.capacite + " personnes et coûte " + this.prix + " la semaine.";
	}
}
