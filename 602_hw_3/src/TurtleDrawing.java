
public abstract class TurtleDrawing
{
	protected Turtle turtle;
	
	TurtleDrawing(Turtle turt){
		turtle = turt;
	}
	
	public abstract void draw();
	
	
	
	public static void main(String[] args)
	{
		

	}

}

class t1 extends TurtleDrawing{
	
	t1(Turtle turt) {
		super(turt);
		super.turtle = turt;

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}

class t2 extends TurtleDrawing{
	
	t2(Turtle turt) {
		super(turt);
		super.turtle = turt;

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}