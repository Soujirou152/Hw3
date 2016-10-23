
public abstract class TurtleDrawing {
	protected Turtle turtle;

	TurtleDrawing(Turtle turt) {
		turtle = turt;
	}

	public abstract void draw();

	public static void main(String[] args) {
		double x0 = 0.5;
		double y0 = 0.0;
		double a0 = 60.0;

		double x1 = 0.75;
		double y1 = 0.25;
		double a1 = 90.0;

		Turtle t1 = new Turtle(x0, y0, a0);
		TurtleDrawing td1 = new t1(t1);

		Turtle t2 = new Turtle(x1, y1, a1);
		TurtleDrawing td2 = new t2(t2);

		td1.draw();
		td2.draw();

	}

}

class t1 extends TurtleDrawing {

	t1(Turtle turt) {
		super(turt);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		double step = Math.sqrt(3) / 2;

		super.turtle.penDown();
		super.turtle.goForward(step);
		super.turtle.turnLeft(120.0);
		super.turtle.goForward(step);
		super.turtle.turnLeft(120.0);
		super.turtle.goForward(step);
		super.turtle.turnLeft(120.0);
		super.turtle.penUp();
		super.turtle.goForward(.025);
	}
}

class t2 extends TurtleDrawing {

	t2(Turtle turt) {
		super(turt);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		double step = .5;

		super.turtle.penDown();
		super.turtle.goForward(step);
		super.turtle.turnLeft(90.0);
		super.turtle.goForward(step);
		super.turtle.turnLeft(90.0);
		super.turtle.goForward(step);
		super.turtle.turnLeft(90.0);
		super.turtle.goForward(step);
		super.turtle.turnLeft(90.0);
		super.turtle.penUp();
		super.turtle.goForward(.025);
	}
}

class CircleTurtleDrawing extends TurtleDrawing {

	CircleTurtleDrawing(Turtle turt) {
		super(turt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			super.turtle.penDown();
			for (int j = 0; j < 360; j++) {
				double radius = .05;
				super.turtle.goForward(radius * .0174);
				super.turtle.turnLeft(1);
			}
			super.turtle.penUp();
//			super.turtle.turnLeft(150);
			super.turtle.goForward(.18);
		}
		super.turtle.penUp();
		super.turtle.turnLeft(90);
		super.turtle.goForward(.025);

	}

}