boolean stick=false;
PImage Jacobs;
PImage Mustache;
void setup(){
  size(800,600);
  Jacobs = loadImage("Jacobs.jpeg");
size(800, 600);
Jacobs.resize(width,height);
  background(Jacobs);
    Mustache = loadImage("Mustache.png");

  
  
  
  
  
}
int mx=0;
int my=0;
void draw(){
  background(Jacobs);
  if(stick==true){
    image(Mustache,mx,my,100,100);
   }else
    image(Mustache,mouseX,mouseY,100,100);
  if(mousePressed){
    stick=true;
    mx=mouseX;
    my=mouseY;
  }
  
  
  
  
}