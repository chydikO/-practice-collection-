package org.chudnovskiy0;

import java.util.*;

public class MapSetTester {
    private static final Map<String, TreeSet<String>> networkMap = new HashMap<>();

    public static void main(String[] args) {
        addTvShow();

        System.out.println("-".repeat(20));
        List sortedKeys=new ArrayList(networkMap.keySet());
        Collections.sort(sortedKeys);
        for (Object key: sortedKeys) {
            System.out.println(key + " -> " + networkMap.get(key));
        }
    }

    private static void addTvShow() {
        int i = 0;
        do {
            setTvChannel();
            System.out.println(networkMap);
            System.out.println("-".repeat(20));
        } while (++i < 10);
    }

    private static void setTvChannel() {
        String tvNetwork = new ConsoleInput().askStr(">>> Input tv network -> \t");
        //TODO: проверка ключа(канала) в списке ключей
        if (!networkMap.containsKey(tvNetwork)) {
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add(getTvShowTitle(tvNetwork));
            networkMap.put(tvNetwork, treeSet);
            System.out.println("TV show added");
        } else if (networkMap.get(tvNetwork).add(getTvShowTitle(tvNetwork))) {
            System.out.println("TV show added");
        } else {
            System.out.println("TV show is duplicate");
        }
    }

    private static String getTvShowTitle(String tvNetwork) {
        return new ConsoleInput().askStr(">>> Input tv show on " + tvNetwork + " ->\t");
    }
}
