class my_array {

    public static void main (String[]args) {

//        int [] my_array  = new int [7];
        int [] my_array  ={10,42,3,74,59,36,7};
        int sum = 0;

        for(int i=0; i<my_array.length; i++) {
            sum += my_array[i];
        }
        System.out.println("Sum of the array elements: " + sum);

    }
}
