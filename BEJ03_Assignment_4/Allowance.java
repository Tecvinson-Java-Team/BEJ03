public class Allowance {

    // Declaring Attributes
    private  double basic;
    private double transportation;
    private double wardrobe;
    private double education;
    private double feeding;

    // Constructor without parameter for allowance
    public Allowance() {
    }

    // Constructor with parameter for allowance
    public Allowance(double basic, double transportation, double wardrobe, double education, double feeding){
        this.basic = basic;
        this.transportation = transportation;
        this.wardrobe = wardrobe;
        this.education = education;
        this.feeding = feeding;
    }

    //Declaring Setter and Getter
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getTransportation() {
        return transportation;
    }

    public void setTransportation(double transportation) {
        this.transportation = transportation;
    }

    public double getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(double wardrobe) {
        this.wardrobe = wardrobe;
    }

    public double getEducation() {
        return education;
    }

    public void setEducation(double education) {
        this.education = education;
    }

    public double getFeeding() {
        return feeding;
    }

    public void setFeeding(double feeding) {
        this.feeding = feeding;
    }

    // Display allowance details
    public void displayAllowanceDetails(){
        System.out.println("Basic Allowance:          " + getBasic());
        System.out.println("Transportation Allowance: " + getTransportation());
        System.out.println("Wardrobe Allowance:       " + getWardrobe());
        System.out.println("Education Allowance:      " + getEducation());
        System.out.println("Feeding Allowance:        " + getFeeding());
    }
}
