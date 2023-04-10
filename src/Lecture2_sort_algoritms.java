public class Lecture2_sort_algoritms {


    public static void main(String[] args) {
        int[] array = new int[]{9,5,6,7,3,2,0,1,4,8};

        int [] array2 = new int[]{0,1,2,3,4,5,6,7,8,9};

//        System.out.println(find(array2, 5));  // поиск в отсортированном массиве
//        System.out.println(binarySearch(array2,98)); // Бинарный поиск
        sort(array);  // Быстрый поиск


//        bubbleSort(array);   //Сортировка пузырьком
//        directSort(array);   // Сортировка выбором
//        insertSort(array);    // Сортировка вставками
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(i + " ");
//        }

    }
    public static int binarySearch (int [] array, int value){
        return binarySearch(array, value, 0, 9);
    }

    public static void bubbleSort (int [] array){
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i + 1];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }

        }while (!finish);
    }

    public static void directSort (int [] array){  //Сортировка выбором
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[minPosition]){
                    minPosition = j;
                }
            }
            if (i != minPosition){
                int temp = array [i];
                array[i] = array [minPosition];
                array[minPosition] = temp;
            }
        }
    }

    public static void insertSort(int [] array){  // Сортировка вставками
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array [j];
                    array [j] = temp;
                }
            }
        }
    }

    public static int find (int [] array, int value){  // Поиск выбором
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    //Бинарный поиск
    public static int binarySearch (int [] array, int value, int min, int max){
        int midpoint;
        if (max < min)
            return -1;
        else midpoint = (max - min) / 2 + min;

        if (array[midpoint] < value ){
            return binarySearch(array, value, midpoint + 1, max );
        }else {
            if (array[midpoint] > value){
                return binarySearch(array, value, min, midpoint - 1);
            }else return  midpoint;
        }

    }

    // Быстрый поиск

    public static void sort (int [] array){
        sort(array,0, array.length -1);

    }

    public static void sort (int [] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition)/2];
        do {
            while (array[leftPosition] < pivot){
                leftPosition ++;

            }
            while (array[rightPosition] > pivot){
                rightPosition -- ;

            }
            if (leftPosition <= rightPosition){
                if (leftPosition < rightPosition){
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition ++;
                rightPosition -- ;
            }
        }while (leftPosition <= rightPosition);
        if (leftPosition <= endPosition){
            sort(array,leftPosition,endPosition);
        }
        if (startPosition < rightPosition){
            sort(array, startPosition, rightPosition);
        }

    }
}


