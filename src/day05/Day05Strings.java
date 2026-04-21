import java.util.Scanner;
public class Day05Strings{

	public static int stringToLength (String Len){
		int Length;
		Length = Len.length();
		return Length;
	}
	public static void stringCompare (String a, String b){
		//Case Senstive Comparision
		boolean isExactMatch = a.equals(b);
		//Case In-senstive Comparision
		boolean isGeneralMatch = a.equalsIgnoreCase(b);
		System.out.println("Exact Match (Case-Sensitive): " + isExactMatch);
        System.out.println("General Match (Case-Insensitive): " + isGeneralMatch);
	}
	public static String reverseString (String reverse){
		String rev = "";
		for (int i = reverse.length()-1;i>=0;i--){
			rev += reverse.charAt(i);
		}
		return rev;
	}
	public static void stringPalindrome (String Original){
		String revOriginal = "";
		for (int i = Original.length()-1;i>=0;i--){
			revOriginal +=Original.charAt(i);
		}
		if (Original.toLowerCase().equals(revOriginal.toLowerCase())){
			System.out.println(Original + " is an Palindrome String!");
		}
		else{
			System.out.println(Original + " is Not an Palindrome String!");
		}
	}
	public static void vowelsConsonants (String vowCon){
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int spaces = 0;
		vowCon = vowCon.toLowerCase();
		for (int i = 0;i< vowCon.length();i++){
			char ch = vowCon.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				++vowels;
			}
			else if (ch >= 'a'&& ch <= 'z'){
				++consonants;
			}
			else if (ch >= '0' && ch <= '9'){
				++digits;
			}
			else if (ch == ' '){
				++spaces;
			}
		}
		System.out.println("Vowels - " + vowels);
		System.out.println("Consonants - " + consonants);
		System.out.println("Digits - " + digits);
		System.out.println("Spaces - " + spaces);
	}
	public static int wordCount(String Sentence){
		Sentence = Sentence.trim();
		if (Sentence.isEmpty()){
			return 0;
		}
		else{
			String [] words = Sentence.split("\\s+");
			return words.length;
			
		}
		
	}
	// Took help from internet for this code..
	public static void charFrequency (String Freq){
		int []charfrew = new int [26];
		Freq = Freq.toLowerCase();
		for (int i=0;i<Freq.length();i++){
			char ch = Freq.charAt(i);
			if (ch >= 'a' && ch <='z'){
				charfrew[ch - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++) {
            if (charfrew[i] > 0) {
				char letter = (char) ('a' + i);
				System.out.println(letter + " -> " + charfrew[i]);
            }
        }
		
	}
	
	
	
	public static void main (String[] args){
		//Creating Scanner Object
		Scanner sc = new Scanner (System.in);
		
		//Creating Object to Call methods
		Day05Strings Dy05 = new Day05Strings();
		
		//StringToLength
		System.out.println("Enter the Statement to Find length of it:");
		String Len = sc.nextLine();
		System.out.print("Length of the Statment is - " + stringToLength(Len));
		System.out.println();
		
		//stringCompare
		System.out.println("Enter two String to Compare it:");
		String a = sc.nextLine();
		String b = sc.nextLine();
		stringCompare(a,b);
		
		//reverseString
		System.out.println("Enter a string to reverse:");
		String reverse = sc.nextLine();
		System.out.println("Reversed String : " + reverseString(reverse));
		
		//Palindrome check (string)
		System.out.println("Enter a string to check palindrome:");
		String Original = sc.nextLine();
		stringPalindrome(Original);
		
		//Count vowels/consonants
		System.out.println("Enter a string to check Vowels, Consonants, Digits & spaces:");
		String vowCon = sc.nextLine();
		vowelsConsonants(vowCon);
		
		// wordCount
		System.out.println("Enter an Sentence to Count Words:");
		String Sentence = sc.nextLine();
		System.out.println("Word Count " + wordCount(Sentence));
		
		//Character Frequency
		System.out.println("Enter an Sentence to Count Character:");
		String Freq = sc.nextLine();
		charFrequency(Freq);
		
		//Closing the Scanner Object
		sc.close();
	}
}

/*
Take input string, print length
Compare two strings using .equals() and .equalsIgnoreCase()
Reverse a string (loop)
Palindrome check (string)
Count vowels/consonants
Count words in a sentence (use split("\\s+"))
Character frequency (a–z) for a string (use array of size 26)
*/