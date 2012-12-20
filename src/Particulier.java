import java.util.*;
import java.io.*;

/**	Classe : Particulier
*	Méthodes :
* 		Constructeur avec saisie des données
*/
public class Particulier extends Proprietaire
{
	
	/** Constructeur
	*	avec saisie des données
	*/
	public Particulier (String nom)
	{
		super(nom,"Particulier",0);
	}
	
	public void add(Logement logement)
	{
		if (getBiens().size()==0)
		{
			getBiens().add(logement);
		}
		else
		{
			System.out.println("Un particulier ne peut posséder plus d'un logement");
		}
	}
}
