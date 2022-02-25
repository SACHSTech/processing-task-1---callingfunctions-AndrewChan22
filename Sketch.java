/*
-------------------------------------------------------------------------
Name:		Sketch.java

Purpose: 5.2 Processing Task 1 - Calling Functions

Author:	Chan. A

Created:	date in 02/22/2022
-------------------------------------------------------------------------
*/

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
	  
    // draw ground

    noStroke();

    fill(113, 81, 55);
    rect(0, 650, 800, 200);
    grass(0, 650);
    grass(200, 650);
    grass(400, 650);
    grass(600, 650);
    grass(750, 650);

    fill(147, 192, 97);
    rect(0, 650, 800, 45);


    stroke(0, 0, 0);
    strokeWeight(1);

    // draw sun 
    fill(255, 255, 35);
    ellipse(100, 100, 75, 75);

    line(138, 100, 185, 100);
    line(100, 138, 100, 185);

    line(127, 127, 160, 160);

    // draw house
    fill(168, 97, 87);
    rect(225, 325, 350, 325);

    // draw roof
    fill(124, 117, 110);
    triangle(400, 175, 165, 325, 635, 325);

    // draw left window
    fill(122, 184, 221);
    ellipse(313, 420, 50, 75);
    line(288, 420, 338, 420);
    line(313, 383, 313, 457);

    // draw right window
    ellipse(488, 420, 50, 75);
    line(464, 420, 513, 420);
    line(488, 383, 488, 456);

    // draw door
    fill(123, 68, 29);
    rect(350, 500, 100, 150);

    // draw door knob
    fill(70, 71, 77);
    ellipse(375, 565, 15, 15);

    // draw clouds
    noStroke();
    fill(255, 255, 255);
    ellipse(300, 50, 100, 50);
    ellipse(350, 70, 100, 50);

    ellipse(550, 50, 100, 50);
    ellipse(600, 70, 100, 50);
    ellipse(630, 50, 100, 50);



  }


  
  // define other methods down here.
  

  
  /**
   * Given two floats, return the x and y coordinates of a rectangle
   * 
   * @param x The first x coordinate
   * @param y The first y coordinate
   * @return the two floats as the x and y coordinate of a rectangle
   * @author A. Chan
   */
    public void grass(float x, float y) {

    fill(147, 192, 97);
    rect(x, y, 50, 75);
  
    }


  
}

