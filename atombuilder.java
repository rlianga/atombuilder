package atombuilder;

import java.util.ArrayList;

public class atombuilder {	
	
	public static int getShellElectrons(int electrons, int shell) { //should 
	//TODO should return # of electrons in corresponding shell. this will be implemented once we start on gui
		return -1;
	}
	
	public static String atomNameStr(Atom atom) { //when saying atom name, say "atomname" + # of protons + neutrons (to account for isotopes), could just be infinitely scalable
		return atom.name + "-" + (atom.protons + atom.neutrons);
	}
	
	public static int getCharge(Atom atom) {
		return atom.protons - atom.electrons; //is this even necessary
	}
	
	public static double getWeight (Atom atom) { //returns in AMU
		return (atom.protons * 1.00727) + (atom.neutrons * 1.00866) + (atom.electrons * 0.000549);
	}
	
	public static void main (String[] args) {
		ArrayList<Atom> periodic = new ArrayList<>(); //index = atomic number = # protons
		
		// (String name, int protons, int neutrons, int group, int period, atomSeries series, int casNumber, double meltingPoint, double boilingPoint, String abbreviation)
		periodic.add(new Atom("Neutronium", 0, 0, 0, 0, atomSeries.Unknown, 12586311, 0, 0, "Nu")); //filling index 0 for simplicity
		periodic.add(new Atom("Hydrogen", 1, 0, 1, 1, atomSeries.Reactive_nonmetal, 1333740, -259.16, -252.879));
		periodic.add(new Atom("Helium", 2, 2, 18, 1, atomSeries.Noble_gas, 7440597, -272.2, -268.928, "He"));
		periodic.add(new Atom("Lithium", 3, 4, 1, 2, atomSeries.Alkali_metal, 7439932, 180.54, 1342, "Li"));
		periodic.add(new Atom("Beryllium", 4, 5, 2, 2, atomSeries.Alkaline_earth_metal, 7440417, 1287, 2470, "Be"));
		
		//need to database everything else (to i assume #118 and then it'll just say "unknown".....
		
		
		/*--------TESTING JUNK--------*/
		Atom displayAtom = periodic.get(1);
		System.out.println(atomNameStr(displayAtom));
		displayAtom.neutrons += 5;
		System.out.println(atomNameStr(displayAtom));
		System.out.println(displayAtom.name + " has " + displayAtom.electrons + " electrons.");
		
		displayAtom = periodic.get(3);
		System.out.println("Atom " + displayAtom.name + " is from group " + Atom.getGroup(displayAtom));
		System.out.println(displayAtom.name + " is from the " + Atom.getBlock(displayAtom) + " block.");

	}
}


//obviously need to add safeguards for invalid inputs for all these functions, but the constructor should be fine as it’s only for databasing 

//i really think we should do gui functionality as this app is gonna be pretty basic otherwise 


/* pretty much just trying to replicate this website 
https://byjus.com/periodic-table/
But with less data per atom and a rudimentary gui display + a procedural atom creator 
*/