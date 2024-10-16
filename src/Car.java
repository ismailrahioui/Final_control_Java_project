public class Car extends Vehicle{
    private int SeatingCapacity;

    public Car(String Ownername, String Brand,String Model,int Year,int SeatingCapacity){
        super( null, null, null, SeatingCapacity);
        this.SeatingCapacity=SeatingCapacity;
                             
    }
    public void SeatingCapacity(int SeatingCapacity){
        this.SeatingCapacity=SeatingCapacity;
    }
    public int SeatingCapacity(){
        return SeatingCapacity;
    }
    @Override
    public void DisplayInfo() {
        
        System.out.println("Owner: "+GetOwnername());
        System.out.println("Car: "+GetBrand()+" Model: "+GetModel()+" Year: "+GetYear() );
        System.out.println("Seating Capacity: "+SeatingCapacity);
    }
    
}
