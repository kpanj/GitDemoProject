package testPackage;

public class GitDemo1 {

	public static void main(String[] args) {
		String name[] = new String[5];
		name[0] = "Iron man";
		name[1] = "Captain America";
		name[3] = "Thor";
		name[4] = "Hulk";
		
		for(String s : name) {
			System.out.println(s);
		}
		System.out.println("=====================");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("=====================");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
	}

}
