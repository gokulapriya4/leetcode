package main.java.com.priya.leetcode.Interview;

import java.util.*;

public class PlayerStatisticsWissenTechInterviewProblem {
    public static class PlayerDetail {
        String name;
        int innings;
        int runs;

        public PlayerDetail(String name, int innings, int runs) {
            this.name = name;
            this.innings = innings;
            this.runs = runs;
        }
    }

    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
        List<PlayerDetail> playerDetails = new ArrayList<>();

        @Override
        public void putNewInnings(String player, int runs) {
            Optional<PlayerDetail> playerOptional = filterByName(player);
            if (playerOptional.isPresent()) {
                PlayerDetail playerDetail = playerOptional.get();
                playerDetail.innings++;
                playerDetail.runs = playerDetail.runs + runs;
            } else {
                PlayerDetail newPlayer = new PlayerDetail(player, 1, runs);
                playerDetails.add(newPlayer);
            }
        }

        @Override
        public double getAverageRuns(String player) {
            Optional<PlayerDetail> playerOptional = filterByName(player);
            if (!playerOptional.isPresent()) {
                throw new RuntimeException("Invalid player Details");
            } else {
                PlayerDetail playerDetail = playerOptional.get();
                return (double) playerDetail.runs / playerDetail.innings;
            }
        }

        @Override
        public int getInningsCount(String player) {
            return filterByName(player).get().innings;
        }


        private Optional<PlayerDetail> filterByName(String player) {
            return playerDetails.stream().filter(playerDetail -> playerDetail.name.equals(player)).findFirst();
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
