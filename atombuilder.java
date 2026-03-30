package atombuilder;

import java.util.ArrayList;

public class atombuilder {	
	
	public static int getShellElectrons(int electrons, int shell) { //TODO should return # of electrons in corresponding shell
		return -1;
	}
	
	public static String atomNameStr(Atom atom) { //accounting for isotopes
		return atom.name + "-" + (atom.protons + atom.neutrons);
	}
	
	public static String casNumberStr(Atom atom) {
		String returnStr = Integer.toString(atom.casNumber);
		int len = returnStr.length();
		return returnStr.substring(0,len-3) + "-" + returnStr.substring(len-3,len-1) + "-" + returnStr.charAt(len-1);
	}
	
	public static int getCharge(Atom atom) { //is this even necessary 
		return atom.protons - atom.electrons;
	}
	
	public static double getWeight (Atom atom) { //returns in AMU
		return (atom.protons * 1.00727) + (atom.neutrons * 1.00866) + (atom.electrons * 0.000549);
	}
	
	public static void main (String[] args) {
		ArrayList<Atom> periodic = new ArrayList<>(); //index = atomic number = # protons
		
		//name, protons, neutrons, group, period, series, casNumber, meltingPoint, boilingPoint, abbreviation
		
		periodic.add(new Atom("Neutronium", 0, 0, 0, 0, atomSeries.Unknown, 12586311, 0, 0, "Nu")); //filling index 0 for simplicity
		periodic.add(new Atom("Hydrogen", 1, 0, 1, 1, atomSeries.Reactive_nonmetal, 1333740, -259.16, -252.879));
		periodic.add(new Atom("Helium", 2, 2, 18, 1, atomSeries.Noble_gas, 7440597, -272.2, -268.928, "He"));
		periodic.add(new Atom("Lithium", 3, 4, 1, 2, atomSeries.Alkali_metal, 7439932, 180.54, 1342, "Li"));
		periodic.add(new Atom("Beryllium", 4, 5, 2, 2, atomSeries.Alkaline_earth_metal, 7440417, 1287, 2470, "Be"));
		periodic.add(new Atom("Boron", 5, 6, 13, 2, atomSeries.Metalloid, 7440428, 2075, 4000));
		periodic.add(new Atom("Carbon", 6, 6, 14, 2, atomSeries.Reactive_nonmetal, 7440440, 3550, 4827));
		periodic.add(new Atom("Nitrogen", 7, 7, 15, 2, atomSeries.Reactive_nonmetal, 7727379, -210.0, -195.79));
		periodic.add(new Atom("Oxygen", 8, 8, 16, 2, atomSeries.Reactive_nonmetal, 7782447, -218.79, -182.95));
		periodic.add(new Atom("Fluorine", 9, 10, 17, 2, atomSeries.Reactive_nonmetal, 7782414, -219.67, -188.11));
		periodic.add(new Atom("Neon", 10, 10, 18, 2, atomSeries.Noble_gas, 7440019, -248.59, -246.08, "Ne"));
		periodic.add(new Atom("Sodium", 11, 12, 1, 3, atomSeries.Alkali_metal, 7440235, 97.79, 883, "Na"));
		periodic.add(new Atom("Magnesium", 12, 12, 2, 3, atomSeries.Alkaline_earth_metal, 7439954, 650, 1090, "Mg"));
		periodic.add(new Atom("Aluminium", 13, 14, 13, 3, atomSeries.Post_transition_metal, 7429905, 660.32, 2470, "Al"));
		periodic.add(new Atom("Silicon", 14, 14, 14, 3, atomSeries.Metalloid, 7440213, 1414, 3265, "Si"));
		periodic.add(new Atom("Phosphorus", 15, 16, 15, 3, atomSeries.Reactive_nonmetal, 7723140, 44.15, 280.5));
		periodic.add(new Atom("Sulfur", 16, 16, 16, 3, atomSeries.Reactive_nonmetal, 7704349, 115.21, 444.6));
		periodic.add(new Atom("Chlorine", 17, 18, 17, 3, atomSeries.Reactive_nonmetal, 7782505, -101.5, -34.04, "Cl"));
		periodic.add(new Atom("Argon", 18, 22, 18, 3, atomSeries.Noble_gas, 7440371, -189.34, -185.85, "Ar"));
		periodic.add(new Atom("Potassium", 19, 20, 1, 4, atomSeries.Alkali_metal, 7440097, 63.5, 759));
		periodic.add(new Atom("Calcium", 20, 20, 2, 4, atomSeries.Alkaline_earth_metal, 7440702, 842, 1484, "Ca"));
		periodic.add(new Atom("Scandium", 21, 24, 3, 4, atomSeries.Transition_metal, 7440202, 1541, 2836, "Sc"));
		periodic.add(new Atom("Titanium", 22, 26, 4, 4, atomSeries.Transition_metal, 7440326, 1668, 3287, "Ti"));
		periodic.add(new Atom("Vanadium", 23, 28, 5, 4, atomSeries.Transition_metal, 7440622, 1910, 3407));
		periodic.add(new Atom("Chromium", 24, 28, 6, 4, atomSeries.Transition_metal, 7440473, 1907, 2671, "Cr"));
		periodic.add(new Atom("Manganese", 25, 30, 7, 4, atomSeries.Transition_metal, 7439965, 1246, 2061, "Mn"));
		periodic.add(new Atom("Iron", 26, 30, 8, 4, atomSeries.Transition_metal, 7439896, 1538, 2862, "Fe"));
		periodic.add(new Atom("Cobalt", 27, 32, 9, 4, atomSeries.Transition_metal, 7440484, 1495, 2927, "Co"));
		periodic.add(new Atom("Nickel", 28, 31, 10, 4, atomSeries.Transition_metal, 7440020, 1455, 2913, "Ni"));
		periodic.add(new Atom("Copper", 29, 35, 11, 4, atomSeries.Transition_metal, 7440508, 1084.62, 2562, "Cu"));
		periodic.add(new Atom("Zinc", 30, 35, 12, 4, atomSeries.Transition_metal, 7440666, 419.53, 907, "Zn"));
		periodic.add(new Atom("Gallium", 31, 39, 13, 4, atomSeries.Post_transition_metal, 7440553, 29.76, 2403, "Ga"));
		periodic.add(new Atom("Germanium", 32, 41, 14, 4, atomSeries.Metalloid, 7440564, 938.25, 2820, "Ge"));
		periodic.add(new Atom("Arsenic", 33, 42, 15, 4, atomSeries.Metalloid, 7440382, 817, 613, "As"));
		periodic.add(new Atom("Selenium", 34, 45, 16, 4, atomSeries.Reactive_nonmetal, 7782492, 221, 685, "Se"));
		periodic.add(new Atom("Bromine", 35, 45, 17, 4, atomSeries.Reactive_nonmetal, 7726956, -7.2, 58.8, "Br"));
		periodic.add(new Atom("Krypton", 36, 48, 18, 4, atomSeries.Noble_gas, 7439909, -157.36, -153.22, "Kr"));
		periodic.add(new Atom("Rubidium", 37, 48, 1, 5, atomSeries.Alkali_metal, 7440177, 39.31, 688, "Rb"));
		periodic.add(new Atom("Strontium", 38, 50, 2, 5, atomSeries.Alkaline_earth_metal, 7440246, 777, 1382, "Sr"));
		periodic.add(new Atom("Yttrium", 39, 50, 3, 5, atomSeries.Transition_metal, 7440655, 1526, 3336));
		periodic.add(new Atom("Zirconium", 40, 51, 4, 5, atomSeries.Transition_metal, 7440677, 1855, 4409, "Zr"));
		periodic.add(new Atom("Niobium", 41, 52, 5, 5, atomSeries.Transition_metal, 7440031, 2477, 4744, "Nb"));
		periodic.add(new Atom("Molybdenum", 42, 54, 6, 5, atomSeries.Transition_metal, 7439987, 2623, 4639, "Mo"));
		periodic.add(new Atom("Technetium", 43, 55, 7, 5, atomSeries.Transition_metal, 7440268, 2157, 4265, "Tc"));
		periodic.add(new Atom("Ruthenium", 44, 57, 8, 5, atomSeries.Transition_metal, 7440188, 2334, 4150, "Ru"));
		periodic.add(new Atom("Rhodium", 45, 58, 9, 5, atomSeries.Transition_metal, 7440166, 1964, 3695, "Rh"));
		periodic.add(new Atom("Palladium", 46, 60, 10, 5, atomSeries.Transition_metal, 7440053, 1554.9, 2963, "Pd"));
		periodic.add(new Atom("Silver", 47, 61, 11, 5, atomSeries.Transition_metal, 7440224, 961.78, 2162, "Ag"));
		periodic.add(new Atom("Cadmium", 48, 64, 12, 5, atomSeries.Transition_metal, 7440439, 321.07, 767, "Cd"));
		periodic.add(new Atom("Indium", 49, 66, 13, 5, atomSeries.Post_transition_metal, 7440746, 156.6, 2072, "In"));
		periodic.add(new Atom("Tin", 50, 69, 14, 5, atomSeries.Post_transition_metal, 7440315, 231.93, 2602, "Sn"));
		periodic.add(new Atom("Antimony", 51, 71, 15, 5, atomSeries.Metalloid, 7440360, 630.63, 1587, "Sb"));
		periodic.add(new Atom("Tellurium", 52, 76, 16, 5, atomSeries.Metalloid, 13494809, 449.51, 988, "Te"));
		periodic.add(new Atom("Iodine", 53, 74, 17, 5, atomSeries.Reactive_nonmetal, 7553562, 113.7, 184.3));
		periodic.add(new Atom("Xenon", 54, 77, 18, 5, atomSeries.Noble_gas, 7440633, -111.8, -108.0, "Xe"));
		periodic.add(new Atom("Cesium", 55, 78, 1, 6, atomSeries.Alkali_metal, 7440462, 28.44, 671, "Cs"));
		periodic.add(new Atom("Barium", 56, 81, 2, 6, atomSeries.Alkaline_earth_metal, 7440393, 727, 1870, "Ba"));
		periodic.add(new Atom("Lanthanum", 57, 82, 3, 6, atomSeries.Lanthanide, 7439910, 920, 3464, "La"));
		periodic.add(new Atom("Cerium", 58, 82, 3, 6, atomSeries.Lanthanide, 7440451, 795, 3443, "Ce"));
		periodic.add(new Atom("Praseodymium", 59, 82, 3, 6, atomSeries.Lanthanide, 7440109, 935, 3520, "Pr"));
		periodic.add(new Atom("Neodymium", 60, 84, 3, 6, atomSeries.Lanthanide, 7440008, 1024, 3074, "Nd"));
		periodic.add(new Atom("Promethium", 61, 84, 3, 6, atomSeries.Lanthanide, 7440121, 1042, 3000, "Pm"));
		periodic.add(new Atom("Samarium", 62, 88, 3, 6, atomSeries.Lanthanide, 7440193, 1072, 1900, "Sm"));
		periodic.add(new Atom("Europium", 63, 89, 3, 6, atomSeries.Lanthanide, 7440531, 826, 1529, "Eu"));
		periodic.add(new Atom("Gadolinium", 64, 93, 3, 6, atomSeries.Lanthanide, 7440542, 1312, 3273, "Gd"));
		periodic.add(new Atom("Terbium", 65, 94, 3, 6, atomSeries.Lanthanide, 7440279, 1356, 3230, "Tb"));
		periodic.add(new Atom("Dysprosium", 66, 97, 3, 6, atomSeries.Lanthanide, 7429901, 1412, 2567, "Dy"));
		periodic.add(new Atom("Holmium", 67, 98, 3, 6, atomSeries.Lanthanide, 7440600, 1474, 2700, "Ho"));
		periodic.add(new Atom("Erbium", 68, 99, 3, 6, atomSeries.Lanthanide, 7440520, 1529, 2868, "Er"));
		periodic.add(new Atom("Thulium", 69, 100, 3, 6, atomSeries.Lanthanide, 7440304, 1545, 1950, "Tm"));
		periodic.add(new Atom("Ytterbium", 70, 103, 3, 6, atomSeries.Lanthanide, 7440644, 824, 1196, "Yb"));
		periodic.add(new Atom("Lutetium", 71, 104, 3, 6, atomSeries.Lanthanide, 7439943, 1663, 3402, "Lu"));
		periodic.add(new Atom("Hafnium", 72, 106, 4, 6, atomSeries.Transition_metal, 7440586, 2233, 4603, "Hf"));
		periodic.add(new Atom("Tantalum", 73, 108, 5, 6, atomSeries.Transition_metal, 7440257, 3017, 5458, "Ta"));
		periodic.add(new Atom("Tungsten", 74, 110, 6, 6, atomSeries.Transition_metal, 7440337, 3422, 5555, "W"));
		periodic.add(new Atom("Rhenium", 75, 111, 7, 6, atomSeries.Transition_metal, 7440155, 3186, 5596, "Re"));
		periodic.add(new Atom("Osmium", 76, 114, 8, 6, atomSeries.Transition_metal, 7440042, 3033, 5012, "Os"));
		periodic.add(new Atom("Iridium", 77, 115, 9, 6, atomSeries.Transition_metal, 7439885, 2446, 4428, "Ir"));
		periodic.add(new Atom("Platinum", 78, 117, 10, 6, atomSeries.Transition_metal, 7440064, 1768.3, 3825, "Pt"));
		periodic.add(new Atom("Gold", 79, 118, 11, 6, atomSeries.Transition_metal, 7440575, 1064.18, 2856, "Au"));
		periodic.add(new Atom("Mercury", 80, 121, 12, 6, atomSeries.Transition_metal, 7439976, -38.83, 356.73, "Hg"));
		periodic.add(new Atom("Thallium", 81, 123, 13, 6, atomSeries.Post_transition_metal, 7440280, 304, 1473, "Tl"));
		periodic.add(new Atom("Lead", 82, 125, 14, 6, atomSeries.Post_transition_metal, 7439921, 327.46, 1749, "Pb"));
		periodic.add(new Atom("Bismuth", 83, 126, 15, 6, atomSeries.Post_transition_metal, 7440699, 271.4, 1564, "Bi"));
		periodic.add(new Atom("Polonium", 84, 125, 16, 6, atomSeries.Post_transition_metal, 7440086, 254, 962, "Po"));
		periodic.add(new Atom("Astatine", 85, 125, 17, 6, atomSeries.Metalloid, 7440688, 302, 337, "At"));
		periodic.add(new Atom("Radon", 86, 136, 18, 6, atomSeries.Noble_gas, 10043922, -71, -61.7, "Rn"));
		periodic.add(new Atom("Francium", 87, 136, 1, 7, atomSeries.Alkali_metal, 7440735, 27, 677, "Fr"));
		periodic.add(new Atom("Radium", 88, 138, 2, 7, atomSeries.Alkaline_earth_metal, 7440144, 700, 1737, "Ra"));
		periodic.add(new Atom("Actinium", 89, 138, 3, 7, atomSeries.Actinide, 7440348, 1050, 3200, "Ac"));
		periodic.add(new Atom("Thorium", 90, 142, 3, 7, atomSeries.Actinide, 7440291, 1750, 4788, "Th"));
		periodic.add(new Atom("Protactinium", 91, 140, 3, 7, atomSeries.Actinide, 7440133, 1572, 4000, "Pa"));
		periodic.add(new Atom("Uranium", 92, 146, 3, 7, atomSeries.Actinide, 7440611, 1132.2, 4131));
		periodic.add(new Atom("Neptunium", 93, 144, 3, 7, atomSeries.Actinide, 7439998, 644, 3902, "Np"));
		periodic.add(new Atom("Plutonium", 94, 150, 3, 7, atomSeries.Actinide, 7440075, 639.4, 3228, "Pu"));
		periodic.add(new Atom("Americium", 95, 148, 3, 7, atomSeries.Actinide, 7440359, 1176, 2607, "Am"));
		periodic.add(new Atom("Curium", 96, 151, 3, 7, atomSeries.Actinide, 7440519, 1340, 3110, "Cm"));
		periodic.add(new Atom("Berkelium", 97, 150, 3, 7, atomSeries.Actinide, 7440406, 986, 2627, "Bk"));
		periodic.add(new Atom("Californium", 98, 153, 3, 7, atomSeries.Actinide, 7440713, 900, 1470, "Cf"));
		periodic.add(new Atom("Einsteinium", 99, 153, 3, 7, atomSeries.Actinide, 7429908, 860, 996, "Es"));
		periodic.add(new Atom("Fermium", 100, 157, 3, 7, atomSeries.Actinide, 7440724, 1527, 0, "Fm"));
		periodic.add(new Atom("Mendelevium", 101, 157, 3, 7, atomSeries.Actinide, 7440110, 827, 0, "Md"));
		periodic.add(new Atom("Nobelium", 102, 157, 3, 7, atomSeries.Actinide, 10028414, 827, 0, "No"));
		periodic.add(new Atom("Lawrencium", 103, 159, 3, 7, atomSeries.Actinide, 22537230, 1627, 0, "Lr"));
		periodic.add(new Atom("Rutherfordium", 104, 157, 4, 7, atomSeries.Transition_metal, 53850036, 2100, 5500, "Rf"));
		periodic.add(new Atom("Dubnium", 105, 157, 5, 7, atomSeries.Transition_metal, 53850035, 0, 0, "Db"));
		periodic.add(new Atom("Seaborgium", 106, 160, 6, 7, atomSeries.Transition_metal, 54037990, 0, 0, "Sg"));
		periodic.add(new Atom("Bohrium", 107, 163, 7, 7, atomSeries.Transition_metal, 54037991, 0, 0, "Bh"));
		periodic.add(new Atom("Hassium", 108, 165, 8, 7, atomSeries.Transition_metal, 54037992, 0, 0, "Hs"));
		periodic.add(new Atom("Meitnerium", 109, 167, 9, 7, atomSeries.Unknown, 54037993, 0, 0, "Mt"));
		periodic.add(new Atom("Darmstadtium", 110, 171, 10, 7, atomSeries.Unknown, 54037994, 0, 0, "Ds"));
		periodic.add(new Atom("Roentgenium", 111, 172, 11, 7, atomSeries.Unknown, 54386243, 0, 0, "Rg"));
		periodic.add(new Atom("Copernicium", 112, 173, 12, 7, atomSeries.Transition_metal, 54037995, 0, 0, "Cn"));
		periodic.add(new Atom("Nihonium", 113, 173, 13, 7, atomSeries.Unknown, 54037996, 0, 0, "Nh"));
		periodic.add(new Atom("Flerovium", 114, 175, 14, 7, atomSeries.Post_transition_metal, 54037997, 0, 0, "Fl"));
		periodic.add(new Atom("Moscovium", 115, 175, 15, 7, atomSeries.Unknown, 54037998, 0, 0, "Mc"));
		periodic.add(new Atom("Livermorium", 116, 177, 16, 7, atomSeries.Post_transition_metal, 54037999, 0, 0, "Lv"));
		periodic.add(new Atom("Tennessine", 117, 177, 17, 7, atomSeries.Unknown, 54100000, 0, 0, "Ts"));
		periodic.add(new Atom("Oganesson", 118, 176, 18, 7, atomSeries.Noble_gas, 54100001, 0, 0, "Og"));
		
		/*--------TESTING JUNK--------*/
		Atom displayAtom = periodic.get(1);
		System.out.println(atomNameStr(displayAtom));
		System.out.println("CAS" + casNumberStr(displayAtom));
		displayAtom.neutrons += 5;
		System.out.println(atomNameStr(displayAtom));
		System.out.println(displayAtom.name + " has " + displayAtom.electrons + " electrons.");
		
		displayAtom = periodic.get(3);
		System.out.println("Atom " + displayAtom.name + " is from group " + Atom.getGroup(displayAtom));
		System.out.println(displayAtom.name + " is from the " + Atom.getBlock(displayAtom) + " block.");

	}
}
//when searching for cas number, will accept either with dashes or without them (but no inbetween)

//obviously need to add safeguards for invalid inputs for all these functions, but the constructor should be fine as it’s only for databasing 