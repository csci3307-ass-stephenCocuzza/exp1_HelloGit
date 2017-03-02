/**
 * 
 */
package com.mycompany.exp1.village;

import com.mycompany.exp1.village.HasVillagers;

/**
 * @author scocuzza
 *
 */
public class Village implements HasVillagers, GrowingVillage {
	private int numberOfVillagers;
	
	public Village(int numberOfVillagers) {
		this.numberOfVillagers = numberOfVillagers;
	}
	
	@Override
	public int countOfVillagers() {
		return numberOfVillagers;
	}
	
	@Override
	public int addVillager(int addedVillagers) {
		// TODO Auto-generated method stub
		numberOfVillagers += addedVillagers;
		return numberOfVillagers;
	}

	
	}
	
}
