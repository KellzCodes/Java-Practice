package Week2.inheritance;

/*
* Suppose we have a class named Rectangle that represents a rectangle shape to
* be drawn on a graphical window. A Rectangle has four attributes (data members,
* instance variables) specifying the (x, y) coordinate of the upper left corner
* of the Rectangle on the window, the width, and the height of the Rectangle.
* */

/*
* CLASS: Rectangle (Rectangle.java)
*
* Represents a Rectangle that can be drawn on a graphical window
* */


public class Rectangle extends Shape{
    private int mHeight;
    private int mWidth;

    /*
    * Default Constructor.
    * Initializes all instance variables to 0
    * by calling the second constructor
    * */
    public Rectangle(){
        this(0, 0, 0, 0);
    }

    // Second constructor
    public Rectangle(int pX, int pY, int pWidth, int pHeight) {
        super(pX, pY);
        setWidth(pWidth);
        setHeight(pHeight);
    }

    // Third constructor
    public Rectangle (int pX, int pY){
        super(pX, pY);
    }

    // Accessor method for the mHeight data member
    public int getHeight() {
        return mHeight;
    }

    // Accessor method for the mWidth data member
    public int getWidth() {
        return mWidth;
    }

    // Accessor method for the mX data member
    public int getX() {
        return mX;
    }

    // Accessor method for the mY data member
    public int getY() {
        return mY;
    }

    /*
    * Moves this Rectangle to a new location.
    * */
    public void move(int pNewX, int pNewY){
        setX(pNewX);
        setY(pNewY);
    }

    /*
    * Change the size of this Rectangle
    * */
    public void resize(int pNewWidth, int pNewHeight){
        setWidth(pNewWidth);
        setHeight(pNewHeight);
    }

    // Mutator method for the mX data member
    public void setX(int x) {
        mX = x;
    }

    // Mutator method for the mY data member
    public void setY(int y) {
        mY = y;
    }

    // Mutator method for the mWidth data member
    public void setWidth(int width) {
        mWidth = width;
    }

    // Mutator method for the mHeight data member
    public void setHeight(int height) {
        mHeight = height;
    }
}
