package json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import refactored.Car;

public class ProcessCarJson {
	
	Car[] cars ;

	public ProcessCarJson(String fileName)  {

		FileReader fr;
		BufferedReader br ;
		ObjectMapper om ;
		try {
			fr = new FileReader ( fileName );
			br = new BufferedReader ( fr ) ;
			om = new ObjectMapper() ;
			cars = om.readValue( br,  Car[].class ) ;
			System.out.println(Arrays.toString(cars));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Car[] returnCarArray () {
		return cars ;
	}
	
	public List<Car> returnCarList() {
		return Arrays.asList(cars);
		
	}

}
