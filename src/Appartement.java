import java.util.Scanner;
import java.util.Random;

/**  Classe : Appartement
*	Méthodes :
*/
public class Appartement extends Logement
{	
	public Appartement (String adresse,int prix)
	{
		super("Appartement",3,adresse,prix);	
	}
	public int calculprix(int nba,int nbe)
	{
		return getPrix();
	}
}
