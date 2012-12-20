import java.util.Scanner;
import java.util.Random;

/**  Classe : Appartement
*	Méthodes :
* 		Constructeur avec saisie et données automatique
* 		Méthode de calcul du prix en fonction du nombre d'adultes et d'enfants
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
	
	/** {@inheritDoc}
	*/
	public int calculprix(int nba,int nbe)
	{
		return getPrix();
	}
}
