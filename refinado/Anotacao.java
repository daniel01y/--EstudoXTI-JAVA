package br.com.xti.refinado;

import java.io.Serializable;

/*
 * Instituição: 		Universidade XTI
 * Projeto:     		Sistema de Avaliações 
 * Data de Criação: 	08/10/2021
 * Criador:				Ricardo lopes Costa
 * Revisão:				2
 */

@Cabecalho(
		instituicao = "Universidade XTI",
		projeto = "Sistema de Avaliações",
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
