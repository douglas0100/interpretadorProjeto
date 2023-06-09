package Lexico;

public class Token {
	private int linha;
	private int coluna;
	private Enum gramatica;
	private String lexema;
	
	public Token() {
		this.linha = 0;
		this.coluna = 0;
	}
	public Token(Enum gramatica, String lexema, int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.gramatica = gramatica;
		this.lexema = lexema;
	}

	
	public int getLinha() {
		return linha - 1;
	}

	public int getColuna() {
		return coluna;
	}

	public Enum getGramatica() {
		return gramatica;
	}

	public String getLexema() {
		return lexema;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public void setGramatica(Enum gramatica) {
		this.gramatica = gramatica;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}

	@Override
	public String toString() {
		return "TOKEN | " + gramatica + " = " + lexema;
	}
	public void exibirInformacoes() {
		System.out.println("Lexema: "+getLexema()+"\nLinha: " +getLinha()+"\nColuna: "+getColuna() + "\\nDescricao: "+getGramatica());
	}
	public static Enum isPalavraReservada(String lexema) {
		switch (lexema) {
			case "abstract":
				return Gramatica.PALAVRA_RESERVADA_ABSTRACT;
			case "as":
				return Gramatica.PALAVRA_RESERVADA_AS;
			case "base":
				return Gramatica.PALAVRA_RESERVADA_BASE;
			case "bool":
				return Gramatica.PALAVRA_RESERVADA_BOOL;
			case "break":
				return Gramatica.PALAVRA_RESERVADA_BREAK;
			case "byte":
				return Gramatica.PALAVRA_RESERVADA_BYTE;
			case "case":
				return Gramatica.PALAVRA_RESERVADA_CASE;
			case "catch":
				return Gramatica.PALAVRA_RESERVADA_CATCH;
			case "char":
				return Gramatica.PALAVRA_RESERVADA_CHAR;
			case "checked":
				return Gramatica.PALAVRA_RESERVADA_CHECKED;
			case "class":
				return Gramatica.PALAVRA_RESERVADA_CLASS;
			case "const":
				return Gramatica.PALAVRA_RESERVADA_CONST;
			case "continue":
				return Gramatica.PALAVRA_RESERVADA_CONTINUE;
			case "decimal":
				return Gramatica.PALAVRA_RESERVADA_DECIMAL;
			case "default":
				return Gramatica.PALAVRA_RESERVADA_DEFAULT;
			case "delegate":
				return Gramatica.PALAVRA_RESERVADA_DELEGATE;
			case "do":
				return Gramatica.PALAVRA_RESERVADA_DO;
			case "is":
				return Gramatica.PALAVRA_RESERVADA_IS;
			case "double":
				return Gramatica.PALAVRA_RESERVADA_DOUBLE;
			case "else":
				return Gramatica.PALAVRA_RESERVADA_ELSE;
			case "enum":
				return Gramatica.PALAVRA_RESERVADA_ENUM;
			case "event":
				return Gramatica.PALAVRA_RESERVADA_EVENT;
			case "explicit":
				return Gramatica.PALAVRA_RESERVADA_EXPLICIT;
			case "extern":
				return Gramatica.PALAVRA_RESERVADA_EXTERN;
			case "false":
				return Gramatica.PALAVRA_RESERVADA_FALSE;
			case "finally":
				return Gramatica.PALAVRA_RESERVADA_FINALLY;
			case "fixed":
				return Gramatica.PALAVRA_RESERVADA_FIXED;
			case "float":
				return Gramatica.PALAVRA_RESERVADA_FLOAT;
			case "for":
				return Gramatica.PALAVRA_RESERVADA_FOR;
			case "foreach":
				return Gramatica.PALAVRA_RESERVADA_FOREACH;
			case "goto":
				return Gramatica.PALAVRA_RESERVADA_GOTO;
			case "if":
				return Gramatica.PALAVRA_RESERVADA_IF;
			case "implicit":
				return Gramatica.PALAVRA_RESERVADA_IMPLICIT;
			case "in":
				return Gramatica.PALAVRA_RESERVADA_IN;
			case "int":
				return Gramatica.PALAVRA_RESERVADA_INT;
			case "interface":
				return Gramatica.PALAVRA_RESERVADA_INTERFACE;
			case "internal":
				return Gramatica.PALAVRA_RESERVADA_INTERNAL;
			case "sizeof":
				return Gramatica.PALAVRA_RESERVADA_SIZEOF;
			case "lock":
				return Gramatica.PALAVRA_RESERVADA_LOCK;
			case "long":
				return Gramatica.PALAVRA_RESERVADA_LONG;
			case "main":
				return Gramatica.PALAVRA_RESERVADA_MAIN;
			case "public":
				return Gramatica.PALAVRA_RESERVADA_PUBLIC;
			case "private":
				return Gramatica.PALAVRA_RESERVADA_PRIVATE;
			case "static":
				return Gramatica.PALAVRA_RESERVADA_STATIC;
			default:
				return Gramatica.IDENTIFICADOR;
		}
	}
}
