public class Exercise3 {
    public static void main(String args[]){
        int[] arr = new int[]{1,3,5,7};
        int[] arr2 = new int[]{2,4,8,16,32,64};
        int[] arr3 = new int[]{0,1,4,9,16,25,36};
        int[] arr4 = new int[]{4,16,36,64};
        int[] arr5 = new int[]{1,1,2,3,5,8};
        int[] arr6 = new int[]{2,10,12,16,17,18,19};

        arr =  Exercise3.push(arr,9);
        arr2 = Exercise3.push(arr2, 128);
        arr3 = Exercise3.push(arr3, 49);
        arr4 = Exercise3.push(arr4, 81);
        arr5 = Exercise3.push(arr5, 13);
        arr6 = Exercise3.push(arr6, 3);

        System.out.println("Exercise A");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        
        System.out.println("Exercise B");
        for(int i =0;i< arr2.length; i++){
            System.out.println(arr2[i]);
        }

        System.out.println("Exercise C");
        for(int i =0;i< arr3.length; i++){
            System.out.println(arr3[i]);
        }

        System.out.println("Exercise D");
        for(int i =0;i< arr4.length; i++){
            System.out.println(arr4[i]);
        }

        System.out.println("Exercise E");
        for(int i =0;i< arr5.length; i++){
            System.out.println(arr5[i]);
        }
        
        System.out.println("Exercise F");
        for(int i =0;i< arr5.length; i++){
            System.out.println(arr5[i]);
        }
    }
    private static int[] push(int[] arr, int j) {
        int[] longer = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
            longer[i] = arr[i];
        longer[arr.length] = j;
        return longer;
        }
}
