package tasks;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.testng.annotations.Test;

public class Patternprinting {

	@Test
	public void pattern() {
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
}
