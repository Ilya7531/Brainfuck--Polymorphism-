package javaapplication7;
import static javaapplication7.Term.data;

class Minus extends Term {
	
	public void doProcess() {
		--data[dataPointer];
	}
}
