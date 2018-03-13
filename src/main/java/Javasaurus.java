public class Javasaurus extends Kaiju implements IMove {

    Tank tank;

    public Javasaurus(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
        this.tank = tank;
    }

    public String roar() {
        return "Meow";
    }

    public String move(String move) {
        return "Javasaurus " + move;
    }

//    public attack(int attackValue) {
//        tank.getHealthValue() - attackValue;
//    }
}

