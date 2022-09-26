package exercises;

public class ArrayPairCalculator {
    public String findAllPairsOfSum(int[] inArray, int sum) {
        String result = "";

        for (int k : inArray) {
            for (int i : inArray) {
                if (k + i == sum) {
                    result += "(" + k + "," + i + "),";
                }
            }
        }

        return result;
    }
}
