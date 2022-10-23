
/** package com.journaldev.design.chainofresponsibility;
 *package chinof.responsibality;
 * @author Khalid Rashidi
 */
public class DispenseChain {
   

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}
}
