public class Java_Ch5_1_참조타입{
    public static void main(String[] args){
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1,2,3};
        arr2 = new int[]{1,2,3};
        arr3 = arr2;

        System.out.println(arr1 == arr2); //false -> 서로 다른 객체를 참조하고 있음.
        System.out.println(arr2 == arr3); //true  -> Line9를 통해 같은 번지에 대입되었음
    }
}