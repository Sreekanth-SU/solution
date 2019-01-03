import java.util.Arrays;

public class Building {

    public int solution(int[] A) throws Exception {
        try {
            int maxheight = Arrays.stream(A).max().isPresent() ? Arrays.stream(A).max().getAsInt() : 0;
            int maxiterations = A.length;
            int totalNumberOfStrokes = 0;

            for (int i = 0; i < maxheight; i++) {
                for (int j = 0; j < maxiterations; j++) {
                    /*While considering First element we should not compare with prev as there isn't any*/
                    if (j == 0 && A[j] >= 1) {
                        totalNumberOfStrokes = totalNumberOfStrokes + 1;
                        /* Block will have a stroke and Before element does not have a stroke */
                    } else if (j >= 1 && A[j] >= 1 && A[j - 1] < 1) {
                        totalNumberOfStrokes = totalNumberOfStrokes + 1;
                    }
                }
                for (int k = 0; k < maxiterations; k++) {
                    A[k] = A[k] - 1;
                }
            }
            return (totalNumberOfStrokes > 1000000000) ? -1 : totalNumberOfStrokes;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
