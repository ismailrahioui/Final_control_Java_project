import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        Garage garage = new Garage();
       Scanner scanner = new Scanner(System.in);

        int choice=0;

       do {
       
            System.out.println("Menu");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Update a vehicle");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Display vehicles");
            System.out.println("5. Display details of vehicle");
            System.out.println("0. Exit");
            
            
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
        
            switch (choice) {
                case 1:
                    System.out.println("Choose the vehicle type :");
                    System.out.println("1. Car");
                    System.out.println("2. Motocycle");
                    System.out.println("3. Truck");
                    
                    System.out.println("Enter the vehicle (1-3) : ");
                    int vehicletypechoice = scanner.nextInt();
                    switch (vehicletypechoice) {
                        case 1:
                            System.out.println("Enter owner name :");
                            String carOwner=scanner.nextLine();
                            System.out.println("Enter vehicle brand");
                            String carBrand=scanner.nextLine();
                            System.out.println("Enter vehicle model");
                            String carModel=scanner.nextLine();
                            System.out.println("Enter vehicle year");
                            int carYear=scanner.nextInt();
                            System.out.println("Enter seating capacity :");
                            int seatingCapacity=scanner.nextInt();
                            garage.addVehicle(new Car(carOwner, carBrand, carModel, carYear, seatingCapacity));
                            break;
                        case 2:
                            System.out.println("Enter owner name :");
                            String motocycleOwner=scanner.nextLine();
                            System.out.println("Enter vehicle brand");
                            String motocycleBrand=scanner.nextLine();
                            System.out.println("Enter vehicle model");
                            String motocycleModel=scanner.nextLine();
                            System.out.println("Enter vehicle year");
                            int motocycleYear=scanner.nextInt();
                            System.out.println("Enter engine size :");
                            int enginesize =scanner.nextInt();
                            garage.addVehicle(new Motosycle(motocycleOwner, motocycleBrand, motocycleModel, motocycleYear, enginesize));
                            break;
                        case 3:
                            System.out.println("Enter owner name :");
                            String TruckOwner=scanner.nextLine();
                            System.out.println("Enter vehicle brand");
                            String TruckBrand=scanner.nextLine();
                            System.out.println("Enter vehicle model");
                            String TruckModel=scanner.nextLine();
                            System.out.println("Enter vehicle year");
                            int TruckYear=scanner.nextInt();
                            System.out.println("Enter cargo capacity (Kilograms) :");
                            int engineSize =scanner.nextInt();
                            garage.addVehicle(new Truck(TruckOwner, TruckBrand, TruckModel, TruckYear, engineSize));
                            break;
                        default:
                        System.out.println("Invalid vehicle type choice.");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("");
                    String UpdateOwner=scanner.nextLine();

                    System.out.println("Enter new vehicle owner name");
                    String owner=scanner.nextLine();

                    System.out.println("Enter new vehicle brand");
                    String brand =scanner.nextLine();

                    System.out.println("Enter new vehicle model");
                    String model=scanner.nextLine();

                    System.out.println("Enter new vehicle year");
                    int year=scanner.nextInt();
                    garage.updateVehicle(owner, brand, model, year, UpdateOwner, owner);
                break;
                case 3 :
                System.out.println("Enter name of the vehicle to remove: ");
                String removeOwner=scanner.nextLine();
                garage.removeVehicle(removeOwner);
                break;
                case 4 :
                garage.DisplayVehicles();
                break;
                case 5:
                System.out.println("Enter owner name of the vehicle to display details: ");
                String displayOwner=scanner.nextLine();
                garage.DisplayVehicleDetails(displayOwner);
                break;
                case 0:
                System.out.println("Exiting the program , Goodbye !");
                break;



                
                default:
                    break;
            }
        
       } 
       while(choice != 0);
      
    }
}
