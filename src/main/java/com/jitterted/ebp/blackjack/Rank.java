package com.jitterted.ebp.blackjack;

public class Rank {
  public static final String JQK = "JQK";
  public static final int INT_10 = 10;
  public static final int INT_1 = 1;
  public static final String A = "A";
  private final String rank;

  public Rank(String rank) {
    this.rank = rank;
  }

  public static Rank of(String rank) {
    return new Rank(rank);
  }

  public int rankValue() {
    if (isJQK()) {
      return INT_10;
    } else if (isAce()) {
      return INT_1;
    } else {
      return Integer.parseInt(rank);
    }
  }

  private boolean isAce() {
    return rank.equals(A);
  }

  private boolean isJQK() {
    return JQK.contains(rank);
  }

  public String display() {
    return rank;
  }
}
