package RPG.Class.Interface;

public interface Entity 
{
    public boolean IsDead();
    public int GetHp();
    public void Heal(int heal);
    public void Damage(int damage);
    public void DamageEntity(Entity entity);
}