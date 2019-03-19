package epamtask2;
/* author Madhavi
 * program to estimate construction cost based on given material
 */
public class ConstructionCost {

/* method to calculate estimated cost
 * Consider, standardmaterial as 1
 * above standard material as 2
 * high standard  material as 3
 * automated home as 0
 */

	public double estimateCost(int materialStandard,double areaOfHouse,int automatedHome)
	{
		int cost=0;
		
		if(materialStandard==1)
			cost =1200;
		if(materialStandard==2)
			cost= 1500;
		 if(materialStandard==1&automatedHome==0)
			cost =2500;
		if(materialStandard==3)
			cost=1800;
		return cost*areaOfHouse;
	}
}
