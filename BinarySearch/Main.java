class Main {
    public static void main (String [] args){
        int array [] = new int [5];
        for (int i = 0; i<array.length; i++){
            array[i] = i;
        }

        int indexOfElem = binarySearch(array, 4);
        System.out.println(array[indexOfElem]);

    }

static int binarySearch (int [] array, int target){
    int low = 0;
    int high = array.length-1;
    while (low<= high){
        int mid = (int) (low + (high - low)/2);
    if (array[mid] == target){
        return mid;
    } else if (target > array[mid]){
        low = mid +1;
        } else {
            high = mid - 1;
            
        }

    }
    return -1;
}

}