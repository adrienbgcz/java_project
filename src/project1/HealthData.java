package project1;


public class HealthData {
    private String firstName;
    private String lastName;
    private Double height;
    private double weight;
    private int age;
    private double imc;
    private int metabolism;
    private String gender;
    private int waist;
    private int hips;
    private double waistHipsRatio;


    //SET
    public void setFirstName(String clientFirstName){
        this.firstName = clientFirstName;
    }

    public void setLastName(String clientLastName){
        this.lastName = clientLastName;
    }

    public void setHeight(Double clientHeight){
        this.height = clientHeight;
    }

    public void setWeight(double clientWeight){
        this.weight = clientWeight;
    }

    public void setAge(int clientAge){
        this.age = clientAge;
    }

    public void setImc(double clientImc){
        this.imc = clientImc;
    }

    public void setMetabolism(int clientMetabolism) {
        this.metabolism = clientMetabolism;
    }

    public void setGender(String clientGender) {
        this.gender = clientGender;
    }

    public void setWaist (int clientWaist) {
        this.waist = clientWaist;
    }

    public void setHips (int clientHips) {
        this.hips = clientHips;
    }

    public void setWaistHipsRatio(double clientWaistHipsRatio){
        this.waistHipsRatio = clientWaistHipsRatio;
    }

    // GET
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    public double getImc() {
        return this.imc;
    }

    public int getMetabolism() {
        return this.metabolism;
    }

    public String getGender() {
        return this.gender;
    }

    public int getWaist() {
        return this.waist;
    }

    public int getHips() {
        return this.hips;
    }

    public double getWaistHipsRatio() {
        return this.waistHipsRatio;
    }
}
