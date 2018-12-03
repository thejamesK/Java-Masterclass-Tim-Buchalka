package com.jakubkrawczyk;

public class Main {

    public static void main(String[] args)
    {
       boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        int playerHighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Player1", playerHighScorePosition);

        playerHighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Player2", playerHighScorePosition);

        playerHighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Player3", playerHighScorePosition);

        playerHighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Player4", playerHighScorePosition);

        playerHighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Player5", playerHighScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;
    }

    //CHALLENGE
    public static void displayHighScorePosition(String playersName, int playersPosition)
    {
        System.out.println(playersName + " managed to get into position "
                + playersPosition + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playersScore)
    {
//        if(playersScore >= 1000)
//        {
//            return 1;
//        }
//        else if(playersScore >= 500)
//        {
//            return 2;
//        }
//        else if(playersScore >= 100)
//        {
//            return 3;
//        }
//
//        return 4;
        int position = 4; //assuming position 4 will be returned

        if(playersScore >= 1000)
            position = 1;
        else if(playersScore >= 500)
            position = 2;
        else if(playersScore >= 100)
            position = 3;

        return position;
    }
}
