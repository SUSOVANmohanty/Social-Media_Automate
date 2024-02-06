package Facebook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FB {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		//Hit the url and login into fb
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohantysusovan01@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("bontyp1");
		Thread.sleep(1000);             
		driver.findElement(By.name("login")).click();
		Thread.sleep(12000);
		//using robot cls for cancel the chrome pop up
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//using action cls for hover the moue 
		driver.findElement(By.xpath("//a[@aria-label='Home']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[contains(text(),\"What's on your mind, Susovan?\")]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("p[class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']")).sendKeys("456");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("div[class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']")).click();
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor)driver;  //type cast of javascriptExcecutor
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,130)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='xq8finb x16n37ib x1fqkajt x1aj7aux x1axty5n x1uuop16']//span[contains(text(),'Like')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='xq8finb x16n37ib x1fqkajt x1aj7aux x1axty5n x1uuop16']//div[@aria-label='Leave a comment']//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 x1r8uery x1iyjqo2 xs83m0k xeuugli xl56j7k x6s0dn4 xozqiw3 x1q0g3np xn6708d x1ye3gou xexx8yu xcud41i x139jcc6 x4cne27 xifccgj xn3w4p2 xuxw1ft']//div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("p[class='xdj266r x11i5rnm xat24cr x1mh8g0r']")).sendKeys("nice");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		je.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Swastik Pati");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("li[id='TYPEAHEAD_PEOPLE_ENTITIES:swastik pati'] span:nth-child(4)")).click();
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(0,130)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'][normalize-space()='Add friend'])[5]")).click();
		Thread.sleep(2000);
		
		String addfriend=driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'][normalize-space()='Add friend'])[5]")).getText();
		System.out.println(addfriend);
		String expected="Cancel Request";
		if(addfriend!=expected)
		{
			System.out.println("Friend request has been sent succefully");
		}else {
			System.out.println("Friend request not sent");
		}
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		

	}

}
