package atombuilder;

public class Atom {
	String name;
	int protons; 
	int neutrons; 
	int electrons;
	int group; //if 0, is lanthanoid/actinoid
	int period;
	atomSeries series;
	int casNumber; //excluding the dashes
	double meltingPoint; //celsius. 0 means n/a or unknown
	double boilingPoint;
	String abbreviation; //procedural unless overridden

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
	
	//without given abbreviation, makes it the first letter
	public Atom (String name, int protons, int neutrons, int group, int period, atomSeries series, int casNumber, double meltingPoint, double boilingPoint) {
		this(name, protons, neutrons, group, period, series, casNumber, meltingPoint, boilingPoint, name.substring(0,1));
	}
	
	public String getGroup() {
		if (this.group == 0) {
			if (this.series.equals(atomSeries.Lanthanide)) {
				return "Lanthanide";
			} else {
				return "Actinide";
			}
		} else {
			return Integer.toString(this.group);
		}
	}

	public char getBlock () {
		if (this.group == 0) {
			return 'f';
		} else if (3 <= this.group || this.group <= 12) {
			return 'd';
		} else if (this.group > 12 && this.period != 1) {
			return 'p';
		} else {
			return 's';
		}
	}
	
	public String getSeriesString() {
		switch(this.series) {
		case Reactive_nonmetal:
			return "Reactive Nonmetal";
		case Noble_gas:
			return "Noble Gas";
		case Alkali_metal:
			return "Alkali Metal";
		case Alkaline_earth_metal:
			return "Alkaline Earth Metal";
		case Transition_metal:
			return "Transition Metal";
		case Post_transition_metal:
			return "Post Transition Metal";
		case Metalloid:
			return "Metalloid";
		case Lanthanide:
			return "Lanthanide";
		case Actinide:
			return "Actinide";
		default:
			return "Unknown";
		}
	}
	
	public String isotopeNameStr() {
		return this.name + "-" + (this.protons + this.neutrons);
	}
	
	public String casNumberStr() {
		String returnStr = Integer.toString(this.casNumber);
		int len = returnStr.length();
		return returnStr.substring(0,len-3) + "-" + returnStr.substring(len-3,len-1) + "-" + returnStr.charAt(len-1);
	}
	
	public int getCharge() {
		return this.protons - this.electrons;
	}
	
	public double getWeight () {
		return (this.protons * 1.00727) + (this.neutrons * 1.00866) + (this.electrons * 0.000549); //in AMU
	}
	
	public void updateElectrons(int electronCount) {
		this.electrons += electronCount;
	}
	
	public void updateProtons(int protonCount) {
		this.protons += protonCount;
	}
	
	public void updateNeutrons(int neutronCount) {
		this.neutrons += neutronCount;
	}
	
	public String getAtomInfoString() {
		return this.abbreviation +
				 "\nGroup: " + this.getGroup() + 
				 "\nPeriod: " + this.period + 
				 "\nBlock: " + this.getBlock() + " block" +
				 "\nSeries: " + this.getSeriesString() + 
				 "\nMelting Point: " + this.meltingPoint + 
			 	 "\nBoiling Point: " + this.boilingPoint + 
			 	 "\nCAS: " + this.casNumber;
	}

}
