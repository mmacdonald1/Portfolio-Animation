class Firefly{
 float x = random(width);
 float y = random(height);
 float a = random(10,12);
 float xspeed = 10;
 float yspeed = 10;
int alpha = 1, delta = 1; 
boolean fade;
  
  void display(){
  stroke(217, 192, 157, alpha);
  strokeWeight(10);
  hint(ENABLE_STROKE_PURE);
  fill(240, 225, 174, alpha);
  ellipse(x,y,10,10); 
  }

  void twinkle() { 
  //fade in and out 
 if (alpha == 0 || alpha == 255) { 
    delta= -delta; 
  } 
  alpha += delta; 
}
  
  void update(){
  x = x + random(-1.5,1.5);
  y = y + random(-1.5,1.5);
  }
  
  
}