/**
 * @author K00232267 - Caolan G, Neal B
 *
 * Anylitics
 */

public class Trap {
    int bottom;
    int top;

    //Parameterised Constructor
    public Trap(int bottom, int top) {
        this.bottom = bottom;
        this.top = top;
    }

    //Accessor Methods
    public int getBottom() {
        return bottom;
    }

    public int getTop() {
        return top;
    }

    //Mutator methods Methods
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    //toString
    @Override
    public String toString() {
        return "Trap{" +
                "bottom=" + bottom +
                ", top=" + top +
                '}';
    }
}
