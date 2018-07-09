package GreedyAlgorithms;

/**
 * @author : codedsun
 * Created on 09/07/18
 */

import javafx.util.Pair;

import java.util.*;


/**
 * This is the code for activity selection problem
 *
 * @link : https://www.geeksforgeeks.org/greedy-algorithms-set-1-activity-selection-problem/
 */

public class ActivitySelectionProblem {

    private static void getMaximumActivities(List<Pair<Integer, Integer>> activities) {
        int count = 1;
        int index = 0;
        //Printing the key values for the activities performed
        System.out.print(activities.get(index).getKey() + " ");
        for (int i = 1; i < activities.size(); i++) {
            if (activities.get(i).getKey() >= activities.get(index).getValue()) {
                index = i;
                System.out.print(activities.get(i).getValue() + " ");
                count++;
            }
        }

        System.out.println("Total no of activities " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair<Integer, Integer>> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Pair<>(sc.nextInt(), sc.nextInt()));
        }

        sortIt(activities);

        getMaximumActivities(activities);

    }

    private static void sortIt(List<Pair<Integer, Integer>> activites) {
        Collections.sort(activites, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if (o1.getValue() > o2.getValue()) return 1;
                else if (o1.getValue() == o2.getValue()) return 0;
                else return -1;
            }

        });
    }
}
