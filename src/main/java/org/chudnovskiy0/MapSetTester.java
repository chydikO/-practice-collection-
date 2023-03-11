package org.chudnovskiy0;

import java.util.*;

public class MapSetTester {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, TreeSet<String>> networkMap = new HashMap<>();

    public static void main(String[] args) {
        addTvShow();
    }

    private static void addTvShow() {
        do {
            setTvChannel();
            System.out.println(networkMap);
            System.out.println("-".repeat(20));
        } while (true);
    }

    private static void setTvChannel() {
        System.out.print(">>> Input tv network -> \t");
        String tvNetwork = scanner.nextLine();
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
        System.out.print(">>> Input tv show on " + tvNetwork + " ->\t");
        return scanner.nextLine();
    }
}
