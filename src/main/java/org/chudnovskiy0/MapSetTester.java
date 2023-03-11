package org.chudnovskiy0;

import java.util.*;

public class MapSetTester {
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<String, TreeSet<String>> networkMap = new HashMap<>();

    public static void main(String[] args) {
        addTvShow();
    }

    /**
     * В цикле запросите у пользователя название телешоу, а затем запросите пользователя ввести имя телевизионного
     * канала для этого шоу. После того, как у вас появятся исходные данные, найдите канал в словаре networkMap.
     *
     * Если канал еще не добавлен в словарь, то создайте множество TreeSet в которое добавьте название телешоу,
     * а затем ключ к паре значений (канал, с заданным телевизионным шоу) в словарь.
     *
     * Если канал находится в словаре, добавьте телешоу к множеству TreeSet этого телеканала.
     */
    private static void addTvShow() {
            getTvShows();
        System.out.println();
    }

    private static void getTvShows() {
        Set<String> tvShows = getTvShowTitle();
        networkMap.put(getTvChannel(), (TreeSet<String>) tvShows);

    }

    private static String getTvChannel() {
        System.out.println(">>> Input TV channel-> \t");
        String tvChannel = scanner.nextLine();
        //TODO: проверка ключа(канала) в списке ключей
        return tvChannel;
    }

    private static Set<String> getTvShowTitle() {
        Set<String> result = new TreeSet<>();

        String isBreak;
        do {
            System.out.print(">>> Input TV show or type \"break\" to stop->\t");
            isBreak = scanner.nextLine();
            if (isBreak.equals("break".toLowerCase(Locale.ROOT))) break;
            result.add(isBreak);
        } while (true);
        System.out.println("-".repeat(20));
        return result;
    }
}
