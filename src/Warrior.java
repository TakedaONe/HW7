class Warrior extends Hero {
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior use ability" + getSuperAbilityType());
    }
}