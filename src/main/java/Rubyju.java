public class Rubyju extends Kaiju {
    public Rubyju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }


    public String roar() {
        return "Screeeeeeech";
    }

    public String move(String move) {
        return "Rubyju " + move;
    }
}
