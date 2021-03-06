import java.util.*;
import java.io.*;

/**  Classe : Appartement
*	Méthodes :
* 		Constructeur avec saisie et données automatique
* 		Méthode de calcul du prix en fonction du nombre d'adultes (nba) et d'enfants (nbe)
*/
public class Appartement extends Logement
{	
	
	/** Constructeur
	*	avec saisie de l'adresse et du prix
	*	et automatisation du type et de la capacité
	* @see Logement#Logement(String type, int capacite, String adresse, int prix)
	*/
	public Appartement (String adresse,int prix)
	{
		super("Appartement",3,adresse,prix);	
	}
	
	/** Constructeur
	*	vide
	*	utilisé pour remonter une abscence de retour :S 
	* @see Logement#Logement(String type, int capacite, String adresse, int prix)
	*/
	public Appartement ()
	{
		super("vide",3,"vide",0);	
	}
	
	/** {@inheritDoc}
	*/
	public int calculPrix(int nba,int nbe)
	{
		return getPrix();
	}
}
