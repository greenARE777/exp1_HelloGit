/**
 * 
 */
package com.mycompany.exp1.village;
import com.mycompany.exp1.village.HasVillagers;
/**
 * @author green
 *
 */
public class Village implements HasVillagers, GrowingVillage {
private int numberOfVillagers;

public Village(int numberOfVillagers) {
	this.numberOfVillagers = numberOfVillagers;
}
	@Override
	public int countofVillagers() {
		// TODO Auto-generated method stub
		return numberOfVillagers;	
	}
	public int addVillagers(int addedVillagers) {
		int population;
		population = addedVillagers + numberOfVillagers;
		return population;
	}

}
