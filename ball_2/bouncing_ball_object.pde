int alpha = 1, delta = 1; 
boolean fade;

Firefly[] firefly = new Firefly[100];

int total= 1;

void settings() {
  size(1500, 1000);
}

void mousePressed(){
  total = total + 1;
}

void setup(){
  smooth(); 
  fade = false; 
for(int i=0; i < firefly.length; i++){
firefly[i] = new Firefly();
}
}

void draw(){
background(6, 11, 16);
for (int i = 0; i < total; i++) {
    // Check if mouse is over the Stripe
    firefly[i].update();
    firefly[i].display();
    firefly[i].twinkle();
  }
}