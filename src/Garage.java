public class Garage  {
    private Vehicle[] vehicles;
    private int count;


    public Garage(){
        this.vehicles = new Vehicle[100];
        this.count=0;
    }

    public void addVehicle(Vehicle vehicle){
        if(count < vehicles.length){
            vehicles[count]=vehicle;
            count++;
            System.out.println("Vehicle added to the garage");
        }
        else{
            System.out.println("Garage is full , can't add more vehicles");
        }
    }
    public void updateVehicle(String Ownername, String Brand,String Model,int Year,String newOwner,String currentOwner){
        boolean found = false;
        for(int i = 0 ; i< count;i++)
        {
            if(vehicles[i].GetOwnername().equalsIgnoreCase(currentOwner)){
                vehicles[i].SetBrand(Brand);
                vehicles[i].SetModel(Model);
                vehicles[i].SetYear(Year);
                vehicles[i].SetOwnername(newOwner);
                System.out.println("Vehicle Updated successfuly !");
                found=true;
                break;
            }

            if(!found){
                System.out.println("Vehicle with owner '"+currentOwner+"'not found . update failed'");
            }
        }
        
    }
    public void removeVehicle(String Ownername){
        boolean found = false;
        for(int i = 0 ; i< count;i++)
        {
            if(vehicles[i].GetOwnername().equalsIgnoreCase(Ownername)){
                vehicles[i]= vehicles[count -1];
                vehicles[count-1]=null;
                count--;
                System.out.println("Vehicle removed successfuly !");
                found=true;
                break;
            }

            if(!found){
                System.out.println("Vehicle with owner '"+Ownername+"'not found . removed failed'");
            }
        }
        
    }
    public void DisplayVehicles(){
        if(count==0){
            System.out.println("The garage is empty");
        }
        else{
            for(int i=0;i<count;i++){
                vehicles[i].DisplayInfo();
                System.out.println();
            }
        }
    }
    public void DisplayVehicleDetails (String Ownername){
        boolean found = false;
        for(int i = 0 ; i< count;i++)
        {
            if(vehicles[i].GetOwnername().equalsIgnoreCase(Ownername)){
                vehicles[i].DisplayInfo();
                found=true;
                break;
            }

            if(!found){
                System.out.println("Vehicle with owner '"+Ownername+"'not found . removed failed'");
            }
        }
    }

}
