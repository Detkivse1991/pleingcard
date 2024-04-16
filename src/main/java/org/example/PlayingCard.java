package org.example;

import java.util.Objects;

public class PlayingCard {
    private Rank rank;
    private Suit suit;
    public PlayingCard(Rank rank, Suit suit){
        this.rank=rank;
        this.suit=suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCard that = (PlayingCard) o;
        return rank == that.rank && suit == that.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public enum Rank{
        Ace,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King

    }
    public enum Suit{
        Hearts,Diamonds,Clubs,Spades
    }
}

