package RPG;

import java.io.IOException;

import RPG.Class.Enemy;
import RPG.Class.Player;

public class Main
{
    public static void main(String[] args) 
    {
        int choice = 99;
        try
        {
            choice = System.in.read();
        }
        catch (IOException e){}
       Player Sage = new Player(Player.ClassType.Wizard) ; 
    }

}