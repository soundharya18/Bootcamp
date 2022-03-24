public class Vehicle{
    String name;
    int mass;
    int speed;
    public Vehicle(){
    this.name="Vehicle";
    }



public Vehicle(String name,int mass, int speed ){
    this.name=name;
    this.mass=mass;
    this.speed=speed;
        }
public void drive(int speed){
this.speed=speed;
}

}
