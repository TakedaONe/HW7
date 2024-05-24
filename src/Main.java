public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 10 ,"magic"),
                new Medic(130, 0, "sait", 20),
                new Warrior(200 ,10 , "ORAORA")
        };
        for (Hero hero: heroes){
            hero.applySuperAbility();
            if (hero instanceof Medic){
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("HEAL + " + medic.getHealPoints());
            }
        }
    }
}
