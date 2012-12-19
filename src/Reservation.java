import java.util.*;
import java.io.*;

/**	Classe : Reservation
*	Méthodes :
*/
public abstract class Reservation implements java.io.Serializable
{
	private Logement logement;
	private String nomloc;
	private int adultes,enfants;
	
	public Reservation (Logement logement,String nomloc,int adultes,int enfants)
	{
		this.logement=logement;
		this.nomloc=nomloc;
		this.adultes=adultes;
		this.enfants=enfants;		
	}
}