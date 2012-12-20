import java.util.*;
import java.io.*;

/**	Classe : Chalet
*	Méthodes :
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
	
	/** Méthode permettant de calculer le prix en fonction
	*	du nombre d'enfants et d'adultes
	* @return prix le prix
	* @see Logement#getPrix()
	*/
	public int calculprix(int nba,int nbe)
	{
		return getPrix();
	}
}
