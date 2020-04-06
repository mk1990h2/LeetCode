package medium;

public class CountingBits {
    public int[] countBits(int num) {
        if (num == 0) return new int[]{0};

        int[] arr = new int[num + 1];
        arr[0] = 0;
        int index = 0;
        int partition = 1;
        for (int i = 1; i <= num; i++) {
            if (i == partition) {
                arr[i] = 1;
                partition *= 2;
                index = 1;
            } else {
                arr[i] = arr[index] + 1;
                index++;
            }
        }

        return arr;
    }
}
