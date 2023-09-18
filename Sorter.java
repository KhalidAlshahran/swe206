public class Sorter{
    public static void main(String[] args) {
        
    }

    private static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int k = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[k])
                    k = j;
            }
            if(k != i){
                int min = array[k];
                array[k] = array[i];
                array[i] = min;
            }
        }
    }
}