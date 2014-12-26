package callout;

import java.util.Random;

public class Students {
	
	private static String[] names = new String[]{
		"Sanela",
		"Jesenko",
		"Emir",
		"Davor",
		"Selma",
		"Adnan",
		"Haris K",
		"Gordan",
		"Mirza",
		"Nermin V",
		"Vedad",
		"Emina",
		"Nedim",
		"Hikmet",
		"Nermin G",
		"Neldin",
		"Edib++",
		"Haris A",
		"Nedžad",
		"Gorjan",
		"Amra"
	};
	
	public String getRandomStudent(){
		Random r = new Random();
		return names[r.nextInt(names.length)];
	}

}
