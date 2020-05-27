package RPG.Class;

public class Player 
{
    public enum ClassType
    {
        Warrior,
        Wizard
    }
    public Player(ClassType playerClass)
    {
       switch(playerClass) 
       {
         case Warrior : 
         _maxHp = 20;
         _manaPoint = 12;
         break;

         case Wizard :
         _maxHp = 12;
         _manaPoint = 20;
         break;
       }
       _currentHp = _maxHp;        
    }

    private int _maxHp;
    private int _currentHp;
    private int _armorPoint;
    private int _atkPoint;
    private int _manaPoint;
    private boolean _isDead = false;

    public boolean IsDead()
    {
        return _isDead;
    }
    public int GetHp()
    {
        return _currentHp;
    } 
    public void Heal(int heal) 
    {
      _currentHp += heal;
      if (_currentHp > _maxHp) 
      {
         _currentHp = _maxHp;
      }
    }
    public void Damage(int damage)
    {
        _currentHp -= damage ;
       if (_currentHp <= 0)
       {
           _isDead = true;
       }
    }
}