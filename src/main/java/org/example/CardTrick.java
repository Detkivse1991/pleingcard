package org.example;

import javax.sound.sampled.Line;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CardTrick {
    public static void sortByRank(ArrayList<PlayingCard> cards){
        Collections.sort(cards);
    }
    public static void main(String args){
        List<PlayingCard>=new ArrayList<>();
        try {
            File file = new File("cards.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                String parts= line.split(",");
                String suit=parts0;
                String rank=parts1;
                cards.add(new PlayingCard(suit,rank));

                }
            scanner.close();
            } catch (FileNotFoundException e){
            System.out.println("File not found.");

        }
        sortByRank(cards);
        for (PlayingCard playingCard:cards){
            System.out.println(playingCard);
        }

    }
}
class PlayingCard implements Comparable<PlayingCard>{
    @Override
    public int compareTo(PlayingCard o) {
        return 0;
    }

    private String suit;
    private String rank;

    @Override
    public String toString() {
        return "PlayingCard{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public PlayingCard(String suit, String rank){
        this.suit=suit;
        this.rank=rank;
    }


}
