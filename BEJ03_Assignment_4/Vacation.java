public class Vacation {

    // Declaring Attributes
    private int vacationDays;
    private int usedVacationDays;
    private int remainingVacationDays;

     // Constructor without parameter for vacation
    public Vacation(){
    }

    //Constructor with parameter for vacation
    public Vacation(int vacationDays, int usedVacationDays){
        this.vacationDays = vacationDays;
        this.usedVacationDays  = usedVacationDays;
    }

    // Declaring Setter and Getter
    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getUsedVacationDays() {
        return usedVacationDays;
    }

    public void setUsedVacationDays(int usedVacationDays) {
        this.usedVacationDays = usedVacationDays;
    }

    public int getRemainingVacationDays() {
        return vacationDays - usedVacationDays;
    }

    public void setRemainingVacationDays(int remainingVacationDays) {
        this.remainingVacationDays = remainingVacationDays;

    }

    // Display vacation details
    public void displayVacationDetails() {
        System.out.println("Vacation Days:            " + getVacationDays());
        System.out.println("Used Vacation Days:       " + getUsedVacationDays());
        System.out.println("Remaining Vacation Days:  " + getRemainingVacationDays());
    }

}
