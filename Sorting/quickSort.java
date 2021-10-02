class QuickSort {
    //main method
    public static void main(String args[]) {
        int arr[] = { 101, 37, 68, 29, 11, 5 };
        System.out.println("before sorting array");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        int n = arr.length;
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("after sorting array");
        printArray(arr);
    }

    // Partition Method
    int partition(int arr[], int lowIndex, int highIndex) {
        int pivot = arr[highIndex];
        int i = (lowIndex - 1);
        for (int j = lowIndex; j < highIndex; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[highIndex];
        arr[highIndex] = temp;
        return i + 1;
    }
// method to sort array
    void sort(int arr[], int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pi = partition(arr, lowIndex, highIndex);
            sort(arr, lowIndex, pi - 1);
            sort(arr, pi + 1, highIndex);
        }
    }
// method to print array
    static void printArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
