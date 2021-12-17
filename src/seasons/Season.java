package seasons;

import java.util.ArrayList;
import java.util.List;

import matches.MatchDto;
import teams.Team;

public class Season {

    private int id;
    private String year;
    private static List<MatchDto> matches; // olyan generikus tipus ami figyelembe veszi a sorrendet egy attributum alapjan
    
    public Season(String year) {
        this.year = year;
        matches = new ArrayList<>();
    }
    
    public static Season createSeasonWith4Teams(String year, Team team1, Team team2, Team team3, Team team4) {
        
        Season season = new Season(year);
        
        // create week 1
        matches.add(new MatchDto(1, team1, team2));
        matches.add(new MatchDto(1, team4, team3));

        // create week 2
        matches.add(new MatchDto(2, team3, team1));
        matches.add(new MatchDto(2, team2, team4));
        
        // create week 3
        matches.add(new MatchDto(3, team1, team4));
        matches.add(new MatchDto(3, team2, team3));
        
        // create week 4
        matches.add(new MatchDto(4, team2, team1));
        matches.add(new MatchDto(4, team3, team4));
        
        // create week 5
        matches.add(new MatchDto(5, team1, team3));
        matches.add(new MatchDto(5, team4, team2));
        
        // create week 6
        matches.add(new MatchDto(6, team4, team1));
        matches.add(new MatchDto(6, team3, team2));
        
        return season;
        
        
    }
    
