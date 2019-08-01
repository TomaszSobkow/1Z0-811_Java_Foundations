public class ExtraTest {



        void exercise1() {
            int[] player1Cards = {10, 6, 8, 9, 7, 12, 7};
            int[] player2Cards = {7, 6, 9, 5, 2, 8, 11};

            int player1Wins = 0;
            int player2Wins = 0;

            int indexPlayer2 = 0;
            for (int indexPlayer1 = 0; indexPlayer1 < player1Cards.length; indexPlayer1++){
                for (indexPlayer2 = indexPlayer2; indexPlayer2 < player2Cards.length; ){
                    if(player1Cards[indexPlayer1] > player2Cards[indexPlayer2]){
                        System.out.println("Round No: "+ (indexPlayer1+1)+"- Player 1 wins the round: "+player1Cards[indexPlayer1]+
                                " beats " + player2Cards[indexPlayer2]+"\n");
                        player1Wins++;
                        break;
                    }
                    else if(player1Cards[indexPlayer1] < player2Cards[indexPlayer2]){
                        System.out.println("Round No: "+(indexPlayer1+1)+"- Player 2 wins the round: "+ player2Cards[indexPlayer2]+
                                " beats " + player1Cards[indexPlayer1]+"\n");
                        player2Wins++;
                        break;
                    }
                   else if(player1Cards[indexPlayer1] == player2Cards[indexPlayer2]){
                        System.out.println("Round No: "+(indexPlayer1+1)+"- Tie!"+ player1Cards[indexPlayer1]+" ties with "+
                                player2Cards[indexPlayer2]+"\n");
                        break;
                    }
                }indexPlayer2++;
            }
            if(player1Wins > player2Wins){
                System.out.println("Player One wins!! He won "+player1Wins+" rounds beating Player Two who won "+ player2Wins+" rounds!\nGoodbye!");
            }
            else
                System.out.println("Player Two wins!! He won "+player2Wins+" rounds beating Player Two who won "+player1Wins+" rounds!\nGoodbye!");
        }

        void exercise2(){
            int[] amountArray = {60, 20, 100, 80, 40, 300, 200, 100};
            int bank = 500;
            int i ;
            for(i = 0; i < amountArray.length; i++){
                if(bank >= amountArray[i]){
                    System.out.println("Cash in pot: "+ bank);
                    bank -= amountArray[i];
                    System.out.println("Loan aount requested: "+amountArray[i]+" - Loan amount granted!\n");
                }

                else if (bank < amountArray[i] && bank > 0){
                    System.out.println("Cash in the pot: "+ bank+"\nLoan amount requested: "+amountArray[i]+
                            "\nThe exact loan request amount cannot be processed in full (insuficient founds avialable)."+
                            "\nHowever, we will gave you what we can... " + bank+"\n");
                    bank =0;
                    i++;
                    System.out.println("Cash remaining in the pot: "+ bank+ "\n\nThe following loan requests could not be facilitated.");
                    System.out.println(+amountArray[i]);
                    i++;
                    System.out.println(+amountArray[i]);
                }

            }


        }
}
