package DataStructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {

        List<String> classOne= new ArrayList<>();
        classOne.add("APPLE");
        classOne.add("ORANGE");
        classOne.add("PEARS");

        List<String> classTwo= new ArrayList<>();

        classTwo.add("POTATO");
        classTwo.add("ONION");
        classTwo.add("GARLIC");

        List<String> classThree= new ArrayList<>();

        classThree.add("RICE");
        classThree.add("WHEAT");
        classThree.add("BREAD");





        Map<Integer,List<String>> map =new LinkedHashMap<>();

        map.put(1,classOne);
        map.put(2,classTwo);
        map.put(3,classThree);


        for(Map.Entry foodRank: map.entrySet())
        {
            System.out.println("FOOD RANK "+foodRank.getKey()+" :   "+foodRank.getValue());
        }









    }




}
