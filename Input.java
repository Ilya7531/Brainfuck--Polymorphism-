package javaapplication7;

import java.io.IOException;
import static javaapplication7.Term.data;

class Input extends Term {
	
	public void doProcess() {
		try {
			data[dataPointer] = (int) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

