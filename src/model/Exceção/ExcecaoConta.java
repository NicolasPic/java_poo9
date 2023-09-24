package model.Exceção;

public class ExcecaoConta extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcecaoConta(String msg) {
		super(msg);
	}
}
