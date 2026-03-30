package atombuilder;

// !!! this class would only be used for a database to be searched through. all final values then no? no need to account for strange user inputs!!!
public class Atom {
	String name;
	int protons; 
	int neutrons; 
	int electrons;
	int group; //if 0, is lanthanoid/actinoid
	int period;
	atomSeries series;
	int casNumber; //exclude the dashes
	double meltingPoint; //celsius. 0 means n/a or unknown
	double boilingPoint;
	String abbreviation; //procedural unless overridden

	//constructor 
	public Atom (String name, int protons, int neutrons, int group, int period, atomSeries series, int casNumber, double meltingPoint, double boilingPoint, String abbreviation) { 
		this.name = name;
		this.protons = protons; 
		this.neutrons = neutrons; 
		this.electrons = protons;
		this.group = group;
		this.period = period;
		this.series = series;
		this.casNumber = casNumber;
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
		this.abbreviation = abbreviation;
	}
	
	//without given abbreviation, procedurally makes it the first letter
	public Atom (String name, int protons, int neutrons, int group, int period, atomSeries series, int casNumber, double meltingPoint, double boilingPoint) {
		this(name, protons, neutrons, group, period, series, casNumber, meltingPoint, boilingPoint, name.substring(0,1));
	}
	
	public static String getGroup(Atom atom) {
		if (atom.group == 0) {
			if (atom.series.equals(atomSeries.Lanthanide)) {
				return "Lanthanide";
			} else {
				return "Actinide";
			}
		} else {
			return Integer.toString(atom.group);
		}
	}

	public static char getBlock (Atom atom) {
		if (atom.group == 0) {
			return 'f';
		} else if (3 <= atom.group || atom.group <= 12) {
			return 'd';
		} else if (atom.group > 12 && atom.period != 1) {
			return 'p';
		} else {
			return 's';
		}
	}

}
