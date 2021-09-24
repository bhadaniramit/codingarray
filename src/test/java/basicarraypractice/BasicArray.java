package basicarraypractice;

import java.util.Arrays;

public class BasicArray {

    public static void main(String[] args) {
        BasicArray basicArray = new BasicArray();
//        System.out.println(basicArray.double23(new int[]{2}));
//        System.out.println(basicArray.fix23(new int[]{2, 3}));
//        System.out.println(basicArray.start1(new int[]{1, 2}, new int[]{1}));
//        System.out.println(Arrays.toString(basicArray.biggerTwo(new int[]{2, 3}, new int[]{1, 4})));
//        System.out.println(Arrays.toString(basicArray.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(basicArray.plusTwo(new int[]{2, 3}, new int[]{1, 4})));
    }

    public boolean double23(int[] nums) {
        int countForTwo = 0;
        int countForThree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                countForTwo++;
            } else if (nums[i] == 3) {
                countForThree++;
            }
        }
        if (countForTwo == 2 || countForThree == 2) {
            return true;
        } else {
            return false;
        }
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                break;
            } else if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
                return nums;
            }
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int addA = 0;
        int addB = 0;
        for (int i = 0; i < a.length; i++) {
            addA += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            addB += b[i];
        }
        if (addA == addB) {
            return a;
        } else if (addA > addB) {
            return a;
        } else {
            return b;
        }
    }

    public int[] makeMiddle(int[] nums) {
        int d = nums.length / 2;
        int[] a = new int[2];
        a[0] = nums[d - 1];
        a[1] = nums[d];
        return a;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int sumOfArray = a.length + b.length;
        int[] s = new int[sumOfArray];
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            s[x] = a[i];
            x++;
        }
        for (int j = 0; j < b.length; j++) {
            s[x] = b[j];
            x++;
        }
        sortArray(s);
        return s;
    }

    public int[] sortArray(int[] ab) {
        int max = 0;
        for (int i = 0; i < ab.length; i++) {
            for (int j = i + 1; j < ab.length - 1; j++) {
                if (ab[i] > ab[j]) {
                    max = ab[j];
                    ab[j] = ab[i];
                    ab[i] = max;
                }
            }
        }
        return ab;
    }

}
