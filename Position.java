package hausaufgabe8;

import java.util.ArrayList;

public class Position {
		private ArrayList<Integer> pos;
		public Position(int x,int y) throws WrongPositionException {
			if(x<1||x>8||y<1||y>8) {
				throw new WrongPositionException("die Position liegt außerhalb des Bretts");
			}else {
				ArrayList<Integer> list= new ArrayList<>();
				list.add(x);
				list.add(y);
				this.pos=list;
			}
			
		}
	
		public int getX(){
			return pos.get(0);
		}
		public int getY(){
			return pos.get(1);
		}
		
}
