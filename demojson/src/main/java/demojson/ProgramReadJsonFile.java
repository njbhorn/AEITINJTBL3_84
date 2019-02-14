package demojson;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import refactored.Car;

public class ProgramReadJsonFile {

	public static void main(String[] args) {

		try {

//			FileReader fr = new FileReader("car.json");
//			BufferedReader br = new BufferedReader(fr);
//			String line = "";
			ObjectMapper mapper = new ObjectMapper();
			
			File file = new File ( "Car.json") ;
			
			List<Car> cars = mapper.readValue(file, new TypeReference<List<Car>>() {});
				
			for ( Car c : cars ) {
				System.out.println(c);
			}

//			jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
//
//			System.out.println(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
