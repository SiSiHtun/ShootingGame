
public class DropEnemy extends Enemy {

	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void move() 
	{
		super.move();
		vy=vy+0.1;
	}

}
