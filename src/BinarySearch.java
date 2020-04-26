public class BinarySearch {
    private static boolean search(int[] list ,int start, int stop, int key){
        if(stop >= start){
            int mid = (start+ stop)/2;
            int token = (int) list[mid];
            if(key == list[mid]){
                System.out.println("True");
                return true;
            } else if(key < list[mid]){
                return search(list, start, mid-1, key);
            } else {
                return search(list, mid + 1, stop, key);
            }
        }
        System.out.println("false");
        return false;
    }

    public static boolean search(int[] myList, int number) {
        return search(myList, 0, myList.length-1, number);
    }
}
