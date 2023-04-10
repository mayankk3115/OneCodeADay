public class bestSeat {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,0,1,0,0,0,1};
        int result = findBestSeat(arr);
        System.out.println("The best seat is:" + result);
    }

    private static int findBestSeat(int[] arr) {
        int bestSeatSize = 0;
        int seat =  -1;
        int left = 0;
        int right =1;

        while(left < arr.length-1 && right < arr.length-1) {

                while(arr[right] == 0) {
                    right++;
                }
                bestSeatSize = right-left-1;
                seat = (left+right)/2;
                left=right;
                right++;
        }
        return seat;
    }
}
