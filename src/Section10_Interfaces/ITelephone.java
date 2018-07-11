/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section10_Interfaces;

public interface ITelephone {
	void powerOn();
	void dial(int phoneNumer);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
	
}