    public static Season createSeasonWith20Teams(String year, Team team1, Team team2, Team team3, Team team4, Team team5, Team team6, Team team7, Team team8, Team team9, Team team10, Team team11,
            Team team12, Team team13, Team team14, Team team15, Team team16, Team team17, Team team18, Team team19, Team team20) {
        Season season = new Season(year);
        
        // create week 1
        matches.add(new MatchDto(1, team20, team18));
        matches.add(new MatchDto(1, team11, team13));
        matches.add(new MatchDto(1, team6, team8));
        matches.add(new MatchDto(1, team17, team2));
        matches.add(new MatchDto(1, team10, team1));
        matches.add(new MatchDto(1, team15, team14));
        matches.add(new MatchDto(1, team7, team3));
        matches.add(new MatchDto(1, team9, team4));
        matches.add(new MatchDto(1, team12, team19));
        matches.add(new MatchDto(1, team5, team16));
        
        // create week 2
        matches.add(new MatchDto(2, team18, team6));
        matches.add(new MatchDto(2, team19, team13));
        matches.add(new MatchDto(2, team8, team12));
        matches.add(new MatchDto(2, team14, team20));
        matches.add(new MatchDto(2, team15, team17));
        matches.add(new MatchDto(2, team2, team7));
        matches.add(new MatchDto(2, team4, team11));
        matches.add(new MatchDto(2, team16, team9));
        matches.add(new MatchDto(2, team3, team10));
        matches.add(new MatchDto(2, team1, team5));
        
        // create week 3
        matches.add(new MatchDto(3, team17, team20));
        matches.add(new MatchDto(3, team5, team3));
        matches.add(new MatchDto(3, team6, team14));
        matches.add(new MatchDto(3, team10, team2));
        matches.add(new MatchDto(3, team12, team18));
        matches.add(new MatchDto(3, team9, team1));
        matches.add(new MatchDto(3, team4, team16));
        matches.add(new MatchDto(3, team11, team19));
        matches.add(new MatchDto(3, team13, team8));
        matches.add(new MatchDto(3, team7, team15));
        
        // create week 4
        matches.add(new MatchDto(4, team2, team5));
        matches.add(new MatchDto(4, team6, team17));
        matches.add(new MatchDto(4, team14, team12));
        matches.add(new MatchDto(4, team20, team7));
        matches.add(new MatchDto(4, team18, team13));
        matches.add(new MatchDto(4, team1, team4));
        matches.add(new MatchDto(4, team8, team19));
        matches.add(new MatchDto(4, team3, team9));
        matches.add(new MatchDto(4, team15, team10));
        matches.add(new MatchDto(4, team16, team11));
        
        // create week 5
        matches.add(new MatchDto(5, team9, team2));
        matches.add(new MatchDto(5, team11, team8));
        matches.add(new MatchDto(5, team19, team18));
        matches.add(new MatchDto(5, team17, team12));
        matches.add(new MatchDto(5, team10, team20));
        matches.add(new MatchDto(5, team4, team3));
        matches.add(new MatchDto(5, team5, team15));
        matches.add(new MatchDto(5, team13, team14));
        matches.add(new MatchDto(5, team16, team1));
        matches.add(new MatchDto(5, team7, team6));
        
        // create week 6
        matches.add(new MatchDto(6, team3, team16));
        matches.add(new MatchDto(6, team6, team10));
        matches.add(new MatchDto(6, team20, team5));
        matches.add(new MatchDto(6, team14, team19));
        matches.add(new MatchDto(6, team18, team8));
        matches.add(new MatchDto(6, team1, team11));
        matches.add(new MatchDto(6, team15, team9));
        matches.add(new MatchDto(6, team13, team17));
        matches.add(new MatchDto(6, team12, team7));
        matches.add(new MatchDto(6, team2, team4));
        
        // create week 7
        matches.add(new MatchDto(7, team8, team14));
        matches.add(new MatchDto(7, team10, team12));
        matches.add(new MatchDto(7, team11, team18));
        matches.add(new MatchDto(7, team5, team6));
        matches.add(new MatchDto(7, team16, team2));
        matches.add(new MatchDto(7, team4, team15));
        matches.add(new MatchDto(7, team9, team20));
        matches.add(new MatchDto(7, team1, team3));
        matches.add(new MatchDto(7, team17, team19));
        matches.add(new MatchDto(7, team7, team13));
        
        // create week 8
        matches.add(new MatchDto(8, team3, team11));
        matches.add(new MatchDto(8, team2, team1));
        matches.add(new MatchDto(8, team20, team4));
        matches.add(new MatchDto(8, team8, team17));
        matches.add(new MatchDto(8, team6, team9));
        matches.add(new MatchDto(8, team19, team7));
        matches.add(new MatchDto(8, team14, team18));
        matches.add(new MatchDto(8, team12, team5));
        matches.add(new MatchDto(8, team15, team16));
        matches.add(new MatchDto(8, team13, team10));
        
        // create week 9
        matches.add(new MatchDto(9, team7, team8));
        matches.add(new MatchDto(9, team9, team12));
        matches.add(new MatchDto(9, team1, team15));
        matches.add(new MatchDto(9, team5, team13));
        matches.add(new MatchDto(9, team11, team14));
        matches.add(new MatchDto(9, team16, team20));
        matches.add(new MatchDto(9, team3, team2));
        matches.add(new MatchDto(9, team4, team6));
        matches.add(new MatchDto(9, team10, team19));
        matches.add(new MatchDto(9, team17, team18));
        
        // create week 10
        matches.add(new MatchDto(10, team2, team11));
        matches.add(new MatchDto(10, team6, team16));
        matches.add(new MatchDto(10, team8, team10));
        matches.add(new MatchDto(10, team20, team1));
        matches.add(new MatchDto(10, team13, team9));
        matches.add(new MatchDto(10, team18, team7));
        matches.add(new MatchDto(10, team14, team17));
        matches.add(new MatchDto(10, team19, team5));
        matches.add(new MatchDto(10, team12, team4));
        matches.add(new MatchDto(10, team15, team3));
        
        // create week 11
        matches.add(new MatchDto(11, team16, team12));
        matches.add(new MatchDto(11, team1, team6));
        matches.add(new MatchDto(11, team2, team15));
        matches.add(new MatchDto(11, team17, team11));
        matches.add(new MatchDto(11, team10, team18));
        matches.add(new MatchDto(11, team3, team20));
        matches.add(new MatchDto(11, team7, team14));
        matches.add(new MatchDto(11, team5, team8));
        matches.add(new MatchDto(11, team4, team13));
        matches.add(new MatchDto(11, team9, team19));
        
        // create week 12
        matches.add(new MatchDto(12, team19, team4));
        matches.add(new MatchDto(12, team6, team3));
        matches.add(new MatchDto(12, team12, team1));
        matches.add(new MatchDto(12, team8, team9));
        matches.add(new MatchDto(12, team17, team7));
        matches.add(new MatchDto(12, team14, team10));
        matches.add(new MatchDto(12, team11, team15));
        matches.add(new MatchDto(12, team18, team5));
        matches.add(new MatchDto(12, team13, team16));
        matches.add(new MatchDto(12, team20, team2));
        
        // create week 13
        matches.add(new MatchDto(13, team5, team14));
        matches.add(new MatchDto(13, team2, team6));
        matches.add(new MatchDto(13, team1, team13));
        matches.add(new MatchDto(13, team7, team11));
        matches.add(new MatchDto(13, team3, team12));
        matches.add(new MatchDto(13, team16, team19));
        matches.add(new MatchDto(13, team4, team8));
        matches.add(new MatchDto(13, team9, team18));
        matches.add(new MatchDto(13, team10, team17));
        matches.add(new MatchDto(13, team15, team20));
        
        // create week 14
        matches.add(new MatchDto(14, team12, team2));
        matches.add(new MatchDto(14, team11, team20));
        matches.add(new MatchDto(14, team18, team4));
        matches.add(new MatchDto(14, team7, team10));
        matches.add(new MatchDto(14, team8, team16));
        matches.add(new MatchDto(14, team14, team9));
        matches.add(new MatchDto(14, team17, team5));
        matches.add(new MatchDto(14, team13, team3));
        matches.add(new MatchDto(14, team6, team15));
        matches.add(new MatchDto(14, team19, team1));
        
        // create week 15
        matches.add(new MatchDto(15, team9, team17));
        matches.add(new MatchDto(15, team16, team18));
        matches.add(new MatchDto(15, team2, team13));
        matches.add(new MatchDto(15, team5, team7));
        matches.add(new MatchDto(15, team20, team6));
        matches.add(new MatchDto(15, team1, team8));
        matches.add(new MatchDto(15, team3, team19));
        matches.add(new MatchDto(15, team10, team11));
        matches.add(new MatchDto(15, team15, team12));
        matches.add(new MatchDto(15, team4, team14));
        
        // create week 16
        matches.add(new MatchDto(16, team7, team9));
        matches.add(new MatchDto(16, team19, team2));
        matches.add(new MatchDto(16, team13, team15));
        matches.add(new MatchDto(16, team10, team5));
        matches.add(new MatchDto(16, team14, team16));
        matches.add(new MatchDto(16, team8, team3));
        matches.add(new MatchDto(16, team11, team6));
        matches.add(new MatchDto(16, team12, team20));
        matches.add(new MatchDto(16, team17, team4));
        matches.add(new MatchDto(16, team18, team1));
        
        // create week 17
        matches.add(new MatchDto(17, team9, team10));
        matches.add(new MatchDto(17, team2, team8));
        matches.add(new MatchDto(17, team6, team12));
        matches.add(new MatchDto(17, team15, team19));
        matches.add(new MatchDto(17, team4, team7));
        matches.add(new MatchDto(17, team16, team17));
        matches.add(new MatchDto(17, team5, team11));
        matches.add(new MatchDto(17, team3, team18));
        matches.add(new MatchDto(17, team20, team13));
        matches.add(new MatchDto(17, team1, team14));
        
        // create week 18
        matches.add(new MatchDto(18, team11, team12));
        matches.add(new MatchDto(18, team10, team4));
        matches.add(new MatchDto(18, team5, team9));
        matches.add(new MatchDto(18, team13, team6));
        matches.add(new MatchDto(18, team18, team2));
        matches.add(new MatchDto(18, team14, team3));
        matches.add(new MatchDto(18, team19, team20));
        matches.add(new MatchDto(18, team17, team1));
        matches.add(new MatchDto(18, team8, team15));
        matches.add(new MatchDto(18, team7, team16));
        
        // create week 19
        matches.add(new MatchDto(19, team4, team5));
        matches.add(new MatchDto(19, team20, team8));
        matches.add(new MatchDto(19, team16, team10));
        matches.add(new MatchDto(19, team1, team7));
        matches.add(new MatchDto(19, team2, team14));
        matches.add(new MatchDto(19, team3, team17));
        matches.add(new MatchDto(19, team6, team19));
        matches.add(new MatchDto(19, team12, team13));
        matches.add(new MatchDto(19, team15, team18));
        matches.add(new MatchDto(19, team9, team11));
        
        // create week 20
        matches.add(new MatchDto(20, team16, team5));
        matches.add(new MatchDto(20, team8, team6));
        matches.add(new MatchDto(20, team3, team7));
        matches.add(new MatchDto(20, team19, team12));
        matches.add(new MatchDto(20, team18, team20));
        matches.add(new MatchDto(20, team4, team9));
        matches.add(new MatchDto(20, team2, team17));
        matches.add(new MatchDto(20, team14, team15));
        matches.add(new MatchDto(20, team13, team11));
        matches.add(new MatchDto(20, team1, team10));
        
     // create week 21
        matches.add(new MatchDto(21, team12, team8));
        matches.add(new MatchDto(21, team6, team18));
        matches.add(new MatchDto(21, team7, team2));
        matches.add(new MatchDto(21, team13, team19));
        matches.add(new MatchDto(21, team17, team15));
        matches.add(new MatchDto(21, team5, team1));
        matches.add(new MatchDto(21, team10, team3));
        matches.add(new MatchDto(21, team20, team14));
        matches.add(new MatchDto(21, team11, team4));
        matches.add(new MatchDto(21, team9, team16));
        
     // create week 22
        matches.add(new MatchDto(22, team15, team7));
        matches.add(new MatchDto(22, team1, team9));
        matches.add(new MatchDto(22, team18, team12));
        matches.add(new MatchDto(22, team2, team10));
        matches.add(new MatchDto(22, team20, team17));
        matches.add(new MatchDto(22, team3, team5));
        matches.add(new MatchDto(22, team16, team4));
        matches.add(new MatchDto(22, team14, team6));
        matches.add(new MatchDto(22, team19, team11));
        matches.add(new MatchDto(22, team8, team13));
        
     // create week 23
        matches.add(new MatchDto(23, team10, team15));
        matches.add(new MatchDto(23, team12, team14));
        matches.add(new MatchDto(23, team17, team6));
        matches.add(new MatchDto(23, team11, team16));
        matches.add(new MatchDto(23, team9, team3));
        matches.add(new MatchDto(23, team13, team18));
        matches.add(new MatchDto(23, team5, team2));
        matches.add(new MatchDto(23, team4, team1));
        matches.add(new MatchDto(23, team7, team20));
        matches.add(new MatchDto(23, team19, team8));
        
     // create week 24
        matches.add(new MatchDto(24, team14, team13));
        matches.add(new MatchDto(24, team1, team16));
        matches.add(new MatchDto(24, team15, team5));
        matches.add(new MatchDto(24, team6, team7));
        matches.add(new MatchDto(24, team20, team10));
        matches.add(new MatchDto(24, team8, team11));
        matches.add(new MatchDto(24, team18, team19));
        matches.add(new MatchDto(24, team3, team4));
        matches.add(new MatchDto(24, team12, team17));
        matches.add(new MatchDto(24, team2, team9));
        
     // create week 25
        matches.add(new MatchDto(25, team11, team1));
        matches.add(new MatchDto(25, team4, team2));
        matches.add(new MatchDto(25, team17, team13));
        matches.add(new MatchDto(25, team8, team18));
        matches.add(new MatchDto(25, team16, team3));
        matches.add(new MatchDto(25, team10, team6));
        matches.add(new MatchDto(25, team19, team14));
        matches.add(new MatchDto(25, team9, team15));
        matches.add(new MatchDto(25, team7, team12));
        matches.add(new MatchDto(25, team5, team20));
        
     // create week 26
        matches.add(new MatchDto(26, team3, team1));
        matches.add(new MatchDto(26, team14, team8));
        matches.add(new MatchDto(26, team15, team4));
        matches.add(new MatchDto(26, team20, team9));
        matches.add(new MatchDto(26, team13, team7));
        matches.add(new MatchDto(26, team6, team5));
        matches.add(new MatchDto(26, team19, team17));
        matches.add(new MatchDto(26, team2, team16));
        matches.add(new MatchDto(26, team18, team11));
        matches.add(new MatchDto(26, team12, team10));
        
     // create week 27
        matches.add(new MatchDto(27, team5, team12));
        matches.add(new MatchDto(27, team16, team15));
        matches.add(new MatchDto(27, team18, team14));
        matches.add(new MatchDto(27, team4, team20));
        matches.add(new MatchDto(27, team7, team19));
        matches.add(new MatchDto(27, team10, team13));
        matches.add(new MatchDto(27, team9, team6));
        matches.add(new MatchDto(27, team11, team3));
        matches.add(new MatchDto(27, team1, team2));
        matches.add(new MatchDto(27, team17, team8));
        
     // create week 28
        matches.add(new MatchDto(28, team15, team1));
        matches.add(new MatchDto(28, team20, team16));
        matches.add(new MatchDto(28, team18, team17));
        matches.add(new MatchDto(28, team12, team9));
        matches.add(new MatchDto(28, team19, team10));
        matches.add(new MatchDto(28, team13, team5));
        matches.add(new MatchDto(28, team2, team3));
        matches.add(new MatchDto(28, team14, team11));
        matches.add(new MatchDto(28, team6, team4));
        matches.add(new MatchDto(28, team8, team7));
        
     // create week 29
        matches.add(new MatchDto(29, team3, team15));
        matches.add(new MatchDto(29, team10, team8));
        matches.add(new MatchDto(29, team16, team6));
        matches.add(new MatchDto(29, team7, team18));
        matches.add(new MatchDto(29, team9, team13));
        matches.add(new MatchDto(29, team5, team19));
        matches.add(new MatchDto(29, team4, team12));
        matches.add(new MatchDto(29, team17, team14));
        matches.add(new MatchDto(29, team11, team2));
        matches.add(new MatchDto(29, team1, team20));
        
     // create week 30
        matches.add(new MatchDto(30, team18, team10));
        matches.add(new MatchDto(30, team11, team17));
        matches.add(new MatchDto(30, team8, team5));
        matches.add(new MatchDto(30, team13, team4));
        matches.add(new MatchDto(30, team12, team16));
        matches.add(new MatchDto(30, team6, team1));
        matches.add(new MatchDto(30, team15, team2));
        matches.add(new MatchDto(30, team20, team3));
        matches.add(new MatchDto(30, team14, team7));
        matches.add(new MatchDto(30, team19, team9));
        
     // create week 31
        matches.add(new MatchDto(31, team2, team20));
        matches.add(new MatchDto(31, team10, team14));
        matches.add(new MatchDto(31, team3, team6));
        matches.add(new MatchDto(31, team7, team17));
        matches.add(new MatchDto(31, team4, team19));
        matches.add(new MatchDto(31, team5, team18));
        matches.add(new MatchDto(31, team15, team11));
        matches.add(new MatchDto(31, team16, team13));
        matches.add(new MatchDto(31, team1, team12));
        matches.add(new MatchDto(31, team9, team8));
        
     // create week 32
        matches.add(new MatchDto(32, team18, team9));
        matches.add(new MatchDto(32, team19, team16));
        matches.add(new MatchDto(32, team14, team5));
        matches.add(new MatchDto(32, team6, team2));
        matches.add(new MatchDto(32, team11, team7));
        matches.add(new MatchDto(32, team8, team4));
        matches.add(new MatchDto(32, team13, team1));
        matches.add(new MatchDto(32, team20, team15));
        matches.add(new MatchDto(32, team12, team3));
        matches.add(new MatchDto(32, team17, team10));
        
     // create week 33
        matches.add(new MatchDto(33, team16, team8));
        matches.add(new MatchDto(33, team3, team13));
        matches.add(new MatchDto(33, team5, team17));
        matches.add(new MatchDto(33, team2, team12));
        matches.add(new MatchDto(33, team20, team11));
        matches.add(new MatchDto(33, team1, team19));
        matches.add(new MatchDto(33, team10, team7));
        matches.add(new MatchDto(33, team4, team18));
        matches.add(new MatchDto(33, team15, team6));
        matches.add(new MatchDto(33, team9, team14));
        
     // create week 34
        matches.add(new MatchDto(34, team18, team16));
        matches.add(new MatchDto(34, team11, team10));
        matches.add(new MatchDto(34, team6, team20));
        matches.add(new MatchDto(34, team14, team4));
        matches.add(new MatchDto(34, team19, team3));
        matches.add(new MatchDto(34, team13, team2));
        matches.add(new MatchDto(34, team17, team9));
        matches.add(new MatchDto(34, team8, team1));
        matches.add(new MatchDto(34, team7, team5));
        matches.add(new MatchDto(34, team12, team15));
        
     // create week 35
        matches.add(new MatchDto(35, team20, team12));
        matches.add(new MatchDto(35, team9, team7));
        matches.add(new MatchDto(35, team16, team14));
        matches.add(new MatchDto(35, team3, team8));
        matches.add(new MatchDto(35, team2, team19));
        matches.add(new MatchDto(35, team4, team17));
        matches.add(new MatchDto(35, team5, team10));
        matches.add(new MatchDto(35, team1, team18));
        matches.add(new MatchDto(35, team15, team13));
        matches.add(new MatchDto(35, team6, team11));
        
     // create week 36
        matches.add(new MatchDto(36, team10, team9));
        matches.add(new MatchDto(36, team14, team1));
        matches.add(new MatchDto(36, team8, team2));
        matches.add(new MatchDto(36, team19, team15));
        matches.add(new MatchDto(36, team11, team5));
        matches.add(new MatchDto(36, team12, team6));
        matches.add(new MatchDto(36, team17, team16));
        matches.add(new MatchDto(36, team7, team4));
        matches.add(new MatchDto(36, team13, team20));
        matches.add(new MatchDto(36, team18, team3));
        
     // create week 37
        matches.add(new MatchDto(37, team6, team13));
        matches.add(new MatchDto(37, team2, team18));
        matches.add(new MatchDto(37, team16, team7));
        matches.add(new MatchDto(37, team12, team11));
        matches.add(new MatchDto(37, team1, team17));
        matches.add(new MatchDto(37, team9, team5));
        matches.add(new MatchDto(37, team20, team19));
        matches.add(new MatchDto(37, team15, team8));
        matches.add(new MatchDto(37, team3, team14));
        matches.add(new MatchDto(37, team4, team10));
        
     // create week 38
        matches.add(new MatchDto(38, team5, team4));
        matches.add(new MatchDto(38, team13, team12));
        matches.add(new MatchDto(38, team10, team16));
        matches.add(new MatchDto(38, team11, team9));
        matches.add(new MatchDto(38, team8, team20));
        matches.add(new MatchDto(38, team17, team3));
        matches.add(new MatchDto(38, team7, team1));
        matches.add(new MatchDto(38, team19, team6));
        matches.add(new MatchDto(38, team14, team2));
        matches.add(new MatchDto(38, team18, team15));
        
        return season;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static List<MatchDto> getMatches() {
        return matches;
    }

    public static void setMatches(List<MatchDto> matches) {
        Season.matches = matches;
    }
    
    
}
