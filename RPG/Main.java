package RPG;

import java.io.IOException;

import RPG.Class.Enemy;
import RPG.Class.Player;
import RPG.Class.Player.ClassType;

public class Main
{
    public static void main(String[] args) 
    {
        ClassType playerClass = ClassType.Warrior;
        boolean isChosen = false;
        while (!isChosen)
        {
            System.out.println("Select your class:");
            System.out.println("0) Warrior");
            System.out.println("1) Wizard");
            int choice = 99;
            try
            {  
                choice = Integer.parseInt(System.console().readLine());
            }  
            catch (NumberFormatException e) {}
            
            for (int i = 0; i < 100; ++i) System.out.println();
            
            switch(choice)
            {
                case 0:
                    playerClass = ClassType.Warrior;
                    isChosen = true;
                    System.out.println("You are a Warrior now");
                break; 

                case 1:
                    playerClass = ClassType.Wizard;
                    isChosen = true;
                    System.out.println("You are a Wizard Harry");
                break;
            }
            

        }
            Player Sage = new Player(playerClass) ; 
    }

}