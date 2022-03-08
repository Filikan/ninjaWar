public class StarKnife extends Weapon{
    public StarKnife(String description) {
        super(description);
    }

    @Override
    public boolean Hit() {
        System.out.println("StarKnife move was made!");
        return true;
    }
}
