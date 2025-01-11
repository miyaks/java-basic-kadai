package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	public void tango() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	
	public void search(String[] word) {
		for (int i = 0; i< word.length; i++) {
			
			if(dictionary.get(word[i]) == null ) {
				System.out.println(word[i] + "は存在しません");
			}else {
				System.out.println(word[i] + "の意味は" + dictionary.get(word[i]) + "です");
			}
		}
	}
}
