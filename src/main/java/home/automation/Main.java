package home.automation;

import home.automation.switches.BigOldMasterSwitch;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		BigOldMasterSwitch s = new BigOldMasterSwitch();
		s.press();

		s.press();
	}

}
