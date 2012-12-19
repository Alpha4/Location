import java.util.*;
import java.io.*;

/**	Classe : Proprietaire
*	Méthodes :
*/
public abstract class Proprietaire implements java.io.Serializable
{
	private String nom, type;
	private List <Logement> biens;
	private int ca; //chiffre d'affaire
	
	public Proprietaire (String nom,String type,int ca)
	{
		this.nom=nom;
		this.type=type;
		this.ca=ca;
		this.biens=new Vector <Logement>();
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getCa()
	{
		return this.ca;
	}
	
	public String toString()
	{
		return this.nom + this.ca;
	}
	
	public String Logement()
	{
		String logement="";
		for (Logement l : biens)
		{
			logement=logement+" "+this.nom+" "+l.toString();
		}
		return logement;
	}
}
