
//abstracte class Pokemons
public abstract class Pokemons {

    //variabelen
    private String name;
    private double level;
    private String food;
    private String sound;

    //constructors
    //lege constructor
    public Pokemons(){

    }

    //gevulde constructor
    public Pokemons(String name, double level, String food, String sound) {
        this.name = name;
        this.level = level;
        this.food = food;
        this.sound = sound;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    //abstracte methoden
    public abstract void eats();
    public abstract void speaks();

}
