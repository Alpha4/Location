import java.util.*;
import java.io.*;

/**	Classe : Chalet
*	Méthodes :
*/
public class Chalet extends Logement
{	
	public Chalet (String adresse,int prix)
	{
		super("Chalet",6,adresse,prix);	
	}
	public int calculprix(int nba,int nbe)
	{
		return getPrix();
	}
}
