package Week2.inheritance;

public class Shape {
    int mX;
    int mY;

    /*
    * Shape default constructor. Initialize the mX and mY data members to 0 and 0.
    * */
    public Shape(){
        this(0, 0);
    }

    /**
     * Shape constructor. Initialize the mX and mY data members to pX and pY.
     * */
    public Shape(int pX, int pY) {
        setX(pX);
        setY(pY);
    }

    /**
     * Accessor method for the mX data member.
     * */
    public int getX() {
        return mX;
    }

    /**
     * Accessor method for the mY data member.
     * */
    public int getY() {
        return mY;
    }

    /**
     * Moves this Shape to a new location.
     * */
    public void move(int pNewX, int pNewY){
        setX(pNewX);
        setY(pNewY);
    }

    /**
     * Mutator method for the mY data member.
     * */
    private void setY(int pNewY) {
        mY = pNewY;
    }

    /**
     * Mutator method for the mX data member.
     * */
    private void setX(int pNewX) {
        mX = pNewX;
    }
}
