package javaapplication7;
import static javaapplication7.Term.dataPointer;

class Next extends Term {

	public void doProcess() {
		++dataPointer;
	}
}