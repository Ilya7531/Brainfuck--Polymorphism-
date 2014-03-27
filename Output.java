package javaapplication7;
import static javaapplication7.Term.data;

class Output extends Term {
	
	public void doProcess() {
		System.out.print((char) data[dataPointer]);
	}
}