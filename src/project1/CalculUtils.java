package project1;

public class CalculUtils {

    public static double calculImc(double clientWeight, Double clientHeight) {
        return clientWeight/(clientHeight*clientHeight);
    }

    public static int calculMaleMetabolism (double clientWeight, Double clientHeight, int clientAge) {
        return (int)(13.707*clientWeight + 492.3*clientHeight - 6.673*clientAge + 77.607);
    }

    public static int calculFemaleMetabolism (double clientWeight, Double clientHeight, int clientAge) {
        return (int) (9.740*clientWeight + 172.9*clientHeight - 4.737*clientAge + 667.051);
    }

    public static double calculWaistHipsRatio (int clientWaist, int clientHips) {
        return (double)clientWaist/(double)clientHips;
    }

    public static double calculTotalActivityLevel (double clientActivityLevel1, double clientActivityLevel2, double clientActivityLevel3, double clientActivityLevel4, double clientActivityLevel5, double clientActivityLevel6) {
        return (clientActivityLevel1 + clientActivityLevel2 + clientActivityLevel3 + clientActivityLevel4 + clientActivityLevel5 + clientActivityLevel6)/24;
    }

    public static int calculTotalEnergyExpenditure (int clientMetabolism, double clientTotalActivityLevel) {
        return (int) (clientMetabolism * clientTotalActivityLevel);
    }
}
