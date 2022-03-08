public class Ninja {
    private Weapon MyWeapon;
    private int damage;
    private int stamina = 10;

    public boolean Attack(Ninja Rival)
    {
        System.out.println("Rival was attacked.");
        stamina--;
        System.out.println("Stamina:"+stamina);
        return true;
    }

}
