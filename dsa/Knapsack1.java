package dsa;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack1{
	
public static class ItemValue{
    int weight;
    int value;

    ItemValue(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
}

public static double BestValue(ItemValue[] arr , int capacity){
    Arrays.sort(arr, new Comparator<ItemValue>(){
        public int compare(ItemValue item1 , ItemValue item2){
            double cp1 = (double)item1.value/(double)item1.weight;
            double cp2 = (double)item2.value/(double)item2.weight;

            if(cp1 < cp2){
                return 1;
            }else{
                return -1;
            }
            //return 0;
           
        }
    });

    double totalValue = 0;

    for(ItemValue i : arr){
        int currWeight = i.weight;
        int curvalue = i.value;

        if(currWeight <= capacity){
             capacity -= currWeight;
            totalValue += curvalue; 
        }else{
            double fraction = (double)capacity/(double)currWeight;
            totalValue += (curvalue * fraction);
           capacity = (int)(capacity - (currWeight * fraction));
          // capacity = 0;
            break;
        }
    }

    return totalValue;
}
public static void main(String args[]){
    ItemValue[] arr = { new ItemValue(1,5),
        new ItemValue(3,10),
        new ItemValue(5,15),
        new ItemValue(4,7),
        new ItemValue(1,8),
        new ItemValue(3,9),
        new ItemValue(2,4) };
        

    int capacity = 15;

    double maxValue = BestValue(arr, capacity);

    // Function call
    System.out.println(maxValue);
}
}