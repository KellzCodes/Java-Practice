public class SierpinskiTriangle {
    /**
     * Around 1916 a Polish mathematician Waclaw Sierpinski
     * described a recursive mathematical structure (a fractal)
     * which is now called Sierpinski's Triangle.
     *
     * It is pretty easy to draw one of these:
     * 1. Draw an equilateral triangle
     * 2. Within the equilateral triangle, draw three smaller equilateral triangles.
     * 3. For each of the three smaller equilateral triangles: goto Step 2.
     *
     * Of course, recursion cannot occur indefinitely, i.e., there must be a base case.
     * We can define the base case for the Sierpinski Triangle by specifying the size
     * of the smallest equilateral triangle we wish to draw.
     */

    /*
    * Here is pseudocode for a recursive method that draws the Sierpinski Triangle:
    *
    * NOTE: this will not compile.
     */
// TODO make this into a full program

    public void drawSierpinskiTriangle(SierpinskiTriangle pTriangle, int pHeight) {
        // The base case is when the height of the triangle we are asked to draw is less than
        // 5 pixels. In this problem, we are simply drawing triangles, so there is no "solution"
        // to be determined and returned.
        if (pHeight <= 5) { return; }

        // Draw the larger triangle.
        myFrame.draw(pTriangle);

        // Reduce the size of the problem to three smaller equilateral triangles.
        int newHeight = some-new-height-which-is-less-than-pHeight;
        SierpinskiTriangle a = new SierpinksiTriangle(determine-location-of-a);
        SierpinskiTriangle b = new SierpinksiTriangle(determine-location-of-b);
        SierpinskiTriangle c = new SierpinksiTriangle(determine-location-of-c);

        // Recursively draw each of the three smaller equilateral triangles.
        drawSierpinskiTriangle(a, newHeight);
        drawSierpinskiTriangle(b, newHeight);
        drawSierpinskiTriangle(c, newHeight);
    }
}
