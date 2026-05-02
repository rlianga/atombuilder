package atombuilder;

import java.util.ArrayList;

import javax.swing.JFrame;

import java.lang.Math;

public class atombuilder {	
	
	public static ArrayList<Atom> populateAtomList(ArrayList<Atom> list) {
		//String name, int protons, int neutrons, int group, int period, atomSeries series, int casNumber, double meltingPoint, double boilingPoint, String abbreviation
		list.add(new Atom("Neutronium", 0, 0, 0, 0, atomSeries.Unknown, 12586311, 0, 0, "Nu")); //filling index 0 for simplicity
		list.add(new Atom("Hydrogen", 1, 0, 1, 1, atomSeries.Reactive_nonmetal, 1333740, -259.16, -252.879));
		list.add(new Atom("Helium", 2, 2, 18, 1, atomSeries.Noble_gas, 7440597, -272.2, -268.928, "He"));
		list.add(new Atom("Lithium", 3, 4, 1, 2, atomSeries.Alkali_metal, 7439932, 180.54, 1342, "Li"));
		list.add(new Atom("Beryllium", 4, 5, 2, 2, atomSeries.Alkaline_earth_metal, 7440417, 1287, 2470, "Be"));
		list.add(new Atom("Boron", 5, 6, 13, 2, atomSeries.Metalloid, 7440428, 2075, 4000));
		list.add(new Atom("Carbon", 6, 6, 14, 2, atomSeries.Reactive_nonmetal, 7440440, 3550, 4827));
		list.add(new Atom("Nitrogen", 7, 7, 15, 2, atomSeries.Reactive_nonmetal, 7727379, -210.0, -195.79));
		list.add(new Atom("Oxygen", 8, 8, 16, 2, atomSeries.Reactive_nonmetal, 7782447, -218.79, -182.95));
		list.add(new Atom("Fluorine", 9, 10, 17, 2, atomSeries.Reactive_nonmetal, 7782414, -219.67, -188.11));
		list.add(new Atom("Neon", 10, 10, 18, 2, atomSeries.Noble_gas, 7440019, -248.59, -246.08, "Ne"));
		list.add(new Atom("Sodium", 11, 12, 1, 3, atomSeries.Alkali_metal, 7440235, 97.79, 883, "Na"));
		list.add(new Atom("Magnesium", 12, 12, 2, 3, atomSeries.Alkaline_earth_metal, 7439954, 650, 1090, "Mg"));
		list.add(new Atom("Aluminium", 13, 14, 13, 3, atomSeries.Post_transition_metal, 7429905, 660.32, 2470, "Al"));
		list.add(new Atom("Silicon", 14, 14, 14, 3, atomSeries.Metalloid, 7440213, 1414, 3265, "Si"));
		list.add(new Atom("Phosphorus", 15, 16, 15, 3, atomSeries.Reactive_nonmetal, 7723140, 44.15, 280.5));
		list.add(new Atom("Sulfur", 16, 16, 16, 3, atomSeries.Reactive_nonmetal, 7704349, 115.21, 444.6));
		list.add(new Atom("Chlorine", 17, 18, 17, 3, atomSeries.Reactive_nonmetal, 7782505, -101.5, -34.04, "Cl"));
		list.add(new Atom("Argon", 18, 22, 18, 3, atomSeries.Noble_gas, 7440371, -189.34, -185.85, "Ar"));
		list.add(new Atom("Potassium", 19, 20, 1, 4, atomSeries.Alkali_metal, 7440097, 63.5, 759));
		list.add(new Atom("Calcium", 20, 20, 2, 4, atomSeries.Alkaline_earth_metal, 7440702, 842, 1484, "Ca"));
		list.add(new Atom("Scandium", 21, 24, 3, 4, atomSeries.Transition_metal, 7440202, 1541, 2836, "Sc"));
		list.add(new Atom("Titanium", 22, 26, 4, 4, atomSeries.Transition_metal, 7440326, 1668, 3287, "Ti"));
		list.add(new Atom("Vanadium", 23, 28, 5, 4, atomSeries.Transition_metal, 7440622, 1910, 3407));
		list.add(new Atom("Chromium", 24, 28, 6, 4, atomSeries.Transition_metal, 7440473, 1907, 2671, "Cr"));
		list.add(new Atom("Manganese", 25, 30, 7, 4, atomSeries.Transition_metal, 7439965, 1246, 2061, "Mn"));
		list.add(new Atom("Iron", 26, 30, 8, 4, atomSeries.Transition_metal, 7439896, 1538, 2862, "Fe"));
		list.add(new Atom("Cobalt", 27, 32, 9, 4, atomSeries.Transition_metal, 7440484, 1495, 2927, "Co"));
		list.add(new Atom("Nickel", 28, 31, 10, 4, atomSeries.Transition_metal, 7440020, 1455, 2913, "Ni"));
		list.add(new Atom("Copper", 29, 35, 11, 4, atomSeries.Transition_metal, 7440508, 1084.62, 2562, "Cu"));
		list.add(new Atom("Zinc", 30, 35, 12, 4, atomSeries.Transition_metal, 7440666, 419.53, 907, "Zn"));
		list.add(new Atom("Gallium", 31, 39, 13, 4, atomSeries.Post_transition_metal, 7440553, 29.76, 2403, "Ga"));
		list.add(new Atom("Germanium", 32, 41, 14, 4, atomSeries.Metalloid, 7440564, 938.25, 2820, "Ge"));
		list.add(new Atom("Arsenic", 33, 42, 15, 4, atomSeries.Metalloid, 7440382, 817, 613, "As"));
		list.add(new Atom("Selenium", 34, 45, 16, 4, atomSeries.Reactive_nonmetal, 7782492, 221, 685, "Se"));
		list.add(new Atom("Bromine", 35, 45, 17, 4, atomSeries.Reactive_nonmetal, 7726956, -7.2, 58.8, "Br"));
		list.add(new Atom("Krypton", 36, 48, 18, 4, atomSeries.Noble_gas, 7439909, -157.36, -153.22, "Kr"));
		list.add(new Atom("Rubidium", 37, 48, 1, 5, atomSeries.Alkali_metal, 7440177, 39.31, 688, "Rb"));
		list.add(new Atom("Strontium", 38, 50, 2, 5, atomSeries.Alkaline_earth_metal, 7440246, 777, 1382, "Sr"));
		list.add(new Atom("Yttrium", 39, 50, 3, 5, atomSeries.Transition_metal, 7440655, 1526, 3336));
		list.add(new Atom("Zirconium", 40, 51, 4, 5, atomSeries.Transition_metal, 7440677, 1855, 4409, "Zr"));
		list.add(new Atom("Niobium", 41, 52, 5, 5, atomSeries.Transition_metal, 7440031, 2477, 4744, "Nb"));
		list.add(new Atom("Molybdenum", 42, 54, 6, 5, atomSeries.Transition_metal, 7439987, 2623, 4639, "Mo"));
		list.add(new Atom("Technetium", 43, 55, 7, 5, atomSeries.Transition_metal, 7440268, 2157, 4265, "Tc"));
		list.add(new Atom("Ruthenium", 44, 57, 8, 5, atomSeries.Transition_metal, 7440188, 2334, 4150, "Ru"));
		list.add(new Atom("Rhodium", 45, 58, 9, 5, atomSeries.Transition_metal, 7440166, 1964, 3695, "Rh"));
		list.add(new Atom("Palladium", 46, 60, 10, 5, atomSeries.Transition_metal, 7440053, 1554.9, 2963, "Pd"));
		list.add(new Atom("Silver", 47, 61, 11, 5, atomSeries.Transition_metal, 7440224, 961.78, 2162, "Ag"));
		list.add(new Atom("Cadmium", 48, 64, 12, 5, atomSeries.Transition_metal, 7440439, 321.07, 767, "Cd"));
		list.add(new Atom("Indium", 49, 66, 13, 5, atomSeries.Post_transition_metal, 7440746, 156.6, 2072, "In"));
		list.add(new Atom("Tin", 50, 69, 14, 5, atomSeries.Post_transition_metal, 7440315, 231.93, 2602, "Sn"));
		list.add(new Atom("Antimony", 51, 71, 15, 5, atomSeries.Metalloid, 7440360, 630.63, 1587, "Sb"));
		list.add(new Atom("Tellurium", 52, 76, 16, 5, atomSeries.Metalloid, 13494809, 449.51, 988, "Te"));
		list.add(new Atom("Iodine", 53, 74, 17, 5, atomSeries.Reactive_nonmetal, 7553562, 113.7, 184.3));
		list.add(new Atom("Xenon", 54, 77, 18, 5, atomSeries.Noble_gas, 7440633, -111.8, -108.0, "Xe"));
		list.add(new Atom("Cesium", 55, 78, 1, 6, atomSeries.Alkali_metal, 7440462, 28.44, 671, "Cs"));
		list.add(new Atom("Barium", 56, 81, 2, 6, atomSeries.Alkaline_earth_metal, 7440393, 727, 1870, "Ba"));
		list.add(new Atom("Lanthanum", 57, 82, 3, 6, atomSeries.Lanthanide, 7439910, 920, 3464, "La"));
		list.add(new Atom("Cerium", 58, 82, 3, 6, atomSeries.Lanthanide, 7440451, 795, 3443, "Ce"));
		list.add(new Atom("Praseodymium", 59, 82, 3, 6, atomSeries.Lanthanide, 7440109, 935, 3520, "Pr"));
		list.add(new Atom("Neodymium", 60, 84, 3, 6, atomSeries.Lanthanide, 7440008, 1024, 3074, "Nd"));
		list.add(new Atom("Promethium", 61, 84, 3, 6, atomSeries.Lanthanide, 7440121, 1042, 3000, "Pm"));
		list.add(new Atom("Samarium", 62, 88, 3, 6, atomSeries.Lanthanide, 7440193, 1072, 1900, "Sm"));
		list.add(new Atom("Europium", 63, 89, 3, 6, atomSeries.Lanthanide, 7440531, 826, 1529, "Eu"));
		list.add(new Atom("Gadolinium", 64, 93, 3, 6, atomSeries.Lanthanide, 7440542, 1312, 3273, "Gd"));
		list.add(new Atom("Terbium", 65, 94, 3, 6, atomSeries.Lanthanide, 7440279, 1356, 3230, "Tb"));
		list.add(new Atom("Dysprosium", 66, 97, 3, 6, atomSeries.Lanthanide, 7429901, 1412, 2567, "Dy"));
		list.add(new Atom("Holmium", 67, 98, 3, 6, atomSeries.Lanthanide, 7440600, 1474, 2700, "Ho"));
		list.add(new Atom("Erbium", 68, 99, 3, 6, atomSeries.Lanthanide, 7440520, 1529, 2868, "Er"));
		list.add(new Atom("Thulium", 69, 100, 3, 6, atomSeries.Lanthanide, 7440304, 1545, 1950, "Tm"));
		list.add(new Atom("Ytterbium", 70, 103, 3, 6, atomSeries.Lanthanide, 7440644, 824, 1196, "Yb"));
		list.add(new Atom("Lutetium", 71, 104, 3, 6, atomSeries.Lanthanide, 7439943, 1663, 3402, "Lu"));
		list.add(new Atom("Hafnium", 72, 106, 4, 6, atomSeries.Transition_metal, 7440586, 2233, 4603, "Hf"));
		list.add(new Atom("Tantalum", 73, 108, 5, 6, atomSeries.Transition_metal, 7440257, 3017, 5458, "Ta"));
		list.add(new Atom("Tungsten", 74, 110, 6, 6, atomSeries.Transition_metal, 7440337, 3422, 5555, "W"));
		list.add(new Atom("Rhenium", 75, 111, 7, 6, atomSeries.Transition_metal, 7440155, 3186, 5596, "Re"));
		list.add(new Atom("Osmium", 76, 114, 8, 6, atomSeries.Transition_metal, 7440042, 3033, 5012, "Os"));
		list.add(new Atom("Iridium", 77, 115, 9, 6, atomSeries.Transition_metal, 7439885, 2446, 4428, "Ir"));
		list.add(new Atom("Platinum", 78, 117, 10, 6, atomSeries.Transition_metal, 7440064, 1768.3, 3825, "Pt"));
		list.add(new Atom("Gold", 79, 118, 11, 6, atomSeries.Transition_metal, 7440575, 1064.18, 2856, "Au"));
		list.add(new Atom("Mercury", 80, 121, 12, 6, atomSeries.Transition_metal, 7439976, -38.83, 356.73, "Hg"));
		list.add(new Atom("Thallium", 81, 123, 13, 6, atomSeries.Post_transition_metal, 7440280, 304, 1473, "Tl"));
		list.add(new Atom("Lead", 82, 125, 14, 6, atomSeries.Post_transition_metal, 7439921, 327.46, 1749, "Pb"));
		list.add(new Atom("Bismuth", 83, 126, 15, 6, atomSeries.Post_transition_metal, 7440699, 271.4, 1564, "Bi"));
		list.add(new Atom("Polonium", 84, 125, 16, 6, atomSeries.Post_transition_metal, 7440086, 254, 962, "Po"));
		list.add(new Atom("Astatine", 85, 125, 17, 6, atomSeries.Metalloid, 7440688, 302, 337, "At"));
		list.add(new Atom("Radon", 86, 136, 18, 6, atomSeries.Noble_gas, 10043922, -71, -61.7, "Rn"));
		list.add(new Atom("Francium", 87, 136, 1, 7, atomSeries.Alkali_metal, 7440735, 27, 677, "Fr"));
		list.add(new Atom("Radium", 88, 138, 2, 7, atomSeries.Alkaline_earth_metal, 7440144, 700, 1737, "Ra"));
		list.add(new Atom("Actinium", 89, 138, 3, 7, atomSeries.Actinide, 7440348, 1050, 3200, "Ac"));
		list.add(new Atom("Thorium", 90, 142, 3, 7, atomSeries.Actinide, 7440291, 1750, 4788, "Th"));
		list.add(new Atom("Protactinium", 91, 140, 3, 7, atomSeries.Actinide, 7440133, 1572, 4000, "Pa"));
		list.add(new Atom("Uranium", 92, 146, 3, 7, atomSeries.Actinide, 7440611, 1132.2, 4131));
		list.add(new Atom("Neptunium", 93, 144, 3, 7, atomSeries.Actinide, 7439998, 644, 3902, "Np"));
		list.add(new Atom("Plutonium", 94, 150, 3, 7, atomSeries.Actinide, 7440075, 639.4, 3228, "Pu"));
		list.add(new Atom("Americium", 95, 148, 3, 7, atomSeries.Actinide, 7440359, 1176, 2607, "Am"));
		list.add(new Atom("Curium", 96, 151, 3, 7, atomSeries.Actinide, 7440519, 1340, 3110, "Cm"));
		list.add(new Atom("Berkelium", 97, 150, 3, 7, atomSeries.Actinide, 7440406, 986, 2627, "Bk"));
		list.add(new Atom("Californium", 98, 153, 3, 7, atomSeries.Actinide, 7440713, 900, 1470, "Cf"));
		list.add(new Atom("Einsteinium", 99, 153, 3, 7, atomSeries.Actinide, 7429908, 860, 996, "Es"));
		list.add(new Atom("Fermium", 100, 157, 3, 7, atomSeries.Actinide, 7440724, 1527, 0, "Fm"));
		list.add(new Atom("Mendelevium", 101, 157, 3, 7, atomSeries.Actinide, 7440110, 827, 0, "Md"));
		list.add(new Atom("Nobelium", 102, 157, 3, 7, atomSeries.Actinide, 10028414, 827, 0, "No"));
		list.add(new Atom("Lawrencium", 103, 159, 3, 7, atomSeries.Actinide, 22537230, 1627, 0, "Lr"));
		list.add(new Atom("Rutherfordium", 104, 157, 4, 7, atomSeries.Transition_metal, 53850036, 2100, 5500, "Rf"));
		list.add(new Atom("Dubnium", 105, 157, 5, 7, atomSeries.Transition_metal, 53850035, 0, 0, "Db"));
		list.add(new Atom("Seaborgium", 106, 160, 6, 7, atomSeries.Transition_metal, 54037990, 0, 0, "Sg"));
		list.add(new Atom("Bohrium", 107, 163, 7, 7, atomSeries.Transition_metal, 54037991, 0, 0, "Bh"));
		list.add(new Atom("Hassium", 108, 165, 8, 7, atomSeries.Transition_metal, 54037992, 0, 0, "Hs"));
		list.add(new Atom("Meitnerium", 109, 167, 9, 7, atomSeries.Unknown, 54037993, 0, 0, "Mt"));
		list.add(new Atom("Darmstadtium", 110, 171, 10, 7, atomSeries.Unknown, 54037994, 0, 0, "Ds"));
		list.add(new Atom("Roentgenium", 111, 172, 11, 7, atomSeries.Unknown, 54386243, 0, 0, "Rg"));
		list.add(new Atom("Copernicium", 112, 173, 12, 7, atomSeries.Transition_metal, 54037995, 0, 0, "Cn"));
		list.add(new Atom("Nihonium", 113, 173, 13, 7, atomSeries.Unknown, 54037996, 0, 0, "Nh"));
		list.add(new Atom("Flerovium", 114, 175, 14, 7, atomSeries.Post_transition_metal, 54037997, 0, 0, "Fl"));
		list.add(new Atom("Moscovium", 115, 175, 15, 7, atomSeries.Unknown, 54037998, 0, 0, "Mc"));
		list.add(new Atom("Livermorium", 116, 177, 16, 7, atomSeries.Post_transition_metal, 54037999, 0, 0, "Lv"));
		list.add(new Atom("Tennessine", 117, 177, 17, 7, atomSeries.Unknown, 54100000, 0, 0, "Ts"));
		list.add(new Atom("Oganesson", 118, 176, 18, 7, atomSeries.Noble_gas, 54100001, 0, 0, "Og"));
		return list;
	}
	
