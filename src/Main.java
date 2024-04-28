public class Main {
    public static void main(String[] args) {

        int[] test = {1,9,3,4,5,6};
        int diff =  calculateDifference(test);
        System.out.println("The difference between the largest and smallest values in the array is: "+ diff);

        findSmallestAndSecondSmallest(test);

        int x = 4;
        double y = 5.2;
        double result = calculateMathExpression(x, y);
        System.out.println("The math expression result is : " + result);
    }

    //first exercise
    public static int calculateDifference(int[] diffArr) {
        if (diffArr.length < 1) {
            System.out.println("Array must have at least 1 element.");
            return 0;
        }
        int min = diffArr[0];
        int max = diffArr[0];
        for (int i = 1; i < diffArr.length; i++) {
            if (diffArr[i] < min) {
                min = diffArr[i];
            }
            if (diffArr[i] > max) {
                max = diffArr[i];
            }
        }
        return max - min;
    }
//second exercise
    public static void findSmallestAndSecondSmallest(int[] diffArr) {
        if (diffArr.length < 2) {
            System.out.println("Array must have at least 2 elements to find two smallest.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < diffArr.length; i++) {
            if (diffArr[i] < min) {
                min = diffArr[i];
            } else if (diffArr[i] < min2 && diffArr[i] > min) {
                min2 = diffArr[i];
            }
        }

        System.out.println("The smallest value is: " + min);
        System.out.println("The second smallest value is: " + min2);
    }

//third exercise
    public static double calculateMathExpression(int x, double y) {
        return (Math.pow(x , 2)+Math.pow((((4 * y)/5 )-x),2));
    }
}