package Day10_ternary_SwitchCase;

public class C12_SMCharAt {

	public static void main(String[] args) {
	// CharAt (İstenenIndex) methodu istediğimiz index' deki karakteri bize verir.
		
		String kurs="Techproeducation";
		
		System.out.println(kurs.charAt(5)); // r
		
		// index 0'dan başlar
		
		System.out.println(kurs.charAt(0)); // bize ilk harfi verir.
	
		System.out.println(kurs.charAt(15)); // son harfi verir
	
		System.out.println(kurs.charAt(16)); // hata verir
	}

}
