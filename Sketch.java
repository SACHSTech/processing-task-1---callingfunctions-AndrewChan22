import processing.core.PApplet;

public class Sketch extends PApplet {
	

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
      //()
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(163,203,240);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  

    noStroke();

    //rect draws from top left corner, ellipse draws from centre
    //draw ground level
    fill(113,81,55);
    rect(0, 650, 800, 200);
    grass(0, 650);
    grass(200, 650);
    grass(400, 650);
    grass(600, 650);
    grass(750, 650);

    fill(147,192,97);
    rect(0,650,800,45);

    //tree trunk
    fill(92,72,42);
    rect(600,350,80,300);

    wood(650,350);

    wood(605,450);

    wood(655,500);

    wood(640, 550);

    wood(660, 600);

    //sun 
    fill(255, 255, 35);
    ellipse(100,100,75,75);

    //leaves

    fill(41,110,11);

    ellipse(640,250,300,300);

    //additional leaves


    ellipse(640,250,300,300);


    triangle(650,240,550,140,450,260);

    ellipse(590,350,200,100);



    ellipse(600,150,150,50);

    ellipse(570,234,150,50);





    

  
    


  }


  
  // define other methods down here.
  public void grass(float x, float y) {


    fill(147,192,97);
    rect(x, y, 50, 75);
  
    }

  public void wood(float x, float y) {

    fill(115, 90, 53);
    rect(x, y, 20, 30);
    
  }


  
}

