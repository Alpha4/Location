import java.util.*;
import java.io.*;

/**	Classe : Proprietaire
*	Méthodes :
*/
public abstract class Proprietaire implements java.io.Serializable
{
	private String nom, type;
	private List <Logement> proprietes;
	private int ca; //chiffre d'affaire
	
	public Proprietaire (String nom,String type,int ca)
	{
		this.nom=nom;
		this.type=type;
		this.ca=ca;
		this.proprietes=new Vector <Logement>();
	}
	
}
