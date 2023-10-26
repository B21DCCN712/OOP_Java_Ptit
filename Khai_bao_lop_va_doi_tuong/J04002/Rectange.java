package J04002;

public class Rectange {
    private double width , height;
    String color;
    public Rectange(){
        this.width=1;
        this.height=1;
    }
    public Rectange(double width , double height , String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public double findArea(){
        return width * height ;
    }
    public double findPerimeter(){
        return 2*(width+height);
    }
}
