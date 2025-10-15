class ArrayofArrays {
    public static void main(String[] args) {
        int arr[][] = {
                {6, 5, 3, 5},
                {4, 5, 3, 5, 63, 6}
        };

// 2D Dimensional Array [
//                         [],[]   ];   Array of arrays is 2Dimensional..

        System.out.println("2D Dimensional Array's length: "+arr.length);
        System.out.println("Array's of first array length: "+arr[0].length);
        System.out.println("Array's of second array length: "+arr[1].length);

        System.out.println();
        System.out.println("Printing the value of the 2D Array: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
