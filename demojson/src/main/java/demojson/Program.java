package demojson;

import java.io.BufferedReader;
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Program {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("info.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			ObjectMapper mapper = new ObjectMapper();
			
			do {
				 line = br.readLine() ;
			} while ( !line.equals(null)) ;

			
			String jsonString = "{\"name\":\"Mahesh\",\"age\":21}";

			// map json to student

			Student student = mapper.readValue(jsonString, Student.class);
			System.out.println(student);

			jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);

			System.out.println(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
