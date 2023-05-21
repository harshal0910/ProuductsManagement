package custom_exception;

@SuppressWarnings("serial")
public class ProductHandlingException extends Exception{
	public ProductHandlingException(String msg){
		super(msg);
	}
}
