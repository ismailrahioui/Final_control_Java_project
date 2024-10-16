public class Motosycle extends Vehicle {
    private int engineSize;

    public Motosycle(String Ownername, String Brand,String Model,int Year,int engineSize){
        super(Ownername, Brand, Model, Year);
        this.engineSize=engineSize;
    }
    public void setEngineSize(int engineSize){
        this.engineSize=engineSize;
    }
    public double getEngineSize(){
        return engineSize;
    }
    @Override
    public void DisplayInfo() {
      
        System.out.println("Owner: "+GetOwnername());
        System.out.println("Car: "+GetBrand()+" Model: "+GetModel()+" Year: "+GetYear() );
        System.out.println("Cargo Capacity: "+engineSize+ " CC");
    }
}
