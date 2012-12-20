import java.util.*;
import java.io.*;

/**	Classe : Reservation
*	Méthodes :
* 		Constructeur avec saisie des données
* 		Méthode retournant le nom du locataire principal et le prix
*/
public abstract class Reservation implements java.io.Serializable
{
	private Logement logement;
	private String nomloc;
	private int adultes,enfants;
	
	/** Constructeur
	*	avec saisie des données
	*/
	public Reservation (Logement logement,String nomloc,int adultes,int enfants)
	{
		this.logement=logement;
		this.nomloc=nomloc;
		this.adultes=adultes;
		this.enfants=enfants;		
	}
	
	/** Méthode toString retournant le nom du
	*	locataire principal et le prix
	* @return nomloc le nom du locataire principal
	* @return prix le prix du logement
	* @see Logement#getPrix
	*/
	public toString()
	{
		return this.nomloc+
	}
}
