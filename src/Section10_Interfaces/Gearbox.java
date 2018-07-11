/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section10_Interfaces;

public class Gearbox {
	
	private boolean clutchIsIn;

	public void operateClutch(boolean inOrOut) {
		this.clutchIsIn = inOrOut;
	}

}

