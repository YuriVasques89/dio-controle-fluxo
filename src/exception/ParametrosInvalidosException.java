package exception;

public class ParametrosInvalidosException extends Exception{
	
	public ParametrosInvalidosException() {
		super("ATENÇÃO: O segundo parâmetro deve ser maior que o primeiro parâmetro.");
	}

}
