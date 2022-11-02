import java.util.*;
class Guesser
{
  int gnum;
  int guessingNum()
  {
    System.out.println ("guesser ,kindly guess one number");
    Scanner scan = new Scanner(System.in);
      gnum = scan.nextInt();
      return gnum;
  }

}
class Player
{
  int pnum;
  int pridictingNum()
  {
    System.out.println ("player kindly pridict one number");
      Scanner scan = new Scanner(System.in);
      pnum = scan.nextInt();
      return pnum;
  }
}
class Umpire
{
   int numFromGuesser;
   int numFromPlayer1;
   int numFRomPlayer2;
   int numFromPlayer3;
   void collectingNumFromGuessor()
   {
      Guesser g=new Guesser();
      numFromGuesser=g.guessingNum();
   }
   void collectingNumFromPlayers()
   {
       Player p1 = new Player();
       Player p2=new Player();
       Player p3=new Player();
       numFromPlayer1=p1.pridictingNum();
       numFRomPlayer2=p2.pridictingNum();
       numFromPlayer3=p3.pridictingNum();
   }
   void comparing()
   {
       if (numFromPlayer1 == numFromGuesser){
       System.out.println("player1 won the match");
       }
       else if(numFRomPlayer2 == numFromGuesser){
           System.out.println("player 2 won the match");
       }
       else if(numFromPlayer3 == numFromGuesser){
           System.out.println("player3 won the match");
       }
       else {
           System.out.println("match fail try again");
       }
       
   }
  
}
class Main
{
  public static void main (String[] args) {
        Umpire u=new Umpire();
        u.collectingNumFromGuessor();
        u.collectingNumFromPlayers();
        u.comparing();
    }
}
