void main() {
    IO.println("Rock, Paper, Scissors!");
    IO.println("To play, please enter moves with just the two initials");
    IO.println("of the choices of Player 1 and Player 2 for the move:");
    IO.println("PP, PR, PS, RP, RR, RS, SP, SR, SS");
    // Make the program accept inputs until one player’s score is
    // more than 3 points ahead of the other.
    int differenceForVictory = 4; // one more than 3;
    // better: final int DIFFERENCE_FOR_VICTORY = 4;

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    // better: all these variables should be final and in capital letters
    String pp = "PP";
    String pr = "PR";
    String ps = "PS";
    String rp = "RP";
    String rr = "RR";
    String rs = "RS";
    String sp = "SP";
    String sr = "SR";
    String ss = "SS";

    while (scorePlayer1 - scorePlayer2 < differenceForVictory
            && scorePlayer2 - scorePlayer1 < differenceForVictory) {
        String move = IO.readln("Please enter the next move: ");
        // In the next condition, we need to use .equals rather than ==
        // because we are checking Strings for equality
        if (! (move.equals(pp) || move.equals(pr) || move.equals(ps)
               || move.equals(rp) || move.equals(rr) || move.equals(rs)
               || move.equals(sp) || move.equals(sr) || move.equals(ss))) {
            IO.println("Illegal move!");
        }
        if (move.equals(pr) || move.equals(rs) || move.equals(sp)) {
            scorePlayer1 = scorePlayer1 + 1;
        } else if (move.equals(ps) || move.equals(rp) || move.equals(sr)) {
            scorePlayer2 = scorePlayer2 + 1;
        }
        // else draw: no score change
        IO.println("Current score -- Player 1 has " + scorePlayer1
            + " points, Player 2 has " + scorePlayer2 + " points.");
    }

    // We have exited the loop, so one of the scores must be larger than
    // the other by at least differenceForVictory at this point.
    if (scorePlayer1 > scorePlayer2) {
        IO.println("Player 1 wins!");
    } else {
        IO.println("Player 2 wins!");
    }
}
