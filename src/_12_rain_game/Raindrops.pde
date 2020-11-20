int y  = 5;
int x = (int) random(width);
int score = 0;
void setup(){
 size(500,500);
}

void draw() {
background(80,175,250);
  textSize(16);
    text("Score: " + score, 20, 20);
fill(5, 5, 150);
stroke(0, 0, 250);
ellipse(x,y,30, 50);
y+=10;
if(y>=500){
y=5;
checkCatch(x);
x =(int) random(width);
}
rect(mouseX-30, 475, 60, 120);

}


  void checkCatch(int x){
         if (x > mouseX-50 && x < mouseX+20)
            score++;
         else if (score > 0) 
            score--;
            fill(0, 0, 0);
  
    }
