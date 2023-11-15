public class Main {
    public static void main(String[] args) {
        Hero[] heroes = creatHeroes();
        System.out.println(" HERO INFORMATION: ");
        for (Hero hero : heroes) {
            System.out.println("Health " + hero.getHealth() + " Damage " + hero.getDamage() +
                    " Protection Type " + hero.getSuperPower());
        }

        Boss boss = new Boss();

        boss.setHealth(500);
        boss.setDamage(50);
        boss.setProtectionType("Block");
        System.out.println(" BOSS INFORMATION: ");
        System.out.println("Health " + boss.getHealth() + " Damage " + boss.getDamage() +
                " Protection Type " + boss.getProtectionType());

    }

    public static Hero[] creatHeroes() {
        Hero one = new Hero(400, 60, "Magic");
        Hero two = new Hero(600, 40);
        Hero three = new Hero();

        Hero[] heroes = {one, two, three};
        return heroes;
    }
}