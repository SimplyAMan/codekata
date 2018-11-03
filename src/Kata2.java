public class Kata2 {
    private boolean primaryCheck(int value, int[] sortedArray) {
        return  (sortedArray.length == 0
                || sortedArray[0] > value
                || sortedArray[sortedArray.length - 1] < value);
    }

    public int iterator_chop(int value, int[] sortedArray) {
        int result = -1;
        if (!primaryCheck(value, sortedArray)) {
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
}
