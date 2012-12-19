import java.util.Scanner;
import java.util.Random;

/**
*Projet de TP : Gestion d'un parc de logements 
* @author Aurelien Brisseau et Hippolyte Gandon
* @version 2.4
*/


/*
	Lecture d'un fichier contenant la description des proprio
	Saisie des demandes de location
	modification du CA à la validation
	Affichage réservations avec nom du locataire et prix
	Affichage proprios avec CA

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
