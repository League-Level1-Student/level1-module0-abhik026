float x = random(width);
float y = random(height);
void setup(){
size(800,800);
background(100,150,0);
}
void draw(){
makeMagical();
  for(int i = 0; i<800; i+=8/3){
fill(frameCount,i+10,250);
    x = random(width);
y = random(height);
  noStroke();
  ellipse(getWormX(i),getWormY(i),10,10);
}
}
    float frequency = .051;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
