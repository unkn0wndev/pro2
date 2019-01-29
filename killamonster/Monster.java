public class Monster {
    private String name;
    private int health;

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public boolean Hit() {
        if(health>1){
            health--;
            return true;
        }
        else {
            return false;
        }
    }
}
