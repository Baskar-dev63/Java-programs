public class 3DArray {
    public static void main(String[] args) {

        int arr[][][] = {
                {
                        {6, 5, 3, 5},
                        {4, 5, 3, 5, 63, 6}
                },
                {
                        {1, 2, 3, 4, 5},
                        {5, 4, 3, 2, 1}
                }
        };

        //3D  Dimensional Array 
        //                      start  [    [ [] , [] ],
        //                                [ [] , [] ]   ];  End.

        System.out.println("Layers Length: " + arr.length);
        System.out.println("First Array's length: " + arr[0].length);
        System.out.println("Second Array's length: "+arr[1].length);
        System.out.println("First Array of first array length: " + arr[0][0].length);
        System.out.println("First Array of second array length: " + arr[0][1].length);
        System.out.println("Second Array of first array length: " + arr[1][0].length);
        System.out.println("Second Array of second array length: " + arr[1][1].length);

        System.out.println();
        System.out.println("Printing the values of the 3D Array:");//3D Dimensional..

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Layer: "+i);
            for (int j = 0; j < arr[i].length; j++) {
               for(int k=0;k<arr[i][j].length;k++){
                   System.out.print(arr[i][j][k]);
               }
                System.out.println();
            }
            System.out.println();
        }

    }

}
