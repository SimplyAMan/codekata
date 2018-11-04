/**
 * Java implementation different version of binary search
 *
 * (working with kata2 - http://codekata.com/kata/kata02-karate-chop/
 */
public class Kata2 {
    private boolean checkIfValueIsInArray(int value, int[] sortedArray) {
        return  !(sortedArray.length == 0
                || sortedArray[0] > value
                || sortedArray[sortedArray.length - 1] < value);
    }

    /**
     * Implementation iterative version of binary search
     * @param value element which is looked into array
     * @param sortedArray
     * @return location of element in array or -1 if array don't consists element
     */
    public int iterator_chop(int value, int[] sortedArray) {
        int result = -1;
        if (checkIfValueIsInArray(value, sortedArray)) {
            int minIndex = 0;
            int maxIndex = sortedArray.length;
            for (int i = 0; i < sortedArray.length/2 + 1; i++) {
                int index = minIndex + (maxIndex - minIndex) / 2;
                if (sortedArray[index] == value) {
                    result = index;
                } else if (value < sortedArray[index]) {
                    maxIndex = maxIndex != index ? index : index - 1;
                } else if (sortedArray[index] < value) {
                    minIndex = minIndex != index ? index : index + 1;
                }
            }
        }
        return result;
    }

    /**
     * Implementation of recursive version of binary search
     * @param value element which is looked into array
     * @param sortedArray
     * @return location of element in array or -a if array don't consists element
     */
    public int recursive_chop(int value, int[] sortedArray) {
        int result = -1;
        if(checkIfValueIsInArray(value, sortedArray)) {
            int middleIndex = sortedArray.length/2;
            if (value == sortedArray[middleIndex]) {
                result = middleIndex;
            } else if (sortedArray.length > 1 ) {
                if (value < sortedArray[middleIndex]) {
                    int[] newArray = new int[middleIndex];
                    System.arraycopy(sortedArray, 0, newArray, 0, middleIndex);
                    result = recursive_chop(value, newArray);
                } else if (value > sortedArray[middleIndex]) {
                    int length = sortedArray.length - middleIndex - 1;
                    int[] newArray = new int[length];
                    System.arraycopy(sortedArray, middleIndex + 1, newArray, 0, length);
                    int tempResult = recursive_chop(value, newArray);
                    result = tempResult == -1 ? -1 : middleIndex + tempResult + 1;
                }
            }
        }
        return result;
    }
}
