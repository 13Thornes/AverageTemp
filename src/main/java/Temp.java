public class Temp {
    double[] temps = new double[5];
    double averageTemp = 0;
    int daysAboveAverage = 0;

    public Temp(double temp1, double temp2, double temp3, double temp4, double temp5) {
        temps[0] = temp1;
        temps[1] = temp2;
        temps[2] = temp3;
        temps[3] = temp4;
        temps[4] = temp5;
    }

    public void AverageTemp() {
        for(double temp : temps) {
            averageTemp += temp;
        }

        averageTemp = averageTemp / 5;

        System.out.println("Average Temperature: " + averageTemp);

        for(double temp : temps) {
            if(temp > averageTemp) {
                daysAboveAverage += 1;
            }
        }
        System.out.println("Days above average: " + daysAboveAverage);
    }

    public static void main(String[] args) {
        Temp temps = new Temp(1, 17, 23, 14, 7);
        temps.AverageTemp();
    }
}
