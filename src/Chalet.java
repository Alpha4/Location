import java.util.Scanner;
import java.util.Random;

/**	Classe : Chalet
*	Méthodes :
*/
public class Chalet extends Logement
{	
	public Chalet (String adresse,int prix)
	{
		super("Chalet",adresse,6,prix);	
	}
	public int calculprix(int nba,int nbe)
	{
		return getPrix();
	}
}
