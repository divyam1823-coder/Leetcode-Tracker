// Last updated: 7/9/2026, 3:15:29 PM
class Solution {
    public double[] convertTemperature(double cel) {
        double kel=cel + 273.15;
        double fa=cel*1.80 + 32.00;
        return new double[] {kel,fa};
    }
}