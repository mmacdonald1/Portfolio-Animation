import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ball_2 extends PApplet {

class Firefly{
 float x = random(width);
 float y = random(height);
 float xspeed = 10;
 float yspeed = 10;
int alpha = 1, delta = 1; 
boolean fade;
  
  public void display(){
  stroke(217, 192, 157, alpha);
  strokeWeight(10);
  hint(ENABLE_STROKE_PURE);
  fill(240, 225, 174, alpha);
  ellipse(x,y,10,10); 
  }

  public void twinkle() { 
  //fade in and out 
 if (alpha == 0 || alpha == 255) { 
    delta= -delta; 
  } 
  alpha += delta; 
}
  
  public void update(){
  x = x + random(-1.5f,1.5f);
  y = y + random(-1.5f,1.5f);
  }
  
  
}
int alpha = 1, delta = 1; 
boolean fade;

Firefly[] firefly = new Firefly[100];

int total= 1;

public void settings() {
  size(500, 500);
}

public void mousePressed(){
  total = total + 1;
}

public void setup(){
  smooth(); 
  fade = false; 
for(int i=0; i < firefly.length; i++){
firefly[i] = new Firefly();
}
}

public void draw(){
background(6, 11, 16);
for (int i = 0; i < total; i++) {
    // Check if mouse is over the Stripe
    firefly[i].update();
    firefly[i].display();
    firefly[i].twinkle();
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "ball_2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
