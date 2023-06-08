package Sintatico;

import Lexico.Token;

public class AnalisadorSintaticoException {

	public void PrivatePublicExcetion(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " public ou private nao declarados");
	}

	public void IntException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : Declaracao do int mal formada!");
	}

	public void MainException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : Declaracao da main mal formada!");
	}

	public void AbreParentesesException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : falta o '(' !");
	}

	public void FechaParentesesException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : falta o ')' !");
	}

	public void EoFException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : falta o fim do arquivo!");
	}

	public void AbreChaveException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : falta o '{' !");
	}

	public void FechaChaveException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + " ERRtO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : falta o '}' !");
	}

	public void IdentificadorException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : Declaracao da variavel mal formada!");
	}

	public void PontoVirgulaException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " :falta o ';' !");
	}


	public void WhileException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : falta o 'while' depois do '}' !");
	}

	public void OperadorRelacionalException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : Erro na operacao relacional!");
	}

	public void FatorException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SINTATICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : Fator invalido!");
	}
}
