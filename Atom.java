package atombuilder;

// !!! this class would only be used for a database to be searched through. all final values then no? no need to account for strange user inputs!!!
public class Atom { //atomic number is index. Ngl prob gonna put some bs in index 0
	private String name;
	private int protons; 
	private int neutrons; 
	private int electrons; //procedural, but still here for simplicity
	private int group; //if 0:     series lanthanoid = output group Lanthanide    >>    actinide = Actinoid
	private int period;
	private atomSeries series;
	private int casNumber; //exclude the dashes, they will be re-added in output.wWhen searching for cas number, will accept either with dashes or without them (but no inbetween)
	private double meltingPoint; //celsius. 0 means n/a or unknown
	private double boilingPoint;
	private String abbreviation; //procedural unless overridden

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
	
	public static int getCharge(int protons, int electrons) {
		return protons - electrons; //is this even necessary
	}
	
	public static String getGroupStr(int group, atomSeries series) {
		if (group == 0) {
			if (series.equals(atomSeries.Lanthanoid)) {
				return "Lanthanide";
			} else {
				return "Actinide";
			}
		} else {
			return Integer.toString(group);
		}
	}

	public static double getWeight (int protons, int neutrons, int electrons) { //returns in AMU
		return (protons * 1.00727) + (neutrons * 1.00866) + (electrons * 0.000549);
	}

	public static char getBlock (int group, int period) {
		if (group == 0) { // 0 means lanthanide or actinide
			return 'f';
		} else if (3 <= group || group <= 12) {
			return 'd';
		} else if (group > 12 && period != 1) {
			return 'p';
		} else {
			return 's';
		}
	}

	public static int getShellElectrons (int electrons, int shell) { //should 
	//TODO should return # of electrons in corresponding shell. this will be implemented once we start on gui
		return -1;
	}

}
