import java.util.*;
import java.io.*;

/**	Classe : Entreprise
*	Méthodes :
* 		Constructeur avec saisie des données
*/
public class Entreprise extends Proprietaire
{
	
	/** Constructeur
	*	avec saisie des données
	*/
	public Entreprise (String nom)
	{
		super(nom,"Entreprise",0);
	}
	
	public void add(Logement logement)
	{
		getBiens().add(logement);
		addAccueil(logement.getCapacite());
		addDisp(logement.getCapacite());
	}
}
