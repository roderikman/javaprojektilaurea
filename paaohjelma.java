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
// Lisätään nimet ja numerot puhelinluetteloon
		tiedot.add("Matti Koivu");
		tiedot.add("Tomi Mäkinen");
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
// Haetaan nimen perusteella, että löytyykö nimeä puhelinluettolossa. Jos ei löydy , niin voidaan lisätä se sinne.
			if (valitsin == 1) {
				System.out.print("Kirjoita nimi:");
				nimi = lukija.nextLine();
				for (int i = 0; i < tiedot.size(); i++) {
					if (tiedot.contains(nimi)) {
						System.out.println(num.get(i));
						break;
					} else {
						System.out.println("Haluatko lisätä nimen? K/E");
						String vastaus;
						vastaus = lukija.nextLine();
						if (vastaus.equals("K")) {
								System.out.println("Lisää nimi:");
							    String nimi2  = lukija.nextLine();
								System.out.println("Lisää numero:");
								String numero2 = lukija.nextLine();
								tiedot.add(nimi2);
								num.add(numero2);
							break;
						} else {
							break;
						}
					}
				}
// Haetaan numeron perusteella, että löytyykö nimeä puhelinluettolossa. Jos ei löydy , niin voidaan lisätä se sinne.
			} else if (valitsin == 2) {
				System.out.print("Kirjoita numero:");
				numero = lukija.nextLine();
				for (int i = 0; i < tiedot.size(); i++) {
					if (num.contains(numero)) {
						System.out.println(tiedot.get(i));
						break;
					} else {
						System.out.println("Haluatko lisätä numeron? K/E");
						String vastaus;
						vastaus = lukija.nextLine();
						if (vastaus.equals("K")) {
								System.out.println("Lisää nimi:");
							    String nimi2  = lukija.nextLine();
								System.out.println("Lisää numero:");
								String numero2 = lukija.nextLine();
								tiedot.add(nimi2);
								num.add(numero2);
							break;
						} else {
							break;
						}
					}
				}
// Tulostetaan puhelinluettelon sisältö
			} else if (valitsin == 3) {			
				for (int i = 0; i < tiedot.size(); i++) {
				
					System.out.print(tiedot.get(i));
					System.out.println(num.get(i));
					
					
				}
			}
		} while (true);
	}
// Alkuvalikon metodi
// Käyttäjä voi valita, että minkä toiminnon hän haluaa suorittaa ja palauttaa valinnan päämetodiin
	private static int alkumenu() {
		int valitsin;
		Scanner lukija = new Scanner(System.in);
		System.out.println("Kirjoita numero 1 mikäli haluat hakea nimen perusteella");
		System.out.println("Kirjoita numero 2 mikäli haluat hakea numeron perusteella");
		System.out.println("Kirjoita numero 3 mikäli haluat tulostaa sisällön");
		valitsin = lukija.nextInt();

		return valitsin;
	}
}
