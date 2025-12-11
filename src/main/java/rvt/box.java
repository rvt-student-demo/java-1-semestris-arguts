package rvt;




public class box {
    private double width;
    private double height;
    private double length;
    private double topArea;
    private double sideArea;
    public boolean nests(box outsideBox){
        return width < outsideBox.getWidth() && height < outsideBox.getHeight() && length < outsideBox.getLength();

        
    }


    public box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
        this.topArea = width * length;
        this.sideArea = length * height;
    }

    public box(box oldBox)
    {
        this.width = oldBox.getWidth();
        this.height = oldBox.getHeight();
        this.length = oldBox.getLength();
        this.topArea = oldBox.getTopArea();
        this.sideArea = oldBox.getSideArea();
    }


    public box(double side)
    {
        width = side;
        height = side;
        length = side;
        topArea = side * side;
        sideArea = side * side;
    }


    public box biggerBox(box oldBox)
    {
        return new box(
            1.25 * oldBox.getWidth(),
            1.25 * oldBox.getHeight(),
            1.25 * oldBox.getLength()
        );
    }

    public box smallerBox(box oldBox)
{
    return new box(
        0.75 * oldBox.getWidth(),
        0.75 * oldBox.getHeight(),
        0.75 * oldBox.getLength()
    );
}
  
    public double volume()
    {
        return width * height * length;
    }

    public double area()
    {
        return 2 * (topArea + sideArea);
    }

    
    public double getWidth()  { return width; }
    public double getHeight() { return height; }
    public double getLength() { return length; }
    public double getTopArea() { return topArea; }
    public double getSideArea() { return sideArea; }
}
