package RPG;

import RPG.Class.Enemy;
import RPG.Class.Player;

public class Main
{
    public static void main(String[] args) 
    {
        Player bob = new Player(Player.ClassType.Wizard) ;
        Enemy roger = new Enemy(15, 0, 8, 3, 1000);
        bob.DamageEntity(roger);
        System.out.println(roger.GetHp());
    }

}