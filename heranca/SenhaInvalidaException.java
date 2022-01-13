package br.com.xti.heranca;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends Exception {

	public SenhaInvalidaException(String mensagem){
		super(mensagem);
	}
}
