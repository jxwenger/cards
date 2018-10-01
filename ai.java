
public class ai
{
    public ai(){
    }
    public int aiPass(ObjCard[] hand){
          
        if(findCard(hand,4,12) !=-1)
         return findCard(hand,4,12);
      if(findCard(hand,4,13) !=-1)
         return findCard(hand,4,13);
         if(findCard(hand,4,14) !=-1)
         return findCard(hand,4,14);
     
     short suitNum=0;
     for(short x=0; x<13; x++){
        if(hand[x].suit == 3){
        suitNum++;
       }
     }
     if(suitNum<4 && hasSuit(hand,3)){
     return findGcard(hand,3);
     }
    suitNum = 0;
     for(short x=0; x<13; x++){
     if(hand[x].suit == 2){
        suitNum++;
     }
     }
     if(suitNum<4 && hasSuit(hand,2) && hand[findGcard(hand,2)].value<11){
      return findGcard(hand,2);
     }
    
     if(hasSuit(hand,1) &&hand[findGcard(hand,1)].value > 6){
      return findGcard(hand,1);
     }
     if(hasSuit(hand,3))
      return findGcard(hand,3);
     return 0;
   }
    public int play(ObjCard[] hand, ObjCard onTable[], int trick, int ord, boolean h, int hnum){
     if(!hasSuit(hand,trick)&&hnum!=0&&ord!=1)
      return findWcard(hand);
      if(hnum==0 && findCard(hand,3,2)!=-1){
      return findCard(hand,3,2);
     }
        if(hnum==0 && hasSuit(hand, trick)){
      return findGcard(hand,3);
     }
     if(ord==1){
        if(hasSuit(hand,4)&&hand[findGcard(hand,4)].value<12)
         return findGcard(hand,4);
         if(hasSuit(hand,2)&&hand[findGcard(hand,2)].value<11)
         return findLcard(hand,2);
         if(h&&under8(hand,1)>1)
          return findLcard(hand,1);
         if(hasSuit(hand,3))
         return findLcard(hand,3);
         if(h&&hasSuit(hand,1))
         return findLcard(hand,1);
         if(hasSuit(hand,2))
          return findLcard(hand,2);
          if(hasSuit(hand,4))
           return findLcard(hand,4);
          return findLcard(hand,1);
        }
     if(Cplayed(onTable,2,11)&&hand[findGcard(hand,trick)].value>onTable[findGcard(onTable,trick)].value){
        return findGcard(hand,trick);
        }
        if(ord==4){
        if(findCard(hand,4,12)!=-1&&findGcard(hand,4)>12&&findCard(onTable,4,12)!=-1&&trick==4)
         return findGcard(hand,4);
         if(trick==2 && findCard(hand,2,11)!=-1&&onTable[findGcard(onTable,2)].value<11)
         return findCard(hand,2,11);
        }
        if(hasSuit(hand,trick)){
        return findGPcard(hand,onTable,trick,ord);
        }
        if(hasSuit(hand,4)&&hand[findGcard(hand,4)].value!=12)
         return findGcard(hand,4);
       if(hasSuit(hand,2))
        return findGcard(hand,2);
        return findLcard(hand,4);
    }
    
     private int findGcard(ObjCard[] hand, int s){
      // System.out.println(hasSuit(hand,s));
     for(int x=0; x<hand.length-1; x++){
        // System.out.println(hand[x+1].suit);
        if(hand[x].suit == s && hand[x+1].suit !=s){
         return x;} 
     }
     if(hasSuit(hand,s))
      return hand.length-1;
     // System.out.println("findGcard");
      return -1;
    }
    private int findLcard(ObjCard[] hand, int s){
       // System.out.println(hasSuit(hand,s));
     for(int x=hand.length-1; x>0; x--){
        if(hand[x].suit == s && hand[x-1].suit !=s){
         return x;} 
      }
      //System.out.println("findLcard");
     return 0;
    }
    public int findCard(ObjCard[] hand, int s, int v){
     for(short x=0; x<hand.length-1; x++){
        if(hand[x].suit == s && hand[x].value == v){
         return x;
        }
        }
        //System.out.println("findCard");
     return -1;
    }
    public boolean hasSuit(ObjCard[] hand, int trick){
    for(int x=0;x<13;x++)
    if(hand[x].suit == trick)
     return true;
     return false;
   }
   private int findWcard(ObjCard[] hand){
     if(findCard(hand,4,12) !=-1)
         return findCard(hand,4,12);
      if(findCard(hand,4,13) !=-1)
         return findCard(hand,4,13);
      if(findCard(hand,4,14) !=-1)
          return findCard(hand,4,14);
      if(hasSuit(hand,1)&&hand[findGcard(hand,1)].value > 6){
       return findGcard(hand,1);
      }
      if(hasSuit(hand,3))
       return findGcard(hand,3);
       if(hasSuit(hand,4))
       return findGcard(hand,4);
        if(suitnum(2,hand)<4 && hasSuit(hand,2) && hand[findGcard(hand,2)].value<11){
      return findGcard(hand,2);
     }
     if(hasSuit(hand,1)){
       return findGcard(hand,1);
      }
       if(hasSuit(hand,2)){
      return findGcard(hand,2);
     }
     //System.out.println("findWcard");
     return -1;
    }
    public boolean Cplayed(ObjCard[] played,int s, int v){
        //System.out.println(played[0].value);
     for(int x=0;x<played.length;x++)
     if(played[x].suit==s && played[x].value == v)
      return true;
     return false;
    }
    private int suitnum(int suit, ObjCard[] hand){
        int suitNum=0;
     for(short x=0; x<13; x++){
        if(hand[x].suit == suit){
        suitNum++;
       }
     }
     return suitNum;
    }
    private int under8(ObjCard hand[], int suit){
     int num=0;
     for(ObjCard x: hand)
      if (x.value<8 && x.suit==suit)
      num++;
      return num;
    }
   
     private int findGPcard(ObjCard hand[],ObjCard onTable[], int trick,int ord){
         int ideal=-1;
        for(int x=0; x<13;x++){
        if(hand[x].value<onTable[findGcard(onTable,trick)].value&&hand[x].suit==trick)
          ideal=x;
        }
        if(ideal!=-1)
         return ideal;
         if(ord==4)
          return findGcard(hand,trick);
            //  System.out.println("findGPcard");   
              return findLcard(hand,trick);

 }
}