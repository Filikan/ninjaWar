public class Sword extends Weapon{

    public Sword(String description) {
        super(description);
    }

    @Override
    public boolean Hit() {
        System.out.println("Sword move was made!");
        return true;
    }
}
