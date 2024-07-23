public class Character {

    //Declare Variables
    public String name;
    public int strength;
    public int health;
    public int defense;

    //List of Names
    public static String[] nameList = {"Latte", "Eevee", "Retro" };
    //Declare Character constructor
    public Character(){
        this.name = nameList[Main.generator.nextInt(nameList.length)];
    }

    public Character(int str, int def, int health) {
     this();
     this.strength = str;
     this.defense = def;
     this.health = health;
    }

    //Declare the takeDamage() method
    public int takeDamage(int damage){
        int damageTaken = damage - this.defense;
        this.health -= damageTaken;
        return damageTaken;
    }

    //Declare the attack() method
    public int attack(Character target){
        int damage = this.strength * 2;
        int damageDealt = target.takeDamage(damage);
        return damageDealt;
    }

    //Declare isAlive() method
    public boolean isAlive(){
        return this.health > 0;
    }
}
