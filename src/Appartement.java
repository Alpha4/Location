import java.util.Scanner;
import java.util.Random;

/**  Classe : Appartement
*	Méthodes :
*/
public class Appartement extends Logement
{	
	
	/** Constructeur
	*	avec saisie de l'adresse et du prix
	*	et automatisation du type et de la capacité
	* @see Logement#Logement
	*/
	public Appartement (String adresse,int prix)
	{
		super("Appartement",3,adresse,prix);	
	}
	
	/** Méthode permettant de calculer le prix en fonction
	*	du nombre d'enfants et d'adultes
	* @return prix le prix
	* @see getPrix#Logement
	*/
	public int calculprix(int nba,int nbe)
	{
		return getPrix();
	}
}
