package RPG.Class.Interface;

import RPG.Class.DamageSpell;

public interface Entity 
{
    public boolean IsDead();
    public int GetHp();
    public void Heal(int heal);
    public void Damage(int damage);
    public void DamageEntity(Entity entity);
    public void MagicDamage(int damage);
    public void MagicDamageEntity(Entity entity, DamageSpell spell);
}