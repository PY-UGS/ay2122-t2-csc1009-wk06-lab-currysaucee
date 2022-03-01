import java.util.*;

public class qns1_hashmap {

    public static void insert(HashMap<Integer,Integer>map, int value){;
        System.out.println("Inserting value...");
        List<Integer> newList = new ArrayList<Integer>(map.values());
        System.out.println(newList);
        for (int index=0; index<5; index++){
            int temp = newList.get(index);
            if (temp>value){
                newList.add(index, value);
                break;
            }
            if (value>temp && index==4){
                newList.add(index+1,value);
            }
        }
        System.out.println(newList);
        map.clear();
        for (int index=0; index<newList.size(); index++){
            map.put(index,newList.get(index));
        }
    }

    public static void swap(HashMap<Integer,Integer>map, int index1, int index2){
        System.out.println("Swapping values around....");
        List<Integer> newList = new ArrayList<Integer>(map.values());
        System.out.println(newList);
        newList.add(index2,newList.get(index1));
        newList.add(index1,newList.get(index2+1));
        newList.remove(index2+2);
        newList.remove(index1+1);
        System.out.println(newList);
        map.clear();
        for (int index=0; index<newList.size(); index++){
            map.put(index,newList.get(index));
        }
    }

    public static void finder(){
        System.out.println("Generating a HashMap of random values now...");
        Random random = new Random();
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int index=0; index<500; index++){
            int randomNum = random.nextInt(1000, 9999);
            map.put(index, randomNum);
        }
        int find_this = random.nextInt(1000,9999);
        List<Integer> newList = new ArrayList<Integer>(map.values());
        System.out.println("Searching HashMap for a randomly generated value...");
        if (newList.contains(find_this)){
            System.out.println("Found it! It is in position:");
            System.out.println(newList.indexOf(find_this));
        }
        else{
            System.out.println("Item not found...");
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,3);
        map.put(3,5);
        map.put(4,7);
        map.put(5,9);
        map.put(5,11);

        insert(map,19);
        insert(map,6);
        swap(map,3,5);
        finder();
    }    
}


// import java.util.*;

// public class qns1_hashmap{

//     public static void addAndSort(HashMap<Integer, Integer> temp, int value){
//         ArrayList<Integer> newList = new ArrayList<Integer>(temp.values());
//         System.out.println(newList);
//         int size = newList.size();
//         for (int index=0; index<size; index++){
//             if (newList.get(index) > value){
//                 newList.add(index, value);
//                 break;
//             }
//             if (index==size-1){
//                 newList.add(value);
//             }
//         }
//         System.out.println(newList);
//         temp.clear();
//         for (int index=0; index<size+1; index++){
//             temp.put(index, newList.get(index));
//         }
//     }

//     public static void swap(HashMap<Integer, Integer> temp, int index1, int index2){
//         System.out.println("Swapping things");
//         if (index1>index2){
//             int tempIndex = index2;
//             index2 = index1;
//             index1 = tempIndex;
//         }

//         ArrayList<Integer> newList = new ArrayList<Integer>(temp.values());
//         int size = newList.size();
//         newList.add(index1, newList.get(index2));
//         newList.add(index2+1, newList.get(index1+1));
//         newList.remove(index2+2);
//         newList.remove(index1+1);
//         System.out.println(newList);

//         temp.clear();
//         for(int index=0; index<size; index++){
//             temp.put(index, newList.get(index));
//         }
//         System.out.println("Exiting swap");
//     }

    
//     public static void main(String[] args) {
//         HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
//         temp.put(1, 1);
//         temp.put(2, 3);
//         temp.put(3, 5);
//         temp.put(4, 7);
//         temp.put(5, 10);

//         addAndSort(temp, 11);
//         addAndSort(temp, 6);

//         swap(temp,3,5);
//         swap(temp,5,3);
//         addAndSort(temp, 19);

//         finder();

//     }
// }