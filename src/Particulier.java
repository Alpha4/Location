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
		super(nom,"Particulier");
	}
	
	/** Constructeur
	*	vide
	*	utilisé pour remonter une abscence de retour :S 
	*/
	public Particulier ()
	{
		this("vide");
	}
	
	/** {@inheritDoc}
	*/
	public void add(Logement logement)
	{
		if (getBiens().size()==0)
		{
			getBiens().add(logement);
			addAccueil(logement.getCapacite());
			addDisp(logement.getCapacite());
		}
		else
		{
			System.out.println("Un particulier ne peut posséder plus d'un logement");
		}
	}
}
