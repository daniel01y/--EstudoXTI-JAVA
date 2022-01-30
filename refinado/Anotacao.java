package br.com.xti.refinado;

import java.io.Serializable;

/*
 * Institui��o: 		Universidade XTI
 * Projeto:     		Sistema de Avalia��es 
 * Data de Cria��o: 	08/10/2021
 * Criador:				Ricardo lopes Costa
 * Revis�o:				2
 */

@Cabecalho(
		instituicao = "Universidade XTI",
		projeto = "Sistema de Avalia��es",
		dataCriacao = "08/10/2011",
		criador = "Ricardo Lopes Costa",
		revisao = 2
)
@ErrosCorrigidos(erros = {"0001", "0002"})
@SuppressWarnings("serial")
public class Anotacao implements Serializable{
	@SuppressWarnings("unused")
	private int x;
	
	@SuppressWarnings("unused")
	@Deprecated
	private void anotar() {}
	
	@Override
	public String toString() {
		return null;
	}
}
