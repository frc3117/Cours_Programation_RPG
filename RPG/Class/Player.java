package RPG.Class;

import RPG.Class.Interface.Entity;

public class Player implements Entity
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
         _atkPoint = 7;
         break;

         case Wizard :
         _maxHp = 12;
         _manaPoint = 20;
         _atkPoint = 3;
         break;
       }
       _currentHp = _maxHp;        
    }

    private int _maxHp;
    private int _currentHp;
    private int _armorPoint;
    private int _atkPoint;
    private int _magicResist;
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
        _currentHp -= Math.max(damage - _armorPoint, 0);
       if (_currentHp <= 0)
       {
           _isDead = true;
       }
    }
    public void DamageEntity(Entity entity)
    {
       entity.Damage(_atkPoint);
    }
    public void MagicDamage(int damage)
    {
        _currentHp -= Math.max(damage - _magicResist, 0);
       if (_currentHp <= 0)
       {
           _isDead = true;
       }
    }
    public void MagicDamageEntity(Entity entity, DamageSpell spell)
    {
        if (_manaPoint >= spell.GetManaCost())
        {
          entity.MagicDamage(spell.GetSpellDamage());
          _manaPoint -= spell.GetManaCost();
        }
        
    }


}