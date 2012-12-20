import java.util.*;
import java.io.*;

/**	Classe : Maison
*	Méthodes :
*/
public class Maison extends Logement
{	
	
	/** Constructeur
	*	avec saisie de l'adresse et du prix
	*	et automatisation du type et de la capacité
	* @see Logement#Logement(String type, int capacite, String adresse, int prix)
	*/
	public Maison (String adresse,int prixfixe)
	{
		super("Maison",10,adresse,prixfixe);	
	}
	
	/** Méthode permettant de calculer le prix en fonction
	*	du nombre d'enfants et d'adultes
	* @return prix le prix
	* @see Logement#getPrix()
	* @param nba nombre d'adultes
	* @param nbe nombre d'enfants
	*/
	public int calculprix(int nba,int nbe)
	{
		return (int)getPrix()*(nba+(nbe/2));
	}
}
