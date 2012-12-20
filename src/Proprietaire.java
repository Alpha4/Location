import java.util.*;
import java.io.*;

/**	Classe : Proprietaire
*	Méthodes :
* 		Constructeur avec saisie des données
* 		getNom : retourne le nom du propriétaire
* 		getCa : retourne le chiffre d'affaire du propriétaire
* 		Méthode retournant le nom et le chiffre d'affaire du propriétair
* 		Méthode retournant la liste des logements du propriétaire
*/
public abstract class Proprietaire implements java.io.Serializable
{
	private String nom, type;
	private List <Logement> biens;
	private int ca; //chiffre d'affaire
	
	/** Constructeur
	*	avec saisie des données
	*/
	public Proprietaire (String nom,String type,int ca)
	{
		this.nom=nom;
		this.type=type;
		this.ca=ca;
		this.biens=new Vector <Logement>();
	}
	
	/** getNom : retourne le nom du propriétaire
	* @return nom le nom du propriétaire
	*/
	public String getNom()
	{
		return this.nom;
	}
	
	/** getCa : retourne le chiffre d'affaire du propriétaire
	* @return ca le chiffre d'affaire du propriétaire
	*/
	public int getCa()
	{
		return this.ca;
	}
	
	/** Méthode toString retournant le nom et
	*	le chiffre d'affaire du prorpiétaire
	* @return nom le nom du propriétaire
	* @return ca le chiffre d'affaire du propriétaire
	*/
	public String toString()
	{
		return this.nom + this.ca;
	}
	
	/** Méthode Logement retournant la liste des
	*	logements du prorpiétaire
	* @return logement la liste des logements
	* @see Logement#toString()
	*/
	public String Logement()
	{
		String logement="";
		for (Logement l : biens)
		{
			logement=logement+" "+this.nom+" "+l.toString();
		}
		return logement;
	}
}
