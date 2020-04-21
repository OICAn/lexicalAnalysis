package com.jackiifilwhh.Java;

public class JavaAnalysis {

	public JavaAnalysis() {
	}

	/**
	 * 
	 * @Title: getSYM 
	 * @author: jackiifilwhh
	 * @Description:TODO(得到传入字符串对应的单词，如果返回 _NULL 代表没有对应单词，即错误) 
	 * @param: @param string 
	 * @param: @return 
	 * @return:SYM 
	 * @throws
	 */
	public SYM getSYM(String string) {

		if (string.equals("abstract"))
			return SYM._abstract;
		else if (string.equals("assert"))
			return SYM._assert;
		else if (string.equals("boolean"))
			return SYM._boolean;
		else if (string.equals("break"))
			return SYM._break;
		else if (string.equals("byte"))
			return SYM._byte;
		else if (string.equals("case"))
			return SYM._case;
		else if (string.equals("catch"))
			return SYM._catch;
		else if (string.equals("char"))
			return SYM._char;
		else if (string.equals("class"))
			return SYM._class;
		else if (string.equals("continue"))
			return SYM._continue;
		else if (string.equals("default"))
			return SYM._default;
		else if (string.equals("do"))
			return SYM._do;
		else if (string.equals("double"))
			return SYM._double;
		else if (string.equals("else"))
			return SYM._else;
		else if (string.equals("enum"))
			return SYM._enum;
		else if (string.equals("extends"))
			return SYM._extends;
		else if (string.equals("final"))
			return SYM._final;
		else if (string.equals("finally"))
			return SYM._finally;
		else if (string.equals("float"))
			return SYM._float;
		else if (string.equals("for"))
			return SYM._for;
		else if (string.equals("if"))
			return SYM._if;
		else if (string.equals("implements"))
			return SYM._implements;
		else if (string.equals("import"))
			return SYM._import;
		else if (string.equals("instanceof"))
			return SYM._instanceof;
		else if (string.equals("int"))
			return SYM._int;
		else if (string.equals("interface"))
			return SYM._interface;
		else if (string.equals("long"))
			return SYM._long;
		else if (string.equals("native"))
			return SYM._native;
		else if (string.equals("new"))
			return SYM._new;
		else if (string.equals("package"))
			return SYM._package;
		else if (string.equals("private"))
			return SYM._private;
		else if (string.equals("protected"))
			return SYM._protected;
		else if (string.equals("public"))
			return SYM._public;
		else if (string.equals("return"))
			return SYM._return;
		else if (string.equals("short"))
			return SYM._short;
		else if (string.equals("static"))
			return SYM._static;
		else if (string.equals("strictfp"))
			return SYM._strictfp;
		else if (string.equals("super"))
			return SYM._super;
		else if (string.equals("switch"))
			return SYM._switch;
		else if (string.equals("synchronized"))
			return SYM._synchronized;
		else if (string.equals("this"))
			return SYM._this;
		else if (string.equals("throw"))
			return SYM._throw;
		else if (string.equals("throws"))
			return SYM._throws;
		else if (string.equals("transient"))
			return SYM._transient;
		else if (string.equals("try"))
			return SYM._try;
		else if (string.equals("void"))
			return SYM._void;
		else if (string.equals("volatile"))
			return SYM._volatile;
		else if (string.equals("while"))
			return SYM._while;
		else if (string.equals("="))
			return SYM._ASSIGN;
		else if (string.equals("+"))
			return SYM._PLUS;
		else if (string.equals("-"))
			return SYM._SUB;
		else if (string.equals("*"))
			return SYM._STAR;
		else if (string.equals("/"))
			return SYM._DIV;
		else if (string.equals("<"))
			return SYM._LESS;
		else if (string.equals("<="))
			return SYM._LESSEQ;
		else if (string.equals(">"))
			return SYM._MORE;
		else if (string.equals(">="))
			return SYM._MOREEQ;
		else if (string.equals(","))
			return SYM._DH;
		else if (string.equals("("))
			return SYM._LEFT;
		else if (string.equals(")"))
			return SYM._RIGHT;
		else if (string.equals(";"))
			return SYM._FH;
		else if (string.substring(0,1).equals("\"")&&string.substring(string.length()-1).equals("\""))
			return SYM._INT;

		char ch = string.charAt(0);
		if (isLetter(ch) || ch == '_' || ch == '$') {
			for (int i = 1; i < string.length(); i++) {
				ch = string.charAt(i);
				if (!(isDigit(ch) || isLetter(ch) || ch == '_' || ch == '$'))
					return SYM._NULL;
			}
			return SYM._ID;
		} else if (isDigit(ch)) {
			for (int i = 1; i < string.length(); i++) {
				ch = string.charAt(i);
				if (!(isDigit(ch)))
					return SYM._NULL;
			}
			return SYM._INT;
		}

		return SYM._NULL;
	}

	/**
	 * 
	 * @Title: isLetter   
	 * @author: jackiifilwhh     
	 * @Description: TODO(判断传入字符是否是字母)   
	 * @param: @param c
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	private boolean isLetter(char c) {
		if ((c >= 'a' && c <= 'z') || (c > +'A' && c <= 'Z')) {
			return true;
		} else
			return false;
	}

	/**
	 * 
	 * @Title: isDigit   
	 * @author: jackiifilwhh     
	 * @Description: TODO(判断传入字符是否是数字)   
	 * @param: @param c
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	private boolean isDigit(char c) {
		if (c >= '0' && c <= '9') {
			return true;
		} else
			return false;
	}

}
