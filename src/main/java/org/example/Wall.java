package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double param1){
        if(param1<0){
            width=0;
        }else{
            width=param1;
        }
    }
    public void setHeight(double param1){
        if(param1<0){
            height=0;
        }else {
            height=param1;
        }
    }
    public double getArea(){
        return width*height;

    }
}
