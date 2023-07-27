import java.util.Scanner;

public class ConcreteOrderApp {

	public static void main(String[] args) {   // Main Class

		
		try {
			
		 
		Scanner scanner=new Scanner(System.in);
		
		Column column =new Column();                       
		Beam    beam =new Beam();
		Slab slab =new Slab();
		
		String line="-------------------------------------------------------";
		
		System.out.println("**********     WELCOME TO AAA BBB CONCRETE COMPANY     **********");
		System.out.println("Please Select The Concrete Class You Want To Order : ");
		System.out.println("C25 --- 1\n" + "C30 --- 2\n" + "C35 --- 3\n" 
		                    + "C40 --- 4\n" + "C45 --- 5\n" + "C50 --- 6\n" );
		
		int concreteSelect=scanner.nextInt();
		
		double a1= column.concretePrice(concreteSelect);
		double  a2=beam.concretePrice(concreteSelect);
		double a3=slab.concretePrice(concreteSelect);
		
		System.out.println(line);
		
		if (concreteSelect==1) {
			System.out.println("C25 Concrete Class m3 Price : 1650 TL");
		}
		else if (concreteSelect==2) {
			System.out.println("C30 Concrete Class m3 Price : 1700 TL");
		}
		else if (concreteSelect==3) {
			System.out.println("C35 Concrete Class m3 Price : 1850 TL");
		}
		else if (concreteSelect==4) {
			System.out.println("C40 Concrete Class m3 Price : 1950 TL");
		}
		else if (concreteSelect==5) {
			System.out.println("C45 Concrete Class m3 Price : 2100 TL");
		}
		else if (concreteSelect==6) {
			System.out.println("C50 Concrete Class m3 Price : 2300 TL");
		}else {
			System.out.println("Lutfen 1-6 arasi sayi giriniz..");
		}
		
		System.out.println(line);
		System.out.println("*************     QUANTITY CALCULATION     *************");
		System.out.println("Please Enter Column-Beam-Slab Lengths In Meters Respectively :");
		System.out.println(line);
		System.out.println("*****  Column Information  *****");
		System.out.println(line);
		
		System.out.println("Please Enter The Short Edge Of The Column: (meters) ");
		double columnShort=scanner.nextDouble();
		
		System.out.println("Please Enter The Long Edge Of The Column: (meters) ");
		double columnLong=scanner.nextDouble();
		
		System.out.println("Please Enter The Height of Column : (meters) ");
		double columnHeight=scanner.nextDouble();
		
		System.out.println("Please Enter The Number of Columns : (int)");
		int columnNumber=scanner.nextInt();
		
		
		Column column2 =new Column(columnShort, columnLong, columnHeight, columnNumber);
		double b =column2.calculation_columnVolume(column2);
		
		double c=a1*b;
		
		float k = (float) Math.round(b * 100) / 100;
		float k2 = (float) Math.round(c * 100) / 100;
		
		double d=column2.getUnitWeightOfConcrete();
		
		float k3= (float) Math.round(d * 100) / 100;
		
		System.out.println(line);
		System.out.println("Column Total Volume: " + k + " m3");
		System.out.println("Column Concrete Price: " + k2 + " TL");
		System.out.println("Column Weight : " + k*k3 + " ton");
		System.out.println(line);
		System.out.println("******  Beam Information  *****");
		
		System.out.println("Please Enter The Width Of The Beam : (meters) ");
		double beamWidth=scanner.nextDouble();
		
		System.out.println("Please Enter The Height Of The Beam : (meters) ");
		double beamHeight=scanner.nextDouble();
		
		System.out.println("Please Enter The Length Of The Beam : (meters) ");
		double beamLength=scanner.nextDouble();
		
		System.out.println("Please Enter The Number Of The Beams : (int) ");
		int beamNumber=scanner.nextInt();
		
		
		Beam beam2 =new Beam(beamWidth, beamHeight, beamLength, beamNumber);
		double b2 =beam2.calculation_beamVolume(beam2);
		
		double c2=a2*b2;
		
		float k4 = (float) Math.round(b2 * 100) / 100;
		float k5 = (float) Math.round(c2 * 100) / 100;
		
        double d2=beam2.getUnitWeightOfConcrete();
		
		float k6= (float) Math.round(d2 * 100) / 100;
		System.out.println(line);
		System.out.println("Beam Total Volume: " + k4 + " m3");
		System.out.println("Beam Concrete Price : " + k5 + " TL");
		System.out.println("Beam Weight : " + k4*k6 +" ton");
		System.out.println(line);
		
		
		System.out.println("*****  Slab Information  *****");
		
		System.out.println("Please Enter The Width Of The Slab : (meters) ");
		double slabWidth=scanner.nextDouble();
		
		System.out.println("Please Enter The Length Of The Slab : (meters) ");
		double slabLength=scanner.nextDouble();
		
		System.out.println("Please Enter The Thickness Of The Slab : (meters) ");
		double slabThickness=scanner.nextDouble();
		
		System.out.println("Please Enter The Number Of The Slabs : (int) ");
		int slabNumber=scanner.nextInt();
		
		
		Slab slab2 =new Slab(slabWidth, slabLength, slabThickness, slabNumber);
		double b3 =slab2.calculation_slabVolume(slab2);
		
		double c3=a3*b3;
		
		float k7 = (float) Math.round(b3 * 100) / 100;
		float k8 = (float) Math.round(c3 * 100) / 100;
		
        double d3=slab2.getUnitWeightOfConcrete();
		
		float k9= (float) Math.round(d3 * 100) / 100;
		System.out.println(line);
		System.out.println("Slab Total Volume: " + k7 + " m3");
		System.out.println("Slab Concrete Price : " + k8 +" TL");
		System.out.println("Slab Weight : " + k7*k9 + " ton");
		
		System.out.println(line);
		System.out.println(line);
		
		System.out.println("******  TOTAL AMOUNT PAYABLE  *****");
		System.out.println(k2+k5+k8 + " TL");
		System.out.println("******  TOTAL CONCRETE QUANTITY  ******");
		System.out.println(k+k4+k7 + " M3");
		
		System.out.println(line);
		System.out.println("Thank you for choosing us :) ....");
		System.out.println(line);
		}
		catch (Exception e) {
			System.out.println("PLEASE CHECK THE INPUT. WARNING : " + e.toString());
		}
	}
}
