import processing.core.PApplet;

public class Main extends PApplet { 
	public static Turtle yertle;
	
	public void setup() {
		size(1000, 600);			// set the size of the window
		noLoop();				
        background( 255 );		// set the background color
        Turtle gyrtle = new Turtle(this); 
        Turtle myrtle = new Turtle(this);
        Turtle jyrtle = new Turtle(this);
        yertle = new Turtle(this);	// create a new turtle
        for (int c = 0; c < 4; c++){
        	yertle.forward(100);
        	yertle.turnRight(90);
        	
        }
        
        for (int i = 0; i < 3; i++) {
        	
        	myrtle.setThickness(5);
        	
        	myrtle.forward(150);
        	myrtle.turnRight(120);
        }
        
        for (int f = 0; f < 360; f++) {
        	
        	gyrtle.forward(5);
        	gyrtle.turnRight(2);
        	gyrtle.penup();
        	gyrtle.pendown();
        	
        }
        for (int f = 0; f < 360; f++) { 
        	gyrtle.forward(50);
        	gyrtle.turnRight(50);
        }
        
        
        for (int c = 0; c <8 ; c++)  {
        yertle.setColor(color (255,0,0));
        yertle.setDirection(180); // face left

        yertle.penup(); // set turtle NOT to draw

        yertle.forward(20); // go forward

        yertle.pendown(); // set turtle to draw again

        yertle.forward(20); // go forward

        }
        jyrtle.goToPoint(80, 80);
        for (int c = 0; c<8; c = c + 1) 
        {    
    jyrtle.setThickness(5);
	jyrtle.setColor(color(0,0,255));
    jyrtle.forward(50);
    jyrtle.turnRight(45);
  
	}

	}
	
	public static void main(String[] args) {
		PApplet.main(new String[]{"Main"});
	}
}