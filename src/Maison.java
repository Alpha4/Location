import java.util.Scanner;
import java.util.Random;

/**	Classe : Maison
*	Méthodes :
*/
public class Maison extends Logement
{
	public Maison (String adresse,int prixfixe)
	{
		super("Maison",10,adresse,prixfixe);	
	}
	
	public int calculprix(int nba,int nbe)
	{
		return (int)getPrix()*(nba+(nbe/2));
	}
}
