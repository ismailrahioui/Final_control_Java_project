public abstract class Vehicle {
    private String Ownername;
    private String Brand;
    private String Model;
    private int Year;

    // Hada Kaytssama Constracture deyal lclass

    public Vehicle(String Ownername, String Brand,String Model,int Year){
        this.Ownername=Ownername;
        this.Model=Model;
        this.Brand=Brand;
        this.Year=Year;
    }



    public void SetOwnername(String Ownername){
        this.Ownername=Ownername;
    }

    public String GetOwnername(){
        return Ownername;
    }

    public void SetBrand(String Brand){
        this.Brand=Brand;
    }

    public String GetBrand(){
        return Brand;
    }

    public void SetModel(String Model){
        this.Model=Model;
    }

    public String GetModel(){
        return Model;
    }

    public void SetYear(int Year){
        this.Year=Year;
    }
    public int GetYear(){
        return Year;
    }

    public abstract void DisplayInfo();


}
