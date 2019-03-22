package Week2.inheritance;

/*
* Now suppose we want to create a Square class to represent squares. A square
* will have three attributes specifying the (x, y) coordinates of the upper
* left corner of the Square on the window and the length of each side.
* */

/**
 * Represents a Square that can be drawn on a graphical window. Square is a
 * subclass of Rectangle and inherits all of the instance variables of
 * Rectangle: mX, mY, mWidth, and mHeight. Square may also call any public
 * or protected method in Rectangle.
 * */
public class Square extends Rectangle{
    private int mSideLen;     
    private int mX;     
    private int mY;
    
    /*
    * Default constructor
    * Initializes all instances variables to 0 by calling the second 
    * constructor
    * */
    public Square(){
        this(0, 0, 0);
    }

    /**
     * Second constructor
     * */
    public Square(int pX, int pY, int pSideLen) {
        super(pX, pY); // call Rectangle(int, int)
        setSideLen(pSideLen);
    }

    // Accessor method for the mSideLen data member.
    public int getSideLen() {
        return getWidth();
    }

    // Accessor method for the mX data member
    public int getX() {
        return mX;
    }

    // Accessor method for the mY data member.
    public int getY() {
        return mY;
    }

    // Moves this Square to a new location.
    public void move(int pNewX, int pNewY){
        setX(pNewX);
        setY(pNewY);
    }

    // Change the size of this Square.
    public void resize(int pNewSideLen){
        super.resize(pNewSideLen, pNewSideLen);
    }

    // Mutator method for the mX data member.
    public void setX(int x) {
        mX = x;
    }

    // Mutator method for the mY data member.
    public void setY(int y) {
        mY = y;
    }

    // Mutator method for the mSideLen data member.
    public void setSideLen(int pNewSideLen) {
        setWidth(pNewSideLen);
        setHeight(pNewSideLen);
    }
}
