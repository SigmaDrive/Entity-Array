public class Ent
{
  public Ent(long ent_seed)
  {
    public int aggro = (int)(ent_seed / 1000000000);
    public int strength = (int)((ent_seed / 100000000)) % 10; // uses second digit in the seed
    public int defense = (int)((ent_seed / 10000000) % 100); // uses third digit in the seed
  }
}
