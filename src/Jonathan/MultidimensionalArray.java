package Jonathan;

public class MultidimensionalArray {

    public int[] extract(int[][] dataSet, int row, int startPosition, int endPosition) {
        int[] dataRow = dataSet[row-1];
        int [] extractedData = new int[(endPosition - startPosition) + 1];
        int count = 0;

        for (int i = startPosition-1; i < endPosition ; i++) {

                extractedData[count] = dataRow[i];
                count++;


        }
        return  extractedData;
    }

}


