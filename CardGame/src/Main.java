import Troops.Archer;
public class Main {

	public static void main(String[] args) {

		Archer arch = new Archer(5);
		
		System.out.println("Name: " + arch.getTroopName() + "\nLevel: " + arch.getLevel() + "\nHit Points: " + arch.getHitPoints() 
		+ "\nAttack Damage: " + arch.getAttackDamage() + "\nMovement Speed: " + arch.getMovementSpeed() + "\nAttack Range: " 
		+ arch.getAttackRange() + "\nCan Attack Troops: " + arch.checkCanAttackTroops());
	}

}
