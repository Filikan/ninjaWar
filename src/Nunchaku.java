public class Nunchaku extends Weapon{
    public Nunchaku(String description) {
        super(description);
    }

    @Override
    public boolean Hit() {
        System.out.println("Nunchaku move was made!");
        return true;
    }
}
