package detail;

public class ConvertibleRoof extends Detail {
    private boolean convertibleRoofStatus;

    public ConvertibleRoof() {
        this.convertibleRoofStatus = true;
    }
    public void changeRoofStatus(){
        convertibleRoofStatus = !convertibleRoofStatus;
        if(convertibleRoofStatus){
            System.out.println("Roof is closed");
        }else System.out.println("Roof  is opened");
    }
}
