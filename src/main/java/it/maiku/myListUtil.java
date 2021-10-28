package it.maiku;
import java.util.ArrayList;


public class myListUtil {
    public static ArrayList<Integer> sort (ArrayList<Integer> list, int order){
        ArrayList<Integer> support = new ArrayList<Integer>();
        if(order == 0){
            //scorro tutto l'array ...
            while(!list.isEmpty()){
                //cerco il min ogni volta ...
                int minIndex = 0;
                for(int i = 0; i < list.size(); i++) {
                    if (list.get(i) < list.get(minIndex))
                        minIndex = i;
                }
                support.add(list.get(minIndex));
                list.remove(minIndex);
            }

        }
        else{
            //scorro tutto l'array ...
            while(!list.isEmpty()){
                //cerco il max ogni volta ...
                int maxIndex = 0;
                for(int i = 0; i < list.size(); i++) {
                    if (list.get(i) > list.get(maxIndex))
                        maxIndex = i;
                }
                support.add(list.get(maxIndex));
                list.remove(maxIndex);
            }
        }

        return support;
    }

}


