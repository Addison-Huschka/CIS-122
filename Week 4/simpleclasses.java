class quiz{
    public static void reverseDoubleArray(double[] arr){
        int i = arr.length - 1;
        int j = 0;
        double[] new_array = new double[arr.length];
        while (i >= 0) {
            new_array[j] = arr[i];
            i--;
            j++;
        } 
    }
}

