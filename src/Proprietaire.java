import java.util.*;
import java.io.*;

/**	Classe : Proprietaire
*	Méthodes :
* 		Constructeur avec saisie des données
* 		getNom : retourne le nom du propriétaire
* 		getCa : retourne le chiffre d'affaire du propriétaire
* 		toString : retournant le nom et le chiffre d'affaire du propriétaire
* 		toStringLogement: retournant la liste des logements du propriétaire
* 		addAccueil : mise à jour de la capacite d'accueil
*		addDisp : mise à jour de la disponibilité
*		getRatio : renvoie le ratio du proprietaire
*		getDisp : renvoie la disponibilité
*		getBiens : renvoie la liste des biens du proprietaire
*		add : méthode permttant d'ajouter un logement au proprietaire
*/
public abstract class Proprietaire implements java.io.Serializable
{
	private String nom, type; // nom du propriétaire, son type : particulier ou entreprise
	private List <Logement> biens; //liste des logements que possède le propriétaire
	private int ca,accueil,disp; //chiffre d'affaire, capacite d'accueil totale, capacite disponible
	
	/** Constructeur
	*	avec saisie des données
	*/
	public Proprietaire (String nom,String type)
	{
		this.nom=nom;
		this.type=type;
		this.ca=0;
		this.biens=new Vector <Logement>();
		this.accueil=0;
		this.disp=0;
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
	
	/** addCa : mets à jour le chiffre d'affaire du propriétaire
	* @return ca le chiffre d'affaire du propriétaire
	*/
	public void addCa(int gain)
	{
		ca+=gain;
	}
		
	/** addAccueil : permet de mettre à jour la capacité d'accueil d'un propriétaire
	* utile lors de l'ajout d'un logement à la liste biens
	*/
	public void addAccueil(int nb)
	{
		accueil=accueil+nb;
	}
	
	/** addDisp: permet de mettre à jour la capacité disponible d'un propriétaire
	* utile lors de l'ajout d'un logement à la liste biens
	*/
	public void addDisp(int nb)
	{
		disp+=nb;
	}
	
	/** getRatio : retourne le ratio CA/capacité d'accueil du propriétaire
	* @return accueil retourne la capacité d'accueil du propriétaire
	*/
	public int getRatio()
	{
		return this.ca/this.accueil;
	}
	
	/** getDisp : retourne la capacite d'acceuil disponible du propriétaire
	* @return accueil retourne la capacité d'accueil du propriétaire
	*/
	public int getDisp()
	{
		return this.disp;
	}
	
	/** getBiens : retourne la liste des biens du propriétaire
	* @return biens la liste des biens du propriétaire
	*/
	public List<Logement> getBiens()
	{
		return this.biens;
	}
	
	/** Méthode toString retournant le nom et
	*	le chiffre d'affaire du prorpiétaire
	* @return nom le nom du propriétaire
	* @return ca le chiffre d'affaire du propriétaire
	*/
	public String toString()
	{
		return this.nom + " "+this.ca;
	}
	
	/** Méthode toStringLogement retournant la liste des
	*	logements du propriétaire
	* @return logement la liste des logements
	* @see Logement#toString()
	*/
	public String toStringLogement()
	{
		String logement="";
		for (Logement l : biens)
		{
			logement=logement+this.nom+" "+l.toString()+"\n";
		}
		return logement;
	}
	
	/** Méthode add
	*	permet d'ajouter un logement
	*	s'il n'y en a pas déjà un dans le cas du particulier
	*	@see Proprietaire#getBiens()
	*	@see Proprietaire#addAccueil()
	*	@see Proprietaire#addDisp()
	*	@see Logement#getCapacite()
	*/
	public abstract void add(Logement logement);
}
