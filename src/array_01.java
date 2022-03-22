import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class array_01 {
	
	static int[] in = {1, 1, 2, 3, 4};
	static char[] st = {'a', 'b', 'c', 'd', 'e'};
	
	public static void map_print_int() {
		Map<Integer, Object> map1 = new HashMap<Integer, Object>();
		map1.put(1, in[0]);
		map1.put(2, in[1]);
		map1.put(3, in[2]);
		map1.put(4, in[3]);
		map1.put(5, in[4]);
		
		Set<Integer> kset = map1.keySet();
		System.out.println("정수형 배열 출력");
		for(Integer k : kset) {
			System.out.println(k + " : " + map1.get(k));
		}
		
	}
	
	public static void map_print_char() {
		Map<Integer, Object> map2 = new HashMap<Integer, Object>();
		map2.put(1, st[0]);
		map2.put(2, st[1]);
		map2.put(3, st[2]);
		map2.put(4, st[3]);
		map2.put(5, st[4]);
		
		Set<Integer> kset = map2.keySet();
		System.out.println("문자형 배열 출력");
		for(Integer k : kset) {
			System.out.println(k + " : " + map2.get(k));
		}
	}

	public static void main(String[] args) {
		
		/*
		  map을 사용하여 배열 출력 
		 */
		
		map_print_int();
		map_print_char();
		
	}
	
}
