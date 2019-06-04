package json;

import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		
		
		try {
			
			ProcessCarJson pcj = new ProcessCarJson("Car.json") ;
			
			CarFactory cf = new CarFactory() ;
			
			cf.setCarList(pcj.returnCarList());
			
			cf.showBasicData();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
