public class Main {
    public static void main(String[] args) {
        int[] arr = {-8,-3,1,2,4,7};

            int start = 0;
            int end = arr.length - 1;

            int bestSum = Integer.MAX_VALUE;
            int sumL = 0; int sumR = 0;

            while (start < end) {
                int sum = arr[start] + arr[end];

                if(Math.abs(sum) < Math.abs(bestSum)){
                    bestSum = sum;
                    sumL = arr[start];
                    sumR = arr[end];
                }

                if (sum < 0) {
                    start++;
                } else if (sum > 0) {
                    end--;
                } else {
                    break;
                }

            }
        System.out.print("[" +sumL + " " + sumR+ "]");
        }
    }
