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
        if (checkIfValueIsInArray(value, sortedArray)) {
            int first = 0;
            int last = sortedArray.length - 1;

            while (first <= last) {
                int index = (first + last) / 2;
                int checkedValue = sortedArray[index];
                if (value < checkedValue){
                    last = index - 1;
                } else if (value > checkedValue) {
                    first = index + 1;
                } else {
                    return index;
                }
            }
        }
        return -1;
    }

    /**
     * Implementation of recursive version of binary search
     * @param value element which is looked into array
     * @param sortedArray
     * @return location of element in array or -a if array don't consists element
     */
    public int recursive_chop(int value, int[] sortedArray) {
        if(checkIfValueIsInArray(value, sortedArray)) {
            int middleIndex = sortedArray.length/2;
            int first = 0;
            int last = sortedArray.length;

            int checkedValue = sortedArray[middleIndex];
            if (value != checkedValue) {
                int newArraySize;
                if (value < checkedValue) {
                    last = middleIndex - 1;
                    newArraySize = last - first + 1;
                } else {
                    first = middleIndex + 1;
                    newArraySize = last - first;
                }
                int[] newArray = new int[newArraySize];
                System.arraycopy(sortedArray,first,newArray,0,newArraySize);
                int tempIndex = recursive_chop(value, newArray);
                return tempIndex == -1 ? -1 : first + tempIndex;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
