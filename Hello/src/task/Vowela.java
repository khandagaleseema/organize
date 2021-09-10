package task;

public class Vowela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[] = { 'a', 'e', 'i', 'o', 'b', '$', '5' };
		for (int i = 0; i < c.length; i++) {

			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				System.out.println("Vowels are: " + c[i]);
			}

			else
				System.out.println("Consonant are: " + c[i]);
		}
		Vowela ob = new Vowela();
		ob.occurenceofVowels();
		ob.reverse();

	}
	
	public void reverse() {
		char c[] = { 'a', 'e', 'i', 'o', 'b', '$', '5' };
		for (int i = c.length-1; i>0; i--) {

			//if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				System.out.println("Vowels are: " + c[i]);
			//}

			//else
			//	System.out.println("Consonant are: " + c[i]);
		}
	}

	public void occurenceofVowels() {
		char ch[] = new char[7];
		ch[0] = 'b';
		ch[1] = 'a';
		ch[2] = 'e';
		ch[3] = 'w';
		ch[4] = 'u';
		ch[5] = 'c';
		ch[6] = 'a';
		int a = 0;
		char c = 'a';
		for (int j = 0; j < ch.length; j++) {
			// if (ch[j]=='a' || ch[j]=='e' ||ch[j]=='i'||ch[j]=='o'||ch[j]=='u') {

			// System.out.println(ch[j]);
			// if(Arrays.equals(ch, c))
			if (ch[j] == c) {
				a++;

			}

			// }
		}
		System.out.println("Occurence of ais" + a);
	}
	
	
	
}