	public static int getShellElectrons(int electrons, int shell) { //TODO should return # of electrons in corresponding shell, DOES NOT WORK CURRENTLY
		if (shell > 7 || electrons > 280 || shell < 1 || electrons < 0) {
			return -1; //too many or bad input
		}
		
		int[] energyLevels = new int[7];
		int currentLevel = 1;
		int shellMax = 2;
		
		while (electrons > 0) {
			shellMax *= 2 * Math.pow(currentLevel, 2);
		}
		return energyLevels[shell-1];
	}
	
	public static String isotopeNameStr(Atom atom) {
		return atom.name + "-" + (atom.protons + atom.neutrons);
	}
	
	public static String casNumberStr(Atom atom) {
		String returnStr = Integer.toString(atom.casNumber);
		int len = returnStr.length();
		return returnStr.substring(0,len-3) + "-" + returnStr.substring(len-3,len-1) + "-" + returnStr.charAt(len-1);
	}
	
	public static int getCharge(Atom atom) {
		return atom.protons - atom.electrons;
	}
	
	public static double getWeight (Atom atom) {
		return (atom.protons * 1.00727) + (atom.neutrons * 1.00866) + (atom.electrons * 0.000549); //in AMU
	}
	
	public static void updateElectrons(Atom atom, int electronCount) {
		atom.electrons += electronCount;
	}
	
