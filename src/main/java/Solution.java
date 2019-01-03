
public class Solution {

    public static void main(String args[]) {

        int[] inputArray = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
        int totalNumberOfStrokes = 0;
        try {
            totalNumberOfStrokes = new Building().solution(inputArray);
            System.out.println(totalNumberOfStrokes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}