import java.util.Random;
public class Main {
    //Random Generator
    public static Random generator = new Random();
    public static void main(String[] args){
        Character player1 = new Character(10, 2, 100);
        Character player2 = new Rogue();
     //Set player1's name and health
        player1.strength = 2;
        player1.defense = 1;


     //set player2's name and health
        player2.name = "Cheetah";
        player2.strength = 2;
        player2.health = 50;
        player2.defense = 2;

        System.out.println(player1.name  + " vs. " + player2.name);
        System.out.println(player2.health + " vs. " + player2.health);

        //Check if player1 and player2 are alive
        while(player1.isAlive() && player2.isAlive()){
            System.out.println(player1.name + ": " + player1.health);
            System.out.println(player2.name + ": " + player2.health);

            int damage;
            damage = player1.attack(player2);
            System.out.println(player1.name + " hits " + player2.name + " for " + damage + ".");

            damage = player2.attack(player1);
            System.out.println(player2.name + " hits " + player1.name + " for " + damage + ".");

            //Declare A Winner
            if(player1.isAlive()){
                System.out.println(player1.name + " Wins!");

            }
            else if(player2.isAlive()){
                System.out.println(player2.name + " Wins!");

            }
            else{
                System.out.println("It is a draw!");
            }
        }
    }
}
