import java.util.Scanner;
import java.util.Random;

/**
*Projet de TP : Gestion d'un tournoi de tennis de table 
* @author Aurelien Brisseau et Hippolyte Gandon
* @version 2.4
*/

public class Main
{

	/* Programme principal*/
	public static void main (String[] args)
	{
		/*Initialisation*/
		Maison a=new Maison("La Davière",50);
		int test=a.calculprix(3,4);
		System.out.println(test);
		Logement b=new Chalet("balbla",500);
		test=b.calculprix(0,0);
		System.out.println(test);
	}
}	
