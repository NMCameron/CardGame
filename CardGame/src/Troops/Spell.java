package Troops;

public class Spell extends Cards{
	public Spell(int level) {
		super("Spell", level, 0, level, 0, 2 * level, true); //TODO Implement logic to prevent spells from damaging towers. And ask Jacob what to do about spells as a whole.
	}
}
