public class Truck extends Vehicle {
    private double cargoCapacity;
    
    public Truck(String Ownername, String Brand,String Model,int Year,double cargoCapacity){
        super(Ownername, Brand, Model, Year);
        this.cargoCapacity=cargoCapacity;
    }
    public void setCargoCapacity(double cargoCapacity){
        this.cargoCapacity=cargoCapacity;
    }
    public double getCargoCapacity(){
        return cargoCapacity;
    }
    @Override
    public void DisplayInfo() {
      
        System.out.println("Owner: "+GetOwnername());
        System.out.println("Car: "+GetBrand()+" Model: "+GetModel()+" Year: "+GetYear() );
        System.out.println("Cargo Capacity: "+cargoCapacity+ " KG");
    }
    
}
