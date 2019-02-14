import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoExceptions {

	public static void main(String[] args) {

		MyDemoException me = new MyDemoException() ;
		try {
			me.doSomething(99);
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		int arg1, arg2 = 2, result ;



		try {
			arg1 = 10 ;

			result = arg1/ arg2 ;

//			System.out.println(args[0]);

//			FileInputStream fis = new FileInputStream("demo.dat");
//			BufferedInputStream br = new BufferedInputStream ( fis ) ;
//			br.read() ;


		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			System.out.println("Finally, always runs!");
		}

		System.out.println("Finished...");


	}

}
