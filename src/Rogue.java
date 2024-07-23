public class Rogue  extends Character{
    //Declare Variable
     public int dexterity = 20;
     public Rogue(){
         super();
         this.strength = 8;
         this.defense  = 4;
         this.health = 100;

     }
    //Declare the attack() method
    public int attack(Character target){
        boolean criticalHit = Main.generator.nextInt(100) < dexterity;
        int damage = this.strength * 2;
        if(criticalHit){
            damage*=2;
            System.out.println("**Critical Hit**");
        }
        int damageDealt = target.takeDamage(damage);
        return damageDealt;
    }
}