	public static void updateProtons(Atom atom, int protonCount) {
		atom.protons += protonCount;
	}
	
	public static void updateNeutrons(Atom atom, int neutronCount) {
		atom.neutrons += neutronCount;
	}
	
	/* ---ALL SEARCH FUNCTIONS ARE TAKING STRING BECAUSE IT WILL BE USER INPUT--- */
	
	public static Atom searchForAtomIndex(ArrayList<Atom> populatedAtomList, String indexStr) { //searching by atomic number, proton count, electron count
		try {
			int index = Integer.parseInt(indexStr);
			return populatedAtomList.get(index);
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	public static Atom searchForAtomName(ArrayList<Atom> populatedAtomList, String name) {
		for (Atom currentAtom : populatedAtomList) {
			if (currentAtom.name.equalsIgnoreCase(name)) {
				return currentAtom;
			}
		}
		return null;
	}
	
	public static Atom searchForAtomAbbreviation(ArrayList<Atom> populatedAtomList, String abbreviation) {
		for (Atom currentAtom : populatedAtomList) {
			if (currentAtom.abbreviation.equalsIgnoreCase(abbreviation)) {
				return currentAtom;
			}
		}
		return null;
	}
	
	public static Atom searchForAtomNeutrons(ArrayList<Atom> populatedAtomList, String neutronsStr) {
		int neutrons = Integer.parseInt(neutronsStr);
		if (neutrons == 0) {
			return populatedAtomList.get(1); //ignores neutronium
		} else {
			for (Atom currentAtom : populatedAtomList) { 
				if (currentAtom.neutrons == neutrons) {
					return currentAtom;
				}
			}
		}
		return null;
	}
	
	public static Atom searchForAtomCAS(ArrayList<Atom> populatedAtomList, String casStr) {
		int CAS = Integer.parseInt(casStr.replace("-", ""));
		for (Atom currentAtom : populatedAtomList) {
			if (currentAtom.casNumber == CAS) {
				return currentAtom;
			}
		}
		return null;
	}
	
	public static void main (String[] args) {
		ArrayList<Atom> periodic = new ArrayList<Atom>();
		populateAtomList(periodic);
		
		ArrayList<Atom> savedAtoms = new ArrayList<Atom>();
		
		Atom displayAtom = periodic.get(1);

		gui myFrame = new gui();

	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    myFrame.pack();
	    myFrame.setVisible(true);
		
		
		System.out.println("getShellElectrons TEST CASES");
		System.out.println("Amount of electrons in first orbital (1 electron): " + getShellElectrons(1,1));
		System.out.println("Amount of electrons in first orbital (2 electrons): " + getShellElectrons(2,1));
		System.out.println("Amount of electrons in first orbital (3 electrons): " + getShellElectrons(3,1));
		System.out.println("Amount of electrons in first orbital (100 electrons): " + getShellElectrons(100,1));
		System.out.println("Amount of electrons in second orbital (1 electron): " + getShellElectrons(1,2));
		System.out.println("Amount of electrons in second orbital (10 electrons): " + getShellElectrons(10,2));
		System.out.println("Amount of electrons in second orbital (7 electrons): " + getShellElectrons(7,2));
		System.out.println("Amount of electrons in second orbital (40 electrons): " + getShellElectrons(40,2));
		System.out.println("Amount of electrons in fourth orbital (130 electrons): " + getShellElectrons(130,4));
		System.out.println("Amount of electrons in seventh orbital (250 electrons): " + getShellElectrons(250,7));
	}
}
