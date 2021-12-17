package seasons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import teams.Player;
import teams.Team;

public class SerieA2006Season {

    public static Team createMilan() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Dida", "GKP", 92, 0, 0);
        
        Player def1 = new Player("Stam", "DEF", 90, 0.26, 0.21);
        Player def2 = new Player("Nesta", "DEF", 90, 0.36, 0.41);
        Player def3 = new Player("Maldini", "DEF", 91, 0.34, 0.22);
        Player def4 = new Player("Cafu", "DEF", 87, 0.22, 0.61);
        
        Player mid1 = new Player("Gattuso", "MID", 87, 0.78, 0.21);
        Player mid2 = new Player("Pirlo", "MID",  86, 0.47, 0.84);
        Player mid3 = new Player("Seedorf", "MID", 90, 0.84, 0.88);
        
        Player for1 = new Player("Kaka", "FOR", 90, 0.88, 0.87);
        Player for2 = new Player("Shevchenko", "FOR", 93, 0.95, 0.77);
        Player for3 = new Player("Gilardino", "FOR", 87, 0.93, 0.94);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("AC Milan", playerList);
    }
    
    public static Team createJuventus() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Buffon", "GKP", 95, 0, 0);
        
        Player def1 = new Player("Zebina", "DEF", 74, 0.37, 0.67);
        Player def2 = new Player("Thuram", "DEF", 90, 0.21, 0.39);
        Player def3 = new Player("Cannavaro", "DEF", 89, 0.44, 0.71);
        Player def4 = new Player("Zambrotta", "DEF", 91, 0.33, 0.92);
        
        Player mid1 = new Player("Camoranesi", "MID", 84, 0.82, 0.92);
        Player mid2 = new Player("Viera", "MID", 89, 0.72, 0.52);
        Player mid3 = new Player("Nedved", "MID", 90, 0.85, 0.97);
        
        Player for1 = new Player("Ibrahimovic", "FOR", 91, 0.90, 0.91);
        Player for2 = new Player("Del Piero", "FOR", 89, 0.89, 0.89);
        Player for3 = new Player("Trezeguet", "FOR", 92, 0.95, 0.77);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Juventus", playerList);
    }
    
    public static Team createInternazionale() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Toldo", "GKP", 90, 0, 0);
        
        Player def1 = new Player("Ze Maria", "DEF", 71, 0.32, 0.41);
        Player def2 = new Player("Cordoba", "DEF",  79, 0.44, 0.38);
        Player def3 = new Player("Samuel", "DEF", 87, 0.42, 0.63);
        Player def4 = new Player("Zanetti", "DEF", 85, 0.30, 0.24);
        
        Player mid1 = new Player("Cambiasso", "MID", 85, 0.59, 0.58);
        Player mid2 = new Player("Solari", "MID", 84, 0.84, 0.82);
        Player mid3 = new Player("Figo", "MID", 89, 0.89, 0.82);
        
        Player for1 = new Player("Martins", "FOR", 85, 0.89, 0.88);
        Player for2 = new Player("Adriano", "FOR", 94, 0.96, 0.89);
        Player for3 = new Player("Recoba", "FOR", 86, 0.80, 0.89);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Internazionale", playerList);
    }
    
    public static Team createRoma() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Curci", "GKP", 75, 0, 0);
        
        Player def1 = new Player("Panucci", "DEF", 78, 0.47, 0.39);
        Player def2 = new Player("Kuffour", "DEF", 80, 0.42, 0.34);
        Player def3 = new Player("Chivu", "DEF", 81, 0.23, 0.78);
        Player def4 = new Player("Mexes", "DEF", 84, 0.28, 0.35);
        
        Player mid1 = new Player("De Rossi", "MID", 78, 0.79, 0.76);
        Player mid2 = new Player("Mancini", "MID", 81, 0.78, 0.56);
        Player mid3 = new Player("Perrotta", "MID", 81, 0.74, 0.43);
        
        Player for1 = new Player("Totti", "FOR", 89, 0.82, 0.85);
        Player for2 = new Player("Montella", "FOR", 83, 0.80, 0.78);
        Player for3 = new Player("Cassano", "FOR", 89, 0.88, 0.81);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("AS Roma", playerList);
    }
    
    public static Team createLazio() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Peruzzi", "GKP", 85, 0, 0);
        
        Player def1 = new Player("Oddo", "DEF", 84, 0.28, 0.41);
        Player def2 = new Player("Stendardo", "DEF", 71, 0.26, 0.60);
        Player def3 = new Player("Emilson", "DEF", 74, 0.47, 0.23);
        Player def4 = new Player("Zauri", "DEF", 73, 0.33, 0.53);
        
        Player mid1 = new Player("Liverani", "MID", 81, 0.67, 0.33);
        Player mid2 = new Player("Behrami", "MID", 70, 0.63, 0.74);
        Player mid3 = new Player("Cesar", "MID", 85, 0.80, 0.60);
        
        Player for1 = new Player("Di Canio", "FOR", 81, 0.81, 0.62);
        Player for2 = new Player("Rocchi", "FOR", 76, 0.81, 0.44);
        Player for3 = new Player("Inzaghi", "FOR", 84, 0.90, 0.39);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Lazio", playerList);
    }
    
    public static Team createFiorentina() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Frey", "GKP", 83, 0, 0);
        
        Player def1 = new Player("Pancaro", "DEF", 72, 0.32, 0.23);
        Player def2 = new Player("Ujfalusi", "DEF", 83, 0.31, 0.64);
        Player def3 = new Player("Viali", "DEF", 76, 0.37, 0.57);
        Player def4 = new Player("Maggio", "DEF", 69, 0.41, 0.68);
        
        Player mid2 = new Player("Fiore", "MID", 76, 0.76, 0.89);
        Player mid1 = new Player("Brocchi", "MID", 74, 0.53, 0.61);
        Player mid3 = new Player("Jorgensen", "MID", 81, 0.78, 0.79);
        
        Player for1 = new Player("Bojinov", "FOR", 81, 0.91, 0.79);
        Player for2 = new Player("Toni", "FOR", 80, 0.87, 0.46);
        Player for3 = new Player("Pazzini", "FOR", 73, 0.77, 0.68);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Fiorentina", playerList);
    }
    
    public static Team createSiena() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Mirante", "GKP", 67, 0, 0);
        
        Player def1 = new Player("Colonnese", "DEF", 71, 0.44, 0.53);
        Player def2 = new Player("Negro", "DEF", 72, 0.27, 0.66);
        Player def3 = new Player("Legrottaglie", "DEF", 81, 0.40, 0.43);
        Player def4 = new Player("Falsini", "DEF", 66, 0.36, 0.39);
        
        Player mid2 = new Player("Vergassola", "MID", 67, 0.40, 0.66);
        Player mid1 = new Player("Alberto", "MID", 77, 0.47, 0.48);
        Player mid3 = new Player("Cozza", "MID", 79, 0.81, 0.81);
        
        Player for1 = new Player("Locatelli", "FOR", 67, 0.48, 0.78);
        Player for2 = new Player("Chiesa", "FOR", 73, 0.79, 0.74);
        Player for3 = new Player("Nanni", "FOR", 78, 0.86, 0.73);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Siena", playerList);
    }
    
    public static Team createParma() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Lupatelli", "GKP", 69, 0, 0);
        
        Player def1 = new Player("Bonera", "DEF", 81, 0.30, 0.36);
        Player def2 = new Player("Cannavaro", "DEF", 68, 0.47, 0.41);
        Player def3 = new Player("Cardone", "DEF", 66, 0.21, 0.37);
        Player def4 = new Player("Pasquale", "DEF", 70, 0.24, 0.43);
        
        Player mid2 = new Player("Simplicio", "MID", 76, 0.68, 0.77);
        Player mid1 = new Player("Grella", "MID", 70, 0.60, 0.46);
        Player mid3 = new Player("Bresciano", "MID", 73, 0.72, 0.44);
        
        Player for1 = new Player("Dedic", "FOR", 59, 0.66, 0.67);
        Player for2 = new Player("Corradi", "FOR", 80, 0.82, 0.61);
        Player for3 = new Player("Grieco", "FOR", 64, 0.60, 0.57);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Parma", playerList);
    }
    
    public static Team createSampdoria() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Antonioli", "GKP", 67, 0, 0);
        
        Player def1 = new Player("Zenoni", "DEF", 68, 0.60, 0.71);
        Player def2 = new Player("Sala", "DEF", 75, 0.25, 0.51);
        Player def3 = new Player("Pavan", "DEF", 72, 0.48, 0.55);
        Player def4 = new Player("Pisano", "DEF", 67, 0.32, 0.68);
        
        Player mid2 = new Player("Doni", "MID", 72, 0.69, 0.82);
        Player mid1 = new Player("Volpi", "MID", 70, 0.43, 0.82);
        Player mid3 = new Player("Tonetto", "MID", 71, 0.61, 0.79);
        
        Player for1 = new Player("Bazzani", "FOR", 77, 0.87, 0.69);
        Player for2 = new Player("Flachi", "FOR", 77, 0.70, 0.81);
        Player for3 = new Player("Bonazzoli", "FOR", 76, 0.70, 0.48);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Sampdoria", playerList);
    }
    
    public static Team createLecce() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Sicignano", "GKP", 77, 0, 0);
        
        Player def1 = new Player("Angelo", "DEF", 70, 0.49, 0.79);
        Player def2 = new Player("Stovini", "DEF", 69, 0.54, 0.41);
        Player def3 = new Player("Diamoutene", "DEF", 67, 0.47, 0.31);
        Player def4 = new Player("Rullo", "DEF", 50, 0.57, 0.42);
        
        Player mid2 = new Player("Giacomazzi", "MID", 73, 0.67, 0.71);
        Player mid1 = new Player("Cassetti", "MID", 72, 0.67, 0.73);
        Player mid3 = new Player("Valdes", "MID", 72, 0.65, 0.62);
        
        Player for1 = new Player("Konan", "FOR", 79, 0.72, 0.71);
        Player for2 = new Player("Vucinic", "FOR", 75, 0.81, 0.57);
        Player for3 = new Player("Eremenko", "FOR", 62, 0.63, 0.59);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Lecce", playerList);
    }
    
    public static Team createPalermo() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Santoni", "GKP", 69, 0, 0);
        
        Player def1 = new Player("Zaccardo", "DEF", 63, 0.48, 0.23);
        Player def2 = new Player("Biava", "DEF", 72, 0.21, 0.23);
        Player def3 = new Player("Barzagli", "DEF", 76, 0.31, 0.21);
        Player def4 = new Player("Grosso", "DEF", 65, 0.21, 0.69);
        
        Player mid2 = new Player("Corini", "MID", 77, 0.72, 0.81);
        Player mid1 = new Player("Barone", "MID", 73, 0.44, 0.79);
        Player mid3 = new Player("Santana", "MID", 70, 0.68, 0.81);
        
        Player for1 = new Player("Pepe", "FOR", 53, 0.40, 0.56);
        Player for2 = new Player("Makinwa", "FOR", 71, 0.73, 0.57);
        Player for3 = new Player("Caracciolo", "FOR", 67, 0.70, 0.68);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Palermo", playerList);
    }
    
    public static Team createUdinese() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("De Sanctis", "GKP", 82, 0, 0);
        
        Player def1 = new Player("Motta", "DEF", 62, 0.23, 0.20);
        Player def2 = new Player("Sensini", "DEF", 81, 0.39, 0.25);
        Player def3 = new Player("Juarez", "DEF", 69, 0.23, 0.47);
        Player def4 = new Player("Candela", "DEF", 75, 0.42, 0.44);
        
        Player mid2 = new Player("Pinzi", "MID", 64, 0.48, 0.23);
        Player mid1 = new Player("Vidigal", "MID", 73, 0.47, 0.52);
        Player mid3 = new Player("Zenoni", "MID", 66, 0.62, 0.31);
        
        Player for1 = new Player("Di Michele", "FOR", 74, 0.70, 0.79);
        Player for2 = new Player("Iaquinta", "FOR", 70, 0.68, 0.89);
        Player for3 = new Player("Di Natale", "FOR", 76, 0.75, 0.90);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Udinese", playerList);
    }
    
    public static Team createChievo() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Fontana", "GKP", 71, 0, 0);
        
        Player def1 = new Player("Mantovani", "DEF", 64, 0.32, 0.51);
        Player def2 = new Player("Mandelli", "DEF", 70, 0.28, 0.44);
        Player def3 = new Player("D'Anna", "DEF", 73, 0.32, 0.23);
        Player def4 = new Player("Marchese", "DEF", 62, 0.41, 0.56);
        
        Player mid2 = new Player("Zanchetta", "MID", 65, 0.32, 0.79);
        Player mid1 = new Player("Brighi", "MID", 78, 0.71, 0.61);
        Player mid3 = new Player("Luciano", "MID", 62, 0.62, 0.64);
        
        Player for1 = new Player("Cossato", "FOR", 72, 0.70, 0.67);
        Player for2 = new Player("Amauri", "FOR", 72, 0.70, 0.79);
        Player for3 = new Player("Pellissier", "FOR", 62, 0.60, 0.78);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Chievo", playerList);
    }
    
    public static Team createReggina() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Pelizzoli", "GKP", 79, 0, 0);
        
        Player def1 = new Player("Zoppetti", "DEF", 61, 0.41, 0.32);
        Player def2 = new Player("Cannarsa", "DEF", 63, 0.50, 0.57);
        Player def3 = new Player("Franceschini", "DEF", 63, 0.43, 0.57);
        Player def4 = new Player("De Rosa", "DEF", 73, 0.46, 0.63);
        
        Player mid2 = new Player("Mesto", "MID", 72, 0.41, 0.68);
        Player mid1 = new Player("Mozart", "MID", 67, 0.56, 0.62);
        Player mid3 = new Player("Paredes", "MID", 70, 0.57, 0.58);
        
        Player for1 = new Player("Cavalli", "FOR", 52, 0.50, 0.61);
        Player for2 = new Player("Dionigi", "FOR", 76, 0.80, 0.74);
        Player for3 = new Player("Bianchi", "FOR", 60, 0.60, 0.61);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Reggina", playerList);
    }
    
    public static Team createCagliari() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Campagnolo", "GKP", 62, 0, 0);
        
        Player def1 = new Player("Lopez", "DEF", 61, 0.44, 0.61);
        Player def2 = new Player("Bega", "DEF", 60, 0.42, 0.52);
        Player def3 = new Player("Pisano", "DEF", 56, 0.43, 0.58);
        Player def4 = new Player("Agostini", "DEF", 60, 0.59, 0.59);
        
        Player mid2 = new Player("Gobbi", "MID", 63, 0.48, 0.61);
        Player mid1 = new Player("Abeijon", "MID", 61, 0.44, 0.71);
        Player mid3 = new Player("Budel", "MID", 64, 0.53, 0.64);
        
        Player for1 = new Player("Esposito", "FOR", 71, 0.71, 0.63);
        Player for2 = new Player("Suazo", "FOR", 78, 0.77, 0.71);
        Player for3 = new Player("Langella", "FOR", 69, 0.70, 0.77);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Cagliari", playerList);
    }
    
    public static Team createMessina() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Gazzoli", "GKP", 80, 0, 0);
        
        Player def1 = new Player("Rafael", "DEF", 72, 0.23, 0.56);
        Player def2 = new Player("Zoro", "DEF", 59, 0.39, 0.47);
        Player def3 = new Player("Cristante", "DEF", 64, 0.34, 0.54);
        Player def4 = new Player("Razaei", "DEF", 72, 0.48, 0.68);
        
        Player mid2 = new Player("Donati", "MID", 65, 0.41, 0.57);
        Player mid1 = new Player("D'Agostino", "MID", 67, 0.54, 0.48);
        Player mid3 = new Player("Morelli", "MID", 61, 0.44, 0.42);
        
        Player for1 = new Player("Zampagna", "FOR", 72, 0.80, 0.61);
        Player for2 = new Player("Sculli", "FOR", 71, 0.70, 0.59);
        Player for3 = new Player("Yanagisawa", "FOR", 63, 0.44, 0.58);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Messina", playerList);
    }
    
    public static Team createLivorno() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Amelia", "GKP", 73, 0, 0);
        
        Player def1 = new Player("A. Lucarelli", "DEF", 76, 0.71, 0.66);
        Player def2 = new Player("Belleri", "DEF", 77, 0.53, 0.66);
        Player def3 = new Player("Malera", "DEF", 74, 0.43, 0.37);
        Player def4 = new Player("Grandoni", "DEF", 76, 0.38, 0.67);
        
        Player mid2 = new Player("Grauso", "MID", 66, 0.57, 0.48);
        Player mid1 = new Player("Ruotolo", "MID", 68, 0.62, 0.47);
        Player mid3 = new Player("Licka", "MID", 66, 0.64, 0.68);
        
        Player for1 = new Player("Palladino", "FOR", 67, 0.84, 0.65);
        Player for2 = new Player("C. Lucarelli", "FOR", 68, 0.54, 0.89);
        Player for3 = new Player("Paulinho", "FOR", 59, 0.61, 0.66);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Livorno", playerList);
    }
    
    public static Team createEmpoli() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Berti", "GKP", 74, 0, 0);
        
        Player def1 = new Player("Busce", "DEF", 65, 0.54, 0.42);
        Player def2 = new Player("Pratali", "DEF", 73, 0.43, 0.27);
        Player def3 = new Player("Lucchini", "DEF", 66, 0.43, 0.39);
        Player def4 = new Player("Bonetto", "DEF", 53, 0.41, 0.57);
        
        Player mid2 = new Player("Ascoli", "MID", 72, 0.70, 0.58);
        Player mid1 = new Player("Almiron", "MID", 65, 0.60, 0.43);
        Player mid3 = new Player("Vannucchi", "MID", 65, 0.47, 0.78);
        
        Player for1 = new Player("Gasparetto", "FOR", 61, 0.42, 0.42);
        Player for2 = new Player("Tavano", "FOR", 69, 0.74, 0.36);
        Player for3 = new Player("Pozzi", "FOR", 68, 0.64, 0.43);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Empoli", playerList);
    }
    
    public static Team createTreviso() {
        return new Team("Treviso", Arrays.asList(
                new Player("Handanovic", "GKP", 76, 0, 0),
                new Player("Galeoto", "DEF", 55, 0.43, 0.44),
                new Player("Dellafiore", "DEF", 68, 0.48, 0.44),
                new Player("Zaninelli", "DEF",71, 0.52, 0.48),
                new Player("Di Venanzio", "DEF", 51, 0.48, 0.61),
                new Player("De Martino", "MID", 65, 0.57, 0.56),
                new Player("Anderson", "MID", 66, 0.66, 0.71),
                new Player("Filippini", "MID", 69, 0.51, 0.51),
                new Player("Begheto", "FOR", 52, 0.47, 0.56),
                new Player("Piovaccari", "FOR", 68, 0.77, 0.66),
                new Player("Bagnara", "FOR", 65, 0.71, 0.62)
        ));
    }
    
    public static Team createAscoli() {
        return new Team("Ascoli", Arrays.asList(
                new Player("Coppola", "GKP", 60, 0, 0),
                new Player("Carbone", "DEF", 59, 0.44, 0.59),
                new Player("Martinelli", "DEF", 54, 0.39, 0.49),
                new Player("Corallo", "DEF", 56, 0.36, 0.41),
                new Player("Modesto", "DEF", 55, 0.43, 0.44),
                new Player("Cordova", "MID", 57, 0.56, 0.58),
                new Player("Giampaolo", "MID", 63, 0.61, 0.69),
                new Player("Agomeri", "MID", 53, 0.53, 0.51),
                new Player("Fini", "FOR", 54, 0.51, 0.42),
                new Player("Ferrante", "FOR", 73, 0.80, 0.69),
                new Player("Ascenzi", "FOR", 47, 0.44, 0.52)
        ));
    }
}
