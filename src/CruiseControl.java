public class CruiseControl extends Detail{
    private boolean cruiseControlStatus;

    public CruiseControl() {
        this.cruiseControlStatus = false;
    }
    public void changeStatus(){
        cruiseControlStatus = !cruiseControlStatus;
        if(cruiseControlStatus) {
            System.out.println("Cruise control enabled");
        }else System.out.println("Cruise control disabled");
    }
}
