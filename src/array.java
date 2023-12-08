import java.sql.SQLOutput;

class array {
    public static void main(String[]args) {

        int [] arr = new int[6];

//        System.out.println(arr.length);

        arr[2] = 4;
        arr[3] = 6;

        int [] brr = arr.clone();

        for(int i=0; i<brr.length; i++) {
            System.out.println(brr[i]);

        }


    }
}
