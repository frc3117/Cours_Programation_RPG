package RPG.Class;

import RPG.Class.Interface.Entity;

public class Enemy implements Entity
{
    public Enemy(int maxHp, int armorPoint, int magicResist, int atkPoint, int manaPoint)
    {
       _maxHp = maxHp;
       _armorPoint = armorPoint;
       _magicResist = magicResist;
       _atkPoint = atkPoint;
       _manaPoint = manaPoint;
       _currentHp = _maxHp;
       
    }
    private int _maxHp;
    private int _currentHp;
    private int _armorPoint;
    private int _magicResist;   
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

}
