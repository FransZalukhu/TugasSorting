package Sorting;

class ContohSortString {
    public static void main(String[] args) {

        String[] strings = {"banana", "apple", "orange", "grape", "kiwi"};

        sort(strings);

        for (String string : strings) {

            System.out.println(string);
            
        }
    }

    static void sort(String[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
