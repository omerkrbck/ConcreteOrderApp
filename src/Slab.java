import java.util.ArrayList;

public class Slab extends Concrete implements ISlab {     // Sub Class

	
	private double slabWidth;
	
	private double slabLength;
	
	private double slabThickness;
	
	private int numberOfSlab;
	
	static ArrayList<Slab> slabObject = new ArrayList<Slab>();

	public Slab() {
		// TODO Auto-generated constructor stub
	}
	

	public Slab(double slabWidth, double slabLength, double slabThickness, int numberOfSlab) {
		super();
		this.slabWidth = slabWidth;
		this.slabLength = slabLength;
		this.slabThickness = slabThickness;
		this.numberOfSlab = numberOfSlab;
	}


	public double getSlabWidth() {
		return slabWidth;
	}



	public void setSlabWidth(double slabWidth) {
		this.slabWidth = slabWidth;
	}



	public double getSlabLength() {
		return slabLength;
	}



	public void setSlabLength(double slabLength) {
		this.slabLength = slabLength;
	}



	public double getSlabThickness() {
		return slabThickness;
	}



	public void setSlabThickness(double slabThickness) {
		this.slabThickness = slabThickness;
	}



	public int getNumberOfSlab() {
		return numberOfSlab;
	}



	public void setNumberOfSlab(int numberOfSlab) {
		this.numberOfSlab = numberOfSlab;
	}



	public double calculation_slabVolume(Slab slab) {
		
		double slabVolume=slab.getSlabLength()*slab.getSlabWidth()*slab.getSlabThickness()*slab.getNumberOfSlab();
		return slabVolume;		
	}
	
	
}
