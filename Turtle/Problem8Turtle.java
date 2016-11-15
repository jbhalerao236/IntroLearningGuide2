import processing.core.PApplet;
public class Problem8Turtle extends PApplet {
	public static Turtle lyrtle;
	public void setup() {
		size(1000, 600);			// set the size of the window
		noLoop();				
        background( 255 );		// set the background color
	Turtle lyrtle= new Turtle(this);
	
	
	for (int c = 0; c < 10; c++){
		for (int l = 0; l < 1; l++){
		lyrtle.setThickness(1);
		lyrtle.penup();
		lyrtle.turnRight(180);
		lyrtle.forward(500);
	    lyrtle.turnRight(90);
	    lyrtle.forward(300);
	    lyrtle.turnRight(90);
	    lyrtle.pendown();
	    lyrtle.forward(20);
	    lyrtle.turnRight(90);
	    lyrtle.forward(20);
	    lyrtle.turnRight(90);
	    lyrtle.forward(20);
	    lyrtle.turnRight(90);
	    lyrtle.forward(20);
	    lyrtle.turnRight(90);
	    lyrtle.forward(20);
	}
	}
	}
	}

