package RPG.Class;

public class DamageSpell 
{
    public DamageSpell(String name, int spellDamage, int manaCost)
    {
        _name = name;
        _spellDamage = spellDamage;
        _manaCost = manaCost;
    }
    private String _name;
    private int _spellDamage;
    private int _manaCost;

    public String GetName()
    {
        return _name;
    }
    public int GetSpellDamage()
    {
        return _spellDamage;
    }
    public int GetManaCost()
    {
        return _manaCost;
    }

}