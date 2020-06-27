package main.java.com.priya.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class MinimumParkingSpaceWissenTechInterview {

    static int minParkingSpaces(int[][] parkingStartEndTimes) {
        parkingStartEndTimes = sortByFirstColumn(parkingStartEndTimes);
        int minCount = 0, nextVal = 0;
        while (isAllElementsVisited(parkingStartEndTimes)) {
            for (int i = 0; i < parkingStartEndTimes.length; i++) {
                if (parkingStartEndTimes[i][0] != -1 && parkingStartEndTimes[i][0] >= nextVal) {
                    parkingStartEndTimes[i][0] = -1;
                    nextVal = parkingStartEndTimes[i][1];
                }
            }
            minCount++;
            nextVal =0;
        }
        return minCount;
    }

    static boolean isAllElementsVisited(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] != -1) {
                return false;
            }
        }
        return true;
    }

    static int[][] sortByFirstColumn(int[][] arr) {
         Arrays.sort(arr, (entry1, entry2) -> {
            if (entry1[0] > entry2[0])
                return 1;
            else
                return -1;
        });
        return arr;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }

        int out = minParkingSpaces(parkingStartEndTimeList);
        System.out.println(out);

        wr.close();
        br.close();
    }
}