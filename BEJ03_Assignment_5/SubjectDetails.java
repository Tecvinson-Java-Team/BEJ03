public class SubjectDetails {
    private double Mathematics;
    private double EnglishLanguage;
    private double BasicScience;
    private double Agriculture;
    private double SocialStudies;

    public SubjectDetails(double Mathematics, double EnglishLanguage, double BasicScience, double Agriculture, double SocialStudies){
        this.Mathematics =Mathematics;
        this.EnglishLanguage =EnglishLanguage;
        this.BasicScience = BasicScience;
        this.Agriculture = Agriculture;
        this.SocialStudies = SocialStudies;

    }


    public double getSocialStudies() {
        return SocialStudies;
    }

    public void setSocialStudies(double socialStudies) {
        SocialStudies = socialStudies;
    }

    public double getAgriculture() {
        return Agriculture;
    }

    public void setAgriculture(double agriculture) {
        Agriculture = agriculture;
    }

    public double getBasicScience() {
        return BasicScience;
    }

    public void setBasicScience(double basicScience) {
        BasicScience = basicScience;
    }

    public double getEnglishLanguage() {
        return EnglishLanguage;
    }

    public void setEnglishLanguage(double englishLanguage) {
        EnglishLanguage = englishLanguage;
    }

    public double getMathematics() {
        return Mathematics;
    }

    public void setMathematics(double mathematics) {
        Mathematics = mathematics;
    }
    public String ShowSubjectDetails(){
        System.out.println("Mathematics: " +getMathematics());
        System.out.println("English Language: " +getEnglishLanguage());
        System.out.println("Basic Science: " +getBasicScience());
        System.out.println("Agriculture: " +getAgriculture());
        System.out.println("Social Studies: " +getSocialStudies());
        return "";
    }









}
