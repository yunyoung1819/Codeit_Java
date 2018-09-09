package example;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// ArrayList에는 원소들이 넣은 순서대로 저장됨
		ArrayList<Pokemon> arrayList = new ArrayList<>();
		
		arrayList.add(new Pokemon("이상해씨"));
		arrayList.add(new Pokemon("이상해풀"));
		arrayList.add(new Pokemon("이상해꽃"));
		
		// 인덱스로 찾아서 사용할 수 있음
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		
		// HashMap 
		// Key -> Value
		// HashMap 은 Key 하나당 원소 하나만 저장할 수 있다
		// 같은 키에 여러 원소를 저장하게 되면 마지막에 저장한 원소로 덮어지게 된다
		HashMap<String, Pokemon> pokedex = new HashMap<>();
		// 새로운 원소를 저장할 때 add 대신 put 메소드를 사용함
		pokedex.put("피카츄", new Pokemon("피카츄"));
		pokedex.put("피카츄", new Pokemon("피츄"));
		pokedex.put("이상해씨", new Pokemon("이상해씨"));
		pokedex.put("이상해풀", new Pokemon("이상해풀"));
		pokedex.put("이상해꽃", new Pokemon("이상해꽃"));
		
		pokedex.remove("이상해풀");
		Pokemon poke003 = pokedex.get("이상해꽃");
		
		System.out.println(pokedex.get("피카츄"));
		
		// keySet : HashMap의 key들이 담겨 있는 리스트를 받음
		for (String key : pokedex.keySet()) {
			System.out.println(pokedex.get(key));
		}
		
	}
}
