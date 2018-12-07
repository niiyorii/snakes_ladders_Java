/**
 * @author K00232267 - Caolan G, Neal B
 *
 * Anylitics
 */

public class Dice {
    int faces;
    int numOfDie;

    //Default Constructor
    public Dice(){
        faces = 6;
        numOfDie = 1;
    }

    //Parameterised Constructor
    public Dice(int faces, int numOfSide){
        this.faces = faces;
        this.numOfDie = numOfSide;
    }

    //Accessor Methods
    public int getFaces(){
        return faces;
    }

    public int getNumOfDie(){
        return faces;
    }

    //Mutator Methods
    public void setFaces(int faces){
        this.faces = faces;
    }

    public void setNumOfDie(int faces){
        this.numOfDie = numOfDie;
    }

    public int rollDie() {
        return (int) (Math.random() * faces + numOfDie);
    }

    //toString
    @Override
    public String toString() {
        return "Dice{" +
                "faces=" + faces +
                ", numOfDie=" + numOfDie +
                '}';
    }
}
