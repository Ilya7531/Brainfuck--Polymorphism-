package javaapplication7;

class Interpreter {
	
	private final String str;
	private int charPointer = 0;
	
	public Interpreter(String s) {
		str = s;
	}
	
	public boolean hasNextTerm() {
		return charPointer + 1 < str.length();
	}
	
	public Term nextTerm() {
		Term t = null;
		switch (str.charAt(charPointer++)) {
			case Symbol.NEXT:
				t = new Next();
				break;
			case Symbol.PREVIOUS:
				t = new Previous();
				break;
			case Symbol.PLUS:
				t = new Plus();
				break;
			case Symbol.MINUS:
				t = new Minus();
				break;
			case Symbol.OUTPUT:
				t = new Output();
				break;
			case Symbol.INPUT:
				t = new Input();
				break;/*
			case Symbol.BRACKET_LEFT:
				t = new BracketLeft();
				break;
			case Symbol.BRACKET_RIGHT:
				t = new BracketRight();
				break;*/
		}
		return t;
	}
}