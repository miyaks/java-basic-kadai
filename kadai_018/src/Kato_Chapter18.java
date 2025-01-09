
abstract public class Kato_Chapter18 {
	String familyName;
	String givenName;
	String address;
	
	public void commonIntroduce() {
		familyName = "加藤";
		address = "東京都中野区〇×";
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		eachIntroduce();
	}
	

}
