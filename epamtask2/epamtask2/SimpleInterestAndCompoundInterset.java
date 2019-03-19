
/* program to Calculate SimpleInterest and CompoundInterest*/
package epamtask2;

/*@author Madhavi*/
public class SimpleInterestAndCompoundInterset {
	/*
	 * method which calculates SimpleInterest 
	 * @param principleAmt
	 * @param rateofInetrest
	 * @param timePeriod
	 * SimpleInterest=(PTR)/100
	 */
	public double cal_SimpleInterest(double principleAmt,double rateofInterest,double timePeriod )
	{
		return(((principleAmt* rateofInterest*timePeriod)/100));
	}
	
	/*
	 * method which calculates compoundInterest Annually
	 * CompoundInterest= (P(1+R/100)^n)-amount
	 */
	public double cal_CompoundInterest(double principleAmt,double rateofInterest,double timePeriod )
	{
		double amount=	principleAmt*
				(Math.pow((1+( rateofInterest/100)),timePeriod));
		return (amount-principleAmt);
	}
	
}
