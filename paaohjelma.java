package projekti;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class paaohjelma {
	public static void main(String[] args) {
// Alustetaan muuttujat
		int valitsin = 0;
		int valinta;
		String nimi;
		String numero;
		Scanner lukija = new Scanner(System.in);
		ArrayList<String> tiedot = new ArrayList<>();
		ArrayList<String> num = new ArrayList<>();
// Lis�t��n nimet ja numerot puhelinluetteloon
		tiedot.add("Matti Koivu");
		tiedot.add("Tomi M�kinen");
		tiedot.add("Jaana Peltonen");
		tiedot.add("Matias Koivula");
		tiedot.add("Pirjo Jaakkola");
		num.add("1234567");
		num.add("1212212");
		num.add("02030203");
		num.add("9293231");
		num.add("1001201");
// Luodaan silmukka alkuvalikkoa varten
		do {
			valitsin = alkumenu();
// Haetaan nimen perusteella, ett� l�ytyyk� nime� puhelinluettolossa. Jos ei l�ydy , niin voidaan lis�t� se sinne.
			if (valitsin == 1) {
				System.out.print("Kirjoita nimi:");
				nimi = lukija.nextLine();
				for (int i = 0; i < tiedot.size(); i++) {
					if (tiedot.contains(nimi)) {
						System.out.println(num.get(i));
						break;
					} else {
						System.out.println("Haluatko lis�t� nimen? K/E");
						String vastaus;
						vastaus = lukija.nextLine();
						if (vastaus.equals("K")) {
								System.out.println("Lis�� nimi:");
							    String nimi2  = lukija.nextLine();
								System.out.println("Lis�� numero:");
								String numero2 = lukija.nextLine();
								tiedot.add(nimi2);
								num.add(numero2);
							break;
						} else {
							break;
						}
					}
				}
// Haetaan numeron perusteella, ett� l�ytyyk� nime� puhelinluettolossa. Jos ei l�ydy , niin voidaan lis�t� se sinne.
			} else if (valitsin == 2) {
				System.out.print("Kirjoita numero:");
				numero = lukija.nextLine();
				for (int i = 0; i < tiedot.size(); i++) {
					if (num.contains(numero)) {
						System.out.println(tiedot.get(i));
						break;
					} else {
						System.out.println("Haluatko lis�t� numeron? K/E");
						String vastaus;
						vastaus = lukija.nextLine();
						if (vastaus.equals("K")) {
								System.out.println("Lis�� nimi:");
							    String nimi2  = lukija.nextLine();
								System.out.println("Lis�� numero:");
								String numero2 = lukija.nextLine();
								tiedot.add(nimi2);
								num.add(numero2);
							break;
						} else {
							break;
						}
					}
				}
// Tulostetaan puhelinluettelon sis�lt�
			} else if (valitsin == 3) {			
				for (int i = 0; i < tiedot.size(); i++) {
				
					System.out.print(tiedot.get(i));
					System.out.println(num.get(i));
					
					
				}
			}
		} while (true);
	}
// Alkuvalikon metodi
// K�ytt�j� voi valita, ett� mink� toiminnon h�n haluaa suorittaa ja palauttaa valinnan p��metodiin
	private static int alkumenu() {
		int valitsin;
		Scanner lukija = new Scanner(System.in);
		System.out.println("Kirjoita numero 1 mik�li haluat hakea nimen perusteella");
		System.out.println("Kirjoita numero 2 mik�li haluat hakea numeron perusteella");
		System.out.println("Kirjoita numero 3 mik�li haluat tulostaa sis�ll�n");
		valitsin = lukija.nextInt();

		return valitsin;
	}
}
