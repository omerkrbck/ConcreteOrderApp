
public class Concrete {     // Super Class // Base Class

	
	private double unitWeightOfConcrete=2.4;  // 2.4 ton/m3 2400kg/m3
	
	
	public Concrete() {
		// TODO Auto-generated constructor stub
	}
	
	public Concrete(double unitWeightOfConcrete) {
		super();
		this.unitWeightOfConcrete = unitWeightOfConcrete;
	}

	public double getUnitWeightOfConcrete() {
		return unitWeightOfConcrete;
	}

	public void setUnitWeightOfConcrete(double unitWeightOfConcrete) {
		this.unitWeightOfConcrete = unitWeightOfConcrete;
	}



	public double concretePrice (int concrete_select) {
		double C25_1=1650;   // C25 concrete price 
		double C30_2=1700;   // C30 concrete price 
		double C35_3=1850;   // C35 concrete price 
		double C40_4=1950;   // C40 concrete price 
		double C45_5=2100;   // C45 concrete price 
		double C50_6=2300;   // C50 concrete price 
		
		if (concrete_select==1) {
			return C25_1;
		}
		else if (concrete_select==2) {
			return C30_2;
		}
		else if (concrete_select==3) {
			return C35_3;
		}
		else if (concrete_select==4) {
			return C40_4;
		}
		else if (concrete_select==5) {
			return C45_5;
		}
		else if (concrete_select==6) {
			return C50_6;
		}else {
			return 0;
		}
	}
	
	
	
}
