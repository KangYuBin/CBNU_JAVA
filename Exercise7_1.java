class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		 char [] cards= {1,3,8,2,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
	}
}
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public String toString() {
		return num+(isKwang ? "K":"");
	}
}
public class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck=new SutdaDeck();
		
		for(int i=0;i<deck.cards.length;i++)
			System.out.println(deck.cards[i]+",");
	}
}
