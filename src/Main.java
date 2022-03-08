import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
	    Sword sword = new Sword("Sword");
	    StarKnife starKnife = new StarKnife("StarKnife");
	    Nunchaku nunchaku = new Nunchaku("Nunchaku");
        Ninja ninja = new Ninja();
        Ninja rival = new Ninja();

        System.out.println("Choose your weapon:\nSword:Press 1\nStarKnife:Press 2\nNunchaku:Press 3");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		if(ans==1){
			sword.Hit();
			ninja.Attack(rival);
		}
		else if(ans==2)
		{
			starKnife.Hit();
			ninja.Attack(rival);
		}
		else if(ans==3)
		{
			nunchaku.Hit();
			ninja.Attack(rival);
		}
		else
		{
			System.out.println("Wrong answer!");
			exit(0);
		}
    }
}
