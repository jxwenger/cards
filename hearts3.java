
import java.io.*;
import java.util.*;
public class hearts3{
     static ObjCard[] card = new ObjCard [54];
     static ObjCard[] P1card = new ObjCard [13];
     static ObjCard[] P2card = new ObjCard [13];
     static ObjCard[] P3card = new ObjCard [13];
     static ObjCard[] P4card = new ObjCard [13];
     static ai art = new ai();
    public static void main(String args[]){
        card[0] = new ObjCard(2,1,"Two of Hearts",false,0);
      card[1] = new ObjCard(3,1,"Three of Hearts",false,0);
      card[2] = new ObjCard(4,1,"Four of Hearts",false,0);
      card[3] = new ObjCard(5,1,"Five of Hearts",false,0);
      card[4] = new ObjCard(6,1,"Six of Hearts",false,0);
      card[5] = new ObjCard(7,1,"Seven of Hearts",false,0);
      card[6] = new ObjCard(8,1,"Eight of Hearts",false,0);
      card[7] = new ObjCard(9,1,"Nine of Hearts",false,0);
      card[8] = new ObjCard(10,1,"Ten of Hearts",false,0);
      card[9] = new ObjCard(11,1,"Jack of Hearts",false,0);
      card[10] = new ObjCard(12,1,"Queen of Hearts",false,0);
      card[11] = new ObjCard(13,1,"King of Hearts",false,0);
      card[12] = new ObjCard(14,1,"Ace of Hearts",false,0);
      card[13] = new ObjCard(2,2,"Two of Diamonds",false,0);
      card[14] = new ObjCard(3,2,"Three of Diamonds",false,0);
      card[15] = new ObjCard(4,2,"Four of Diamonds",false,0);
      card[16] = new ObjCard(5,2,"Five of Diamonds",false,0);
      card[17] = new ObjCard(6,2,"Six of Diamonds",false,0);
      card[18] = new ObjCard(7,2,"Seven of Diamonds",false,0);
      card[19] = new ObjCard(8,2,"Eight of Diamonds",false,0);
      card[20] = new ObjCard(9,2,"Nine of Diamonds",false,0);
      card[21] = new ObjCard(10,2,"Ten of Diamonds",false,0);
      card[22] = new ObjCard(11,2,"Jack of Diamonds",false,0);
      card[23] = new ObjCard(12,2,"Queen of Diamonds",false,0);
      card[24] = new ObjCard(13,2,"King of Diamonds",false,0);
      card[25] = new ObjCard(14,2,"Ace of Diamonds",false,0);
      card[26] = new ObjCard(2,3,"Two of Clubs",false,0);
      card[27] = new ObjCard(3,3,"Three of Clubs",false,0);
      card[28] = new ObjCard(4,3,"Four of Clubs",false,0);
      card[29] = new ObjCard(5,3,"Five of Clubs",false,0);
      card[30] = new ObjCard(6,3,"Six of Clubs",false,0);
      card[31] = new ObjCard(7,3,"Seven of Clubs",false,0);
      card[32] = new ObjCard(8,3,"Eight of Clubs",false,0);
      card[33] = new ObjCard(9,3,"Nine of Clubs",false,0);
      card[34] = new ObjCard(10,3,"Ten of Clubs",false,0);
      card[35] = new ObjCard(11,3,"Jack of Clubs",false,0);
      card[36] = new ObjCard(12,3,"Queen of Clubs",false,0);
      card[37] = new ObjCard(13,3,"King of Clubs",false,0);
      card[38] = new ObjCard(14,3,"Ace of Clubs",false,0);
      card[39] = new ObjCard(2,4,"Two of Spades",false,0);
      card[40] = new ObjCard(3,4,"Three of Spades",false,0);
      card[41] = new ObjCard(4,4,"Four of Spades",false,0);
      card[42] = new ObjCard(5,4,"Five of Spades",false,0);
      card[43] = new ObjCard(6,4,"Six of Spades",false,0);
      card[44] = new ObjCard(7,4,"Seven of Spades",false,0);
      card[45] = new ObjCard(8,4,"Eight of Spades",false,0);
      card[46] = new ObjCard(9,4,"Nine of Spades",false,0);
      card[47] = new ObjCard(10,4,"Ten of Spades",false,0);
      card[48] = new ObjCard(11,4,"Jack of Spades",false,0);
      card[49] = new ObjCard(12,4,"Queen of Spades",false,0);
      card[50] = new ObjCard(13,4,"King of Spades",false,0);
      card[51] = new ObjCard(14,4,"Ace of Spades",false,0);
      card[52] = new ObjCard(0,0,"",true,0);
     
     int counter=1;
     //String hand1 = "[1]" + P1card[0].name + "\t[2]" +P1card[1].name + "\t[3]" + P1card[2].name + "\n[4]" + P1card[3].name + "[5]\t" + P1card[4].name + "\t[6]" + P1card[5].name + "\n[7]" + P1card[6].name +"\t[8]" + P1card[7].name +"\t[9]" + P1card[8].name +"\n[10]" + P1card[9].name +"[11]\t" + P1card[10].name +"\t[12]" + P1card[11].name + "\t[13]" +P1card[12].name;
      //String hand2 = "[1]" + P2card[0].name + "\t[2]" +P2card[1].name + "\t[3]" + P2card[2].name + "\n[4]" + P2card[3].name + "[5]\t" + P2card[4].name + "\t[6]" + P2card[5].name + "\n[7]" + P2card[6].name +"\t[8]" + P2card[7].name +"\t[9]" + P2card[8].name +"\n[10]" + P2card[9].name +"[11]\t" + P2card[10].name +"\t[12]" + P2card[11].name + "\t[13]" +P2card[12].name;  
     // String hand3 = "[1]" + P3card[0].name + "\t[2]" +P3card[1].name + "\t[3]" + P3card[2].name + "\n[4]" + P3card[3].name + "[5]\t" + P3card[4].name + "\t[6]" + P3card[5].name + "\n[7]" + P3card[6].name +"\t[8]" + P3card[7].name +"\t[9]" + P3card[8].name +"\n[10]" + P3card[9].name +"[11]\t" + P3card[10].name +"\t[12]" + P3card[11].name + "\t[13]" +P3card[12].name;          
      //String hand4 = "[1]" + P4card[0].name + "\t[2]" +P4card[1].name + "\t[3]" + P4card[2].name + "\n[4]" + P4card[3].name + "[5]\t" + P4card[4].name + "\t[6]" + P4card[5].name + "\n[7]" + P4card[6].name +"\t[8]" + P4card[7].name +"\t[9]" + P4card[8].name +"\n[10]" + P4card[9].name +"[11]\t" + P4card[10].name +"\t[12]" + P4card[11].name + "\t[13]" +P4card[12].name; 
     int playUp=0, Tsuit=3;
     int points=0;
     int score[] ={0,0,0,0};
     int hscore[] ={0,0,0,0};
     boolean heartBreak=false,allowed=true,under100=true;
     ObjCard played[] = new ObjCard[5];

      Scanner in = new Scanner(System.in);
      while(under100){
          deal();
          sort();
          String hand1 = "[1]" + P1card[0].name + "\t[2]" +P1card[1].name + "\t[3]" + P1card[2].name + "\n[4]" + P1card[3].name + "[5]\t" + P1card[4].name + "\t[6]" + P1card[5].name + "\n[7]" + P1card[6].name +"\t[8]" + P1card[7].name +"\t[9]" + P1card[8].name +"\n[10]" + P1card[9].name +"[11]\t" + P1card[10].name +"\t[12]" + P1card[11].name + "\t[13]" +P1card[12].name;
     System.out.println(hand1);
     pass(counter%4);
      sort();
      hand1 = "[1]" + P1card[0].name + "\t[2]" +P1card[1].name + "\t[3]" + P1card[2].name + "\n[4]" + P1card[3].name + "[5]\t" + P1card[4].name + "\t[6]" + P1card[5].name + "\n[7]" + P1card[6].name +"\t[8]" + P1card[7].name +"\t[9]" + P1card[8].name +"\n[10]" + P1card[9].name +"[11]\t" + P1card[10].name +"\t[12]" + P1card[11].name + "\t[13]" +P1card[12].name;
      //System.out.println(hand1);
      // hand4 = "[1]" + P4card[0].name + "\t[2]" +P4card[1].name + "\t[3]" + P4card[2].name + "\n[4]" + P4card[3].name + "[5]\t" + P4card[4].name + "\t[6]" + P4card[5].name + "\n[7]" + P4card[6].name +"\t[8]" + P4card[7].name +"\t[9]" + P4card[8].name +"\n[10]" + P4card[9].name +"[11]\t" + P4card[10].name +"\t[12]" + P4card[11].name + "\t[13]" +P4card[12].name; 
       for(int x=0;x<5;x++)
        played[x]=card[52];
     for(int x=0;x<13;x++){
      if(P1card[x].equals(card[26]))
      playUp =1;}
      for(int x=0;x<13;x++){
      if(P2card[x].equals(card[26]))
      playUp =2;}
      for(int x=0;x<13;x++){
      if(P3card[x].equals(card[26]))
      playUp =3;}
      for(int x=0;x<13;x++){
      if(P4card[x].equals(card[26]))
      playUp =4;}
     
     for(int hands=0;hands<13;hands++){
      hand1 = "[1]" + P1card[0].name + "\t[2]" +P1card[1].name + "\t[3]" + P1card[2].name + "\n[4]" + P1card[3].name + "[5]\t" + P1card[4].name + "\t[6]" + P1card[5].name + "\n[7]" + P1card[6].name +"\t[8]" + P1card[7].name +"\t[9]" + P1card[8].name +"\n[10]" + P1card[9].name +"[11]\t" + P1card[10].name +"\t[12]" + P1card[11].name + "\t[13]" +P1card[12].name;
      System.out.println(hand1);
      int num=0,num2=0,num3=0,num4=0;
      //System.out.println(heartBreak);
      //num = in.nextInt()-1;
      //num2=art.play(P2card,played,Tsuit,2,heartBreak,hands)
      switch(playUp){
        case 1: 
        if(hands== 0){
            num=art.findCard(P1card,3,2);
         played[1]=P1card[num];
         P1card[art.findCard(P1card,3,2)]=card[52];
        //System.out.println("b");
        }
         else
         do{
                   num = in.nextInt()-1;
             played[1]=P1card[num];
             allowed=true;
             if(!heartBreak&&played[1].suit==1)
              allowed=false;
             }while(played[1]==card[52]||!allowed);
         Tsuit=played[1].suit;
         num2=art.play(P2card,played,Tsuit,2,heartBreak,hands);
         played[2]= P2card[num2];
         num3=art.play(P3card,played,Tsuit,3,heartBreak,hands);
         played[3]= P3card[num3];
         num4=art.play(P4card,played,Tsuit,4,heartBreak,hands);
         played[4]= P4card[num4];
        
         System.out.println(played[1].name+"\n"+played[2].name+"\n"+played[3].name+"\n"+played[4].name+"\n");
         break;
         case 2:
          num2=art.play(P2card,played,Tsuit,1,heartBreak,hands);
         played[2]= P2card[num2];
         Tsuit=played[2].suit;
        num3=art.play(P3card,played,Tsuit,2,heartBreak,hands);
         played[3]= P3card[num3];
         num4=art.play(P4card,played,Tsuit,3,heartBreak,hands);
         played[4]= P4card[num4];
        System.out.println(played[2].name+"\n"+played[3].name+"\n"+played[4].name+"\n");
        do{
               num = in.nextInt()-1;
             played[1]=P1card[num];
             allowed=true;
            if(played[1].suit!=Tsuit&&art.hasSuit(P1card,Tsuit))
            allowed=false;
            }while(played[1]==card[52]||!allowed);
            System.out.println(played[1].name);
            break;
            case 3:     
        num3=art.play(P3card,played,Tsuit,1,heartBreak,hands);
         played[3]= P3card[num3];
        Tsuit=played[3].suit;
        num4=art.play(P4card,played,Tsuit,2,heartBreak,hands);
         played[4]= P4card[num4];
        System.out.println(played[3].name+"\n"+played[4].name);
        do{
            num = in.nextInt()-1;
             played[1]=P1card[num];
             allowed=true;
            if(played[1].suit!=Tsuit&&art.hasSuit(P1card,Tsuit))
            allowed=false;
            }while(played[1]==card[52]||!allowed);
          num2=art.play(P2card,played,Tsuit,4,heartBreak,hands);
          played[2]= P2card[num2];
            System.out.println(played[1].name +"\n"+played[2].name);
            break;
            case 4:
         num4=art.play(P4card,played,Tsuit,1,heartBreak,hands);
         played[4]= P4card[num4];
        Tsuit=played[4].suit;
        System.out.println(played[4].name);
        do{
            num = in.nextInt()-1;
             played[1]=P1card[num];
             allowed=true;
            if(played[1].suit!=Tsuit&&art.hasSuit(P1card,Tsuit))
            allowed=false;
            }while(!allowed); 
        num2=art.play(P2card,played,Tsuit,3,heartBreak,hands);
         played[2]= P2card[num2];
         num3=art.play(P3card,played,Tsuit,4,heartBreak,hands);
         played[3]= P3card[num3];
        System.out.println(played[1].name+"\n"+played[2].name+"\n"+played[3].name);
            break;
           
        } 
       P1card[num]=card[52];
       P2card[num2]=card[52];
       P3card[num3]=card[52];
       P4card[num4]=card[52];
        int high=0;
      for(int x=1;x<5;x++){
       if(played[x].value>high&&played[x].suit==Tsuit){
        high=played[x].value;
        playUp=x;
        }
        if(played[x].suit==1){
         points++;
        }
         if(played[x]==card[49]){
          points+=13;
        }
          if(played[x]==card[22]){
          points-=10;
        }
          if(played[x].suit==1)
          heartBreak=true;
        }
        hscore[playUp-1]+=points;
        for(int x:hscore)
         System.out.println(x);
         points=0;
     }
     boolean allZeros=true;
     for(int x=0;x<4;x++){
      if(hscore[x]!=0||hscore[x]!=16)
       allZeros=false;
      if(hscore[x]==26){
        hscore[x]-=52;
        hscore[0]+=26;
        hscore[1]+=26;
        hscore[2]+=26;
        hscore[3]+=26;
        }
    }
     for(int x=0;x<4;x++){
         if(allZeros&&hscore[x]==16){
            hscore[x]-=52;
            hscore[0]+=26;
            hscore[1]+=26;
            hscore[2]+=26;
            hscore[3]+=26;
            }
         
      score[x]+=hscore[x];
      hscore[x]=0;
    }
      
     for(int x:score)
          if(x>=50)
          under100=false;
           for(int x: score)
            System.out.println(x);
            heartBreak=false;
    }
     //hand3 = "[1]" + P3card[0].name + "\t[2]" +P3card[1].name + "\t[3]" + P3card[2].name + "\n[4]" + P3card[3].name + "[5]\t" + P3card[4].name + "\t[6]" + P3card[5].name + "\n[7]" + P3card[6].name +"\t[8]" + P3card[7].name +"\t[9]" + P3card[8].name +"\n[10]" + P3card[9].name +"[11]\t" + P3card[10].name +"\t[12]" + P3card[11].name + "\t[13]" +P3card[12].name;          
      // System.out.println(hand3);
   }
    public static void deal(){
        ObjCard[] card2 = new ObjCard [54];
        int num2;
     for(int x = 0;x < 52; x++){
          double num = Math.random()*53;
       num2 = (int)Math.floor(num);
       if(card[num2].used == false){
        card2[x] = card[num2];
        card[num2].used = true;
        }
        else
        x--;
        }
        for(int x = 0;x < 52; x++){
        if(x<13)
         P1card[x]=card2[x];
        else if(x<26)
         P2card[x-13]=card2[x];
        else if(x<39)
         P3card[x-26]=card2[x];
        else
         P4card[x-39]=card2[x];
        }
        for(int x=0;x<52;x++)
         card[x].used=false;
    }
    public static void sort(){
        ObjCard[] P1card2 = new ObjCard [14];
      ObjCard[] P2card2 = new ObjCard [14];
      ObjCard[] P3card2 = new ObjCard [14];
      ObjCard[] P4card2 = new ObjCard [14];
      
      for(int x=0; x<13;x++){
       P1card2[x] = P1card[x];}
      for(int x=0; x<13;x++){
       P2card2[x] = P2card[x];
      }
       for(int x=0; x<13;x++){
        P3card2[x] = P3card[x];
      }
      
        for(int x=0; x<13;x++){
         P4card2[x] = P4card[x];}
        
     for(int x=0; x<13;x++){
            for(int y=0; y<13; y++){
                if(P1card2[x].suit>P1card2[y].suit)
                 P1card2[x].order++;
                 else if(P1card2[x].suit==P1card2[y].suit && P1card2[x].value>P1card2[y].value)
                 P1card2[x].order++;
            }
        
        for(int y=0; y<13; y++){
                if(P2card2[x].suit>P2card2[y].suit)
                 P2card2[x].order++;
                 else if(P2card2[x].suit==P2card2[y].suit && P2card2[x].value>P2card2[y].value)
                 P2card2[x].order++;
                
            }
       
        for(int y=0; y<13; y++){
                if(P3card2[x].suit>P3card2[y].suit)
                 P3card2[x].order++;
                 else if(P3card2[x].suit==P3card2[y].suit && P3card2[x].value>P3card2[y].value)
                 P3card2[x].order++;
                
            }
       
        for(int y=0; y<13; y++){
                if(P4card2[x].suit>P4card2[y].suit)
                 P4card2[x].order++;
                 else if(P4card2[x].suit==P4card2[y].suit && P4card2[x].value>P4card2[y].value)
                 P4card2[x].order++;
                
            }
        
      } 
      for(int z=0; z<13;z++){
            P1card[P1card2[z].order] = P1card2[z]; 
            P2card[P2card2[z].order] = P2card2[z]; 
            P3card[P3card2[z].order] = P3card2[z];           
            P4card[P4card2[z].order] = P4card2[z]; 
        }
     for(int x=0;x<52;x++)
      card[x].order=0;
    }
    public static void pass(int num){
     if(num!=0){
        //String hand1 = "[1]" + P1card[0].name + "\t[2]" +P1card[1].name + "\t[3]" + P1card[2].name + "\n[4]" + P1card[3].name + "[5]\t" + P1card[4].name + "\t[6]" + P1card[5].name + "\n[7]" + P1card[6].name +"\t[8]" + P1card[7].name +"\t[9]" + P1card[8].name +"\n[10]" + P1card[9].name +"[11]\t" + P1card[10].name +"\t[12]" + P1card[11].name + "\t[13]" +P1card[12].name;
        System.out.println("Which cards would you like to pass");
     Scanner in = new Scanner(System.in);
     int p[][] = new int[4][3];
     ObjCard passedCards[][] = new ObjCard[4][3];
     for(int x=0;x<3;x++){
        p[0][x]=in.nextInt()-1;
        p[1][x]=art.aiPass(P2card);
        p[2][x]=art.aiPass(P3card);
        p[3][x]=art.aiPass(P4card);
         passedCards[0][x]= P1card[p[0][x]];
         passedCards[1][x]=P2card[p[1][x]];
          passedCards[2][x]=P3card[p[2][x]]; 
          passedCards[3][x]=P4card[p[3][x]];
          P2card[p[1][x]]=card[52];
          P3card[p[2][x]]=card[52];
           P4card[p[3][x]]=card[52];
        }
       for(int x=0;x<12;x++){
        if(x<3)
         P1card[p[0][x]]=passedCards[num][x];
         else if(x<6)
         P2card[p[1][x-3]]=passedCards[(num+1)%4][x-3];
         else if(x<9)
         P3card[p[2][x-6]]=passedCards[(num+2)%4][x-6];
         else
         P4card[p[3][x-9]]=passedCards[(num+3)%4][x-9];
        }
      String hand3 = "[1]" + P3card[0].name + "\t[2]" +P3card[1].name + "\t[3]" + P3card[2].name + "\n[4]" + P3card[3].name + "[5]\t" + P3card[4].name + "\t[6]" + P3card[5].name + "\n[7]" + P3card[6].name +"\t[8]" + P3card[7].name +"\t[9]" + P3card[8].name +"\n[10]" + P3card[9].name +"[11]\t" + P3card[10].name +"\t[12]" + P3card[11].name + "\t[13]" +P3card[12].name;          
       //System.out.println(hand3);
   }
 }
 public static void test(){
   
    
    }
}