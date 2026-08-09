package prog_practice;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	
	@BeforeTest
	public void a() {
		
		System.out.println("Before test annotation.");
		
	}
	@AfterTest
	public void aTest() {
		
		System.out.println("After test annotation.");
		
	}
	@Test
	public void c() {
		
		System.out.println("test c");
				
	}
	
	@Test
	public void b() {
		
		System.out.println("test b");
				
	}
	
	@BeforeMethod
	public void d() {
		
		System.out.println("Before method annotation.");
				
	}
	
	@BeforeClass
	public void bclass() {
		
		System.out.println("Before class annotation.");
				
	}
	@BeforeSuite
	public void bsuite() {
		
		System.out.println("Before suite annotation.");
				
	}

}
