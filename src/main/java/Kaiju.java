public abstract class Kaiju implements IDamage, IAttack {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName(){
        return name;
    }

    public int getHealthValue(){
        return healthValue;
    }

    public int getAttackValue(){
        return attackValue;
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
