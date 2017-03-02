/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author green
 *
 */
public class Mushu implements Dragon {

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#breathesFire()
	 */
	@Override
	public boolean breathesFire() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() {
		// TODO Auto-generated method stub
		return new Boolean(false);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#eatsVillagers(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatsVillagers(Village village) {
		// TODO Auto-generated method stub
		return false;
	}

}
