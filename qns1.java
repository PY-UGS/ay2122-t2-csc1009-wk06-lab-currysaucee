// import java.util.*;

// public class qns1 {
    
//     public static void addAndSort(LinkedList<Integer>list, int value){
//         Integer[] intArray = list.toArray(new Integer[0]);
//         Integer counter = 0;
//         for(int index=0; index<intArray.length; index++, counter++){
//             if (intArray[index] > value){
//                 System.out.println("Found it!");
//                 break;
//             }
//         }
//         list.add(counter, value);
//     }

//     public static void swap(LinkedList<Integer>list, int index1, int index2){
//         int temp1 = list.get(index1);
//         int temp2 = list.get(index2);
//         list.remove(index1);
//         list.remove(index2-1);
//         list.add(index1, temp2);
//         list.add(index2, temp1);
//     }

//     public static void finder(){
//         LinkedList<Integer>list = new LinkedList<Integer>();
//         Random random = new Random();
//         for(int index=0; index<500; index++){
//             int randomNum = random.nextInt(1000, 9999);
//             list.add(randomNum);
//         }
//         int find_this = random.nextInt(1000,9999);
//         System.out.println(list.contains(find_this));
//         if(list.contains(find_this)){
//             System.out.println("It is in position:" + list.indexOf(find_this));
//         }
//     }
//     public static void main(String[] args) {
//         LinkedList<Integer>list = new LinkedList<Integer>();
//         list.add(1);
//         list.add(3);
//         list.add(5);
//         list.add(7);
//         list.add(9);
//         list.add(11);

//         addAndSort(list, 6);
//         addAndSort(list, 19);
//         System.out.println(list);
//         swap(list, 3,5);
//         System.out.println(list);
//         finder();
//     }
// }















import java.util.*;

public class qns1{
    public static void addAndSort(LinkedList<Integer> temp, int value){
        System.out.println("Adding item:" + value);
        System.out.println(temp);
        int size = temp.size();
        for(int index=0; index<size; index++){
            if(temp.get(index) > value){
                temp.add(index, value);
                break;
            }
            if(temp.get(index) == value){
                temp.add(index,value);
                break;
            }
            // the value to insert is larger than everything else
            if (index==temp.size()-1){
                temp.add(value);
            }
        }
        System.out.println(temp);
    }

    public static void swap(LinkedList<Integer> temp, int index1, int index2){
        if(index1>index2){
            int tempIndex = index2;
            index2 = index1;
            index1 = tempIndex;
        }
        System.out.println("Swapping indexes");
        System.out.println(temp);
        temp.add(index1, temp.get(index2));
        temp.add(index2+1, temp.get(index1+1));
        temp.remove(index2+2);
        temp.remove(index1+1);
        System.out.println(temp);
    }

    public static void finder(){
        System.out.println("Generating random list now...");
        LinkedList<Integer> randoms = new LinkedList<Integer>();
        Random random = new Random();
        int find_this = random.nextInt(1000,9999);
        for (int index=0; index<500; index++){
            randoms.add(random.nextInt(1000,9999));
        }
        if (randoms.contains(find_this)){
            System.out.println("It is in list and is of position:" + randoms.indexOf(find_this));
        }
        else{
            System.out.println("Not in list");
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> temp = new LinkedList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers do you want:");
        int userSize = scan.nextInt();
        int userValue;
        for(int index=0; index<userSize; index++){
            System.out.println("What integer do you want to add in:");
            userValue = scan.nextInt();
            temp.add(userValue);
        }

        System.out.println("Doing operations now");
        System.out.println("What do you want to add and sort:");
        userValue = scan.nextInt();
        addAndSort(temp, userValue);
        System.out.println();
        System.out.println("What do you want to add and sort:");
        userValue = scan.nextInt();
        addAndSort(temp, userValue);
        System.out.println();
        System.out.println("What indexes do you want to swap: max size is " + (temp.size()-1));
        int index1 = scan.nextInt();
        int index2 = scan.nextInt();
        swap(temp,index1,index2);
        System.out.println();
        finder();
    }
}