package project1;

public class PhysicalActivity {
    private double activityLevel1;
    private double activityLevel2;
    private double activityLevel3;
    private double activityLevel4;
    private double activityLevel5;
    private double activityLevel6;
    private double totalActivityLevel;
    private int totalEnergyExpenditure;

    //SET
    public void setLevel1(double clientActivityLevel1){
        this.activityLevel1 = clientActivityLevel1;
    }

    public void setLevel2(double clientActivityLevel2){
        this.activityLevel2 = clientActivityLevel2;
    }

    public void setLevel3(double clientActivityLevel3){
        this.activityLevel3 = clientActivityLevel3;
    }

    public void setLevel4(double clientActivityLevel4){
        this.activityLevel4 = clientActivityLevel4;
    }

    public void setLevel5(double clientActivityLevel5){
        this.activityLevel5 = clientActivityLevel5;
    }

    public void setLevel6(double clientActivityLevel6){
        this.activityLevel6 = clientActivityLevel6;
    }

    public void setTotalActivityLevel(double clientTotalActivityLevel){
        this.totalActivityLevel = clientTotalActivityLevel;
    }

    public void setTotalEnergyExpenditure(int clientTotalEnergyExpenditure){
        this.totalEnergyExpenditure = clientTotalEnergyExpenditure;
    }

    //GET

    public double getLevel1() {
        return this.activityLevel1;
    }

    public double getLevel2() {
        return this.activityLevel2;
    }

    public double getLevel3() {
        return this.activityLevel3;
    }

    public double getLevel4() {
        return this.activityLevel4;
    }

    public double getLevel5() {
        return this.activityLevel5;
    }

    public double getLevel6() {
        return this.activityLevel6;
    }

    public double getTotalActivityLevel() {
        return this.totalActivityLevel;
    }

    public int getTotalEnergyExpenditure() {
        return this.totalEnergyExpenditure;
    }
}
