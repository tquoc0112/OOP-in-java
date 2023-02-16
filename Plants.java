public class Plants{
    
    private String name;
    private int hp;
    private int x;
    private int y;
    public int gethp(){
        return hp;
    }
    public void sethp(int hp){
        this.name=hp;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    
    public void SayHello(){
       System.out.println("Hello");
    }
}