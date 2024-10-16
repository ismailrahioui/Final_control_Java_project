public class Car extends Vehicle{
    private int seatingCapacity;

    public Car(String Ownername, String Brand,String Model,int Year,int SeatingCapacity){
        super( null, null, null, SeatingCapacity);
        this.seatingCapacity=SeatingCapacity;
                             
    }
    public void SeatingCapacity(int SeatingCapacity){
        this.seatingCapacity=SeatingCapacity;
    }
    public int SeatingCapacity(){
        return seatingCapacity;
    }
    @Override
    public void DisplayInfo() {
        
        System.out.println("Owner: "+GetOwnername());
        System.out.println("Car: "+GetBrand()+" Model: "+GetModel()+" Year: "+GetYear() );
        System.out.println("Seating Capacity: "+seatingCapacity);
    }
    
}
