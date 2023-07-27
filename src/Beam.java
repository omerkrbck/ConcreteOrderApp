import java.util.ArrayList;

public class Beam extends Concrete implements IBeam {   // Sub Class

	
	private double beamWidth;
	
	private double beamHeight;
	
	private double beamLength;
	
	private int numberOfBeam;

	static ArrayList<Beam> beamObject = new ArrayList<Beam>();

	public Beam() {
		// TODO Auto-generated constructor stub
	}
	

	public Beam(double beamWidth, double beamHeight, double beamLength, int numberOfBeam) {
		super();
		this.beamWidth = beamWidth;
		this.beamHeight = beamHeight;
		this.beamLength = beamLength;
		this.numberOfBeam = numberOfBeam;
	}


	public double getBeamWidth() {
		return beamWidth;
	}


	public void setBeamWidth(double beamWidth) {
		this.beamWidth = beamWidth;
	}


	public double getBeamHeight() {
		return beamHeight;
	}


	public void setBeamHeight(double beamHeight) {
		this.beamHeight = beamHeight;
	}

	public double getBeamLength() {
		return beamLength;
	}


	public void setBeamLength(double beamLength) {
		this.beamLength = beamLength;
	}


	public int getNumberOfBeam() {
		return numberOfBeam;
	}


	public void setNumberOfBeam(int numberOfBeam) {
		this.numberOfBeam = numberOfBeam;
	}


	public double calculation_beamVolume(Beam beam) {

		double beamVolume=beam.getBeamLength()*beam.getBeamWidth()*beam.getBeamHeight()*beam.getNumberOfBeam();
		return beamVolume;
	}
	
	
}
