public class Player {
    private int id;
    private int position;
    private String name;

    //Default Constructor
    public Player() {
        id = 1;
        name = "AI Player";
    }

    //Parameterised Constructor
    public Player(int id, int position) {
        this.id = id;
        this.position = position;
    }

    //Accessor Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    //Mutator Methods
    public void setId(int aId) {
        id = aId;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    //toString
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", position=" + position +
                ", name='" + name + '\'' +
                '}';
    }


}
