import java.util.ArrayList;

public class Pictures {
	private ArrayList<TurtleDrawing> pictures;

	public Pictures() {
		this.pictures = new ArrayList<TurtleDrawing>();
	}

	public void addPicture(TurtleDrawing td) {
		this.pictures.add(td);
	}

	public void draw() {
		for (TurtleDrawing td : pictures) {
			td.draw();
		}
	}

	public static void main(String[] args) {
		double x0 = 0.25;
		double y0 = 0.1;
		double a0 = 0.0;

		double x1 = 0.50;
		double y1 = 0.25;
		double a1 = 45.0;



		Turtle turt1 = new Turtle(x0, y0, a0);
		//Turtle turt2 = new Turtle(x1, y1, a1);
		TurtleDrawing td1 = new t1(turt1);

		TurtleDrawing td2 = new t2(turt1);

		TurtleDrawing td3 = new CircleTurtleDrawing(turt1);

		Pictures p = new Pictures();

		p.addPicture(td1);
		p.addPicture(td2);
		p.addPicture(td3);

		p.draw();
		p.draw();
		p.draw();
		p.draw();

	}

}
