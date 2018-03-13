public abstract class Vehicle implements IAttack, IDamage{

    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType(){
        return type;
    }

    public int getHealthValue(){
        return healthValue;
    }

    @Override
    public void damage(int damage){
        healthValue -= damage;
    }

    @Override
    public void attack(IDamage object){
        object.damage(attackValue);
    }
}
