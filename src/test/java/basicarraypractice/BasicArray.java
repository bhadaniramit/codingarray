package basicarraypractice;

public class BasicArray {

    public static void main(String[] args) {
        BasicArray basicArray = new BasicArray();
//        System.out.println(basicArray.double23(new int[]{2}));
//        System.out.println(basicArray.fix23(new int[]{2, 3}));
//        System.out.println(basicArray.start1(new int[]{1, 2}, new int[]{1}));
//        System.out.println(Arrays.toString(basicArray.biggerTwo(new int[]{2, 3}, new int[]{1, 4})));
//        System.out.println(Arrays.toString(basicArray.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
//        System.out.println(Arrays.toString(basicArray.plusTwo(new int[]{2, 3}, new int[]{1, 4})));
//        System.out.println(Arrays.toString(basicArray.swapEnds(new int[]{1, 2, 3, 4})));
//        System.out.println(Arrays.toString(basicArray.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
//        System.out.println(basicArray.maxTriple(new int[]{5, 1, 3, 7, 1}));
//        System.out.println(Arrays.toString(basicArray.frontPiece(new int[]{5})));
//        System.out.println(basicArray.lastDigit(57,17));
//        System.out.println(basicArray.endUp("hi there"));
//        System.out.println(basicArray.everyNth("abcdefg", 3));
//        System.out.println(basicArray.countXX("Hexxo thxxe"));
//        System.out.println(basicArray.doubleX("xx"));
//        System.out.println(basicArray.arrayCount9(new int[]{}));
//        System.out.println(basicArray.arrayFront9(new int[]{9}));
//        System.out.println(basicArray.array123(new int[]{1, 2}));
//        basicArray.stringMatch("ramitbhadani", "ramitbhadaniiiii");
        System.out.println(basicArray.stringX("xraxmxixtxbhadanix"));

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

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int d = nums.length / 2;
        int[] a = new int[3];
        a[0] = nums[d - 1];
        a[1] = nums[d];
        a[2] = nums[d + 1];
        return a;
    }

    public int maxTriple(int[] nums) {
        int middle = nums.length / 2;
        if (nums[0] > nums[nums.length - 1] && nums[0] > nums[middle]) {
            return nums[0];
        } else if (nums[nums.length - 1] > nums[0] && nums[nums.length - 1] > nums[middle]) {
            return nums[nums.length - 1];
        } else {
            return nums[middle];
        }
    }

    public int[] frontPiece(int[] nums) {
        int[] newArray = new int[2];
        if (nums.length < 3) {
            return nums;
        } else {
            newArray[0] = nums[0];
            newArray[1] = nums[1];
        }
        return newArray;
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        } else {
            return false;
        }
    }

    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();

        }
    }

    public String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                return true;
            }
        }
        return false;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < 4 && nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            if (i == b.length() - 1) {
                break;
            }
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
          return   str.charAt(0) + str.replace('x', ' ') + str.charAt(str.length() - 1);
        }
        else{
            return str.replaceAll("x", "");
        }
    }

}

