public class Main {
    public static void main(String[] args) {

        int[] a ={ 3,5,9,2,7};
        int[] b ={ 1,2,4,1,12};

        int[] array3 = addArrays(a,b);

        for( int value : array3){
            System.out.println(value);
        }
    }

    public static int[] addArrays(  int[] array1, int[] array2){

        //größe des neuen Arrays?
        //wie Werte der beiden Arrays in das neue längere Array übertragen?

        int[] newArray = new int[array1.length + array2.length];

        int i;

        for ( i= 0; i < array1.length; i++ ){
            newArray[i] = array1[i];
        }

        for ( int j= 0; j < array2.length; j++ ){
               newArray[i] = array2[j];
               i++;
        }

        return newArray;
    }
}