package Day39_OverridingKuralları_Polymorphism;

public class C01 {

	public static void staticMethod() {
		System.out.println("Parent class static method çalıştı");
	}
	
	private void privateMethod() {
		System.out.println("Parent class private method");
	}
	
	// Final demek bu son hali bir daha değiştirilemez
	//dolayısıyla final olarak tanimlanan bir method
	// override edilemez
	public final void finalMethod() {
		System.out.println("Final class private method");
	}

	 // child class ile parent class ayni package'da olduklarından




}
