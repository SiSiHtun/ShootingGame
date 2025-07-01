
public class PlayerBullet extends Character {
		//10-1
		
			public void draw(MyFrame f) {
				f.setColor(0, 20, 15);
				f.fillRect(x, y+3, 10, 30);
				
		
			}
		public PlayerBullet(double x,double y,
				             double vx,double vy) {
			
			//Characterクラスのコンストラクタ呼び出し (8章)
			super(x,y,vx,vy);
			
			
			
		}
		
		

	}