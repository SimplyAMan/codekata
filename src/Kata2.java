public class Kata2 {
    private boolean primaryCheck(int value, int[] sortedArray) {
        if (sortedArray.length == 0
                || sortedArray[0] > value
                || sortedArray[sortedArray.length - 1] < value) {
            return true;
        }
        return false;
    }

    public int iterator_chop(int value, int[] sortedArray) {
        int result = -1;
        if (!primaryCheck(value, sortedArray)) {
            int minIndex = 0;
            int maxIndex = sortedArray.length;
            for (int i = 0; i < sortedArray.length; i++) {
                int index = minIndex + (maxIndex - minIndex) / 2;
                if (sortedArray[index] == value) {
                    result = index;
                } else if (value < sortedArray[index]) {
                    if (maxIndex != index) {
                        maxIndex = index;
                    } else {
                        maxIndex = index - 1;
                    }
                } else if (sortedArray[index] < value) {
                    if (minIndex != index) {
                        minIndex = index;
                    } else {
                        minIndex = index + 1;
                    }

                } else {
                    result = -1;
                }
            }
        }
        return result;
    }
}
