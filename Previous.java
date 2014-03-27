package javaapplication7;
import static javaapplication7.Term.dataPointer;

class Previous extends Term {

	public void doProcess() {
		--dataPointer;
	}
}
