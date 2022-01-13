package br.com.xti.heranca;

public class SenhaTest {

	static void autenticar(String senha) 
			throws SenhaInvalidaException
	{
		if("123".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
		}else {
			//senha � incorreta
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			autenticar("1234");
		}catch(SenhaInvalidaException e){
			System.out.println(e.getMessage());
		}
	}

}
