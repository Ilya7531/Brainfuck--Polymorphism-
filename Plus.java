package javaapplication7;
import static javaapplication7.Term.data;

class Plus extends Term {
	
	public void doProcess() {
		++data[dataPointer];
	}
}