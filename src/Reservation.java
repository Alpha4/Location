import java.util.*;
import java.io.*;

/**	Classe : Reservation
*	Méthodes :
* 		Constructeur avec saisie des données
* 		Méthode retournant le nom du locataire principal et le prix
*/
public abstract class Reservation implements java.io.Serializable
{
	private List <Logement> logements;
	private String nomloc;
	private int adultes,enfants;
	private String nomprop;
	
	/** Constructeur
	*	avec saisie des données
	*/
	public Reservation (List logements,String nomloc,int adultes,int enfants,String nomprop)
	{
		this.logements=logements;
		this.nomloc=nomloc;
		this.adultes=adultes;
		this.enfants=enfants;
		this.nomprop=nomprop;	
	}
	
	/** Méthode toString retournant le nom du
	*	locataire principal et le prix
	* @return nomloc le nom du locataire principal
	* @return prix le prix du logement
	* @see Logement#calculPrix
	*/
	public String toString()
	{
		int prix=0;
		for (Logement l : logements)
		{
			prix+=l.calculPrix(adultes,enfants)
		}
		return this.nomloc+" "+prix;
	}
	
	/** Méthode toString retournant le nom du
	*	locataire principal et le prix
	* @return nomloc le nom du locataire principal
	* @return prix le prix du logement
	* @see Logement#calculPrix
	*/
	public String propositionToString()
	{
		int prix=0;
		for (Logement l : logements)
		{
			prix+=l.calculPrix(adultes,enfants)
		}
		return this.nomloc+" "+logement.calculPrix(adultes,enfants);
	}
	public void valide()
	{
		//update du booléen des logements
		//update du CA du proprio
	}
}
