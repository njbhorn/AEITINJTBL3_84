import java.time.LocalDateTime;

public class MyException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Nigel says..." + super.getMessage() + LocalDateTime.now();
	}



}
