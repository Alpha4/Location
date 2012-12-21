import java.util.*;
import java.io.*;

/**	Classe : Chalet
*	Méthodes :
* 		Constructeur avec saisie et données automatique
* 		Méthode de calcul du prix en fonction du nombre d'adultes (nba) et d'enfants (nbe)
*/
public class Chalet extends Logement
{	
	
	/** Constructeur
	*	avec saisie de l'adresse et du prix
	*	et automatisation du type et de la capacité
	* @see Logement#Logement(String type, int capacite, String adresse, int prix)
	*/
	public Chalet (String adresse,int prix)
	{
		super("Chalet",6,adresse,prix);	
	}
	
	/** {@inheritDoc}
	*/
	public int calculPrix(int nba,int nbe)
	{
		return getPrix();
	}
}
