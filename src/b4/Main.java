package b4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        List<FootBallTeam> teamList1 = sorting.getTeamList();
        sorting.setTeamList(teamList1);
        List<FootBallTeam> teamList2 = new ArrayList<>(teamList1);
        List<FootBallTeam> teamList3 = new ArrayList<>(teamList1);
        System.out.println("Ori: "+teamList1);
        sorting.selectionSort(teamList1);
        System.out.println("SS: "+teamList1);
        sorting.insertionSort(teamList2);
        System.out.println("IS: "+teamList2);
        sorting.bubbleSort(teamList3);
        System.out.println("BS: "+teamList3);

    }
}
