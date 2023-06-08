package Semantico;

import Lexico.Token;

public class AnalisadorSemanticoException {

	public void VariavelDeclaradaException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SEMANTICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ", \n ultimo token lido: "
				+ lookAHead.getLexema() + " : Existe uma variavel de mesmo nome declarada!");
	}

	public void VariavelNaoDeclaradaException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SEMANTICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ", \n ultimo token lido: "
				+ lookAHead.getLexema() + " : Variavel não declarada!");
	}

	public void TipoInvalidoIntException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SEMANTICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ", \n ultimo token lido: "
				+ lookAHead.getLexema() + " : Tipo nao compativel com INT!");
		
	}public void AtribuicaoException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SEMANTICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ",\n ultimo token lido: "
				+ lookAHead.getLexema() + " : Atribuicao mal formada!");
	}

	public void TipoInvalidoCharException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SEMANTICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ", \n ultimo token lido: "
				+ lookAHead.getLexema() + " : Tipo CHAR so e compativel com CHAR!");
	}

	public void ExpressaoRelacionalException(Token lookAHead) throws Exception {
		throw new Exception("\n[ERRO SEMANTICO]\n" + "ERRO na linha "
				+ lookAHead.getLinha() + ", coluna " + lookAHead.getColuna() + ", \n ultimo token lido: "
				+ lookAHead.getLexema() + " : Tipos nao compativeis na expressao relacional!");
	}
}
