package storeCreation;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		storeMaker store = new storeMaker();
		
		System.out.println("Add aStore /n");
		System.out.println("please enter a store name");
		String storeName = sc.next();
		store.setStoreName(storeName);
		
		System.out.print("Add the store district");
		String district = sc.next();
		store.setDistrict(district);
	}

}
