/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookScrapper;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author david
 */
public class FacebookScrapper {

    /**
     * @param args the command line arguments
     */
   
   static String urlsFb[] = {"file:///home/david/Documents/facebook%20links/(1)%20BUKAVUjuju%20BIBONDE.html",
        "file:///home/david/Documents/facebook%20links/(1)%20Kivu%20chfgddom%C3%A9die.html",
        "file:///home/david/Documents/facebook%20links/(1)%20Kivu%20comhjhugu%C3%A9die.html",
        "file:///home/david/Documents/facebook%20links/(1)%20Kivu%20cugyfyom%C3%A9die.html",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDE.html",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDE.vewqhtml",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDE11.html",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDEhgy.html",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDEihih.html",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDErrrrrr.html",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDEyyy.html",
        "file:///home/david/Documents/facebook%20links/BUKAVU%20BIBONDEyyyui.html",
        "file:///home/david/Documents/facebook%20links/KINSHASA-MAKAMBO.COM.78777html",
        "file:///home/david/Documents/facebook%20links/Kivu%20com%C3%A9die.html","file:///home/david/Documents/facebook%20links/Kivugrt%20com%C3%A9die.html","file:///home/david/Documents/facebook%20links/Kivu%20hycom%C3%A9die.html","file:///home/david/Documents/facebook%20links/Nouveau%20Groupe%20sur%20Whatsapp%20lessez%20ton%20num%C3%A9ro...%20-%20Bon%20Homme%20Kambale%20Rayana_final.html","file:///home/david/Documents/facebook%20links/PARLONS-EN.html","file:///home/david/Documents/facebook%20links/PARLONS-ENee.html","file:///home/david/Documents/facebook%20links/PARLONS-ENrrr.html","file:///home/david/Documents/facebook%20links/PARLONS-ENtttt.html","file:///home/david/Documents/facebook%20links/PARLONS-ENygsa.html","file:///home/david/Documents/facebook%20links/V%C3%A9randa%20Mutsanga%20en%20R%C3%A9volution.html"};
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        WebDriver driver = new FirefoxDriver();
        int j = 0 ;
        for (int i = 0; i < urlsFb.length; i++) {
            
     driver.get(urlsFb[i]);
       // driver.findElement(By.id("lst-ib")).sendKeys("Kongosms");
      //  driver.findElement(By.linkText("Google Search")).click();
      
     List<WebElement> d;
         d = driver.findElements(By.className("UFICommentActorAndBody"));
         for (WebElement webElement : d) {
             String name = webElement.findElement(By.className("UFICommentActorName")).getText();
             String number = webElement.findElement(By.className("UFICommentBody")).getText();
             String bioLink = webElement.findElement(By.className("UFICommentActorName")).getAttribute("href");
            // String commentTime = webElement.findElement(By.className("livetimestamp"));
            // String s = webElement.getText();
              System.out.println(bioLink+" : ");
//            
        }

        j= j + d.size();
        }
        System.out.println(String.valueOf(j));
         
      
      
        Thread.sleep(5000);
        driver.quit();
        
    }
    public static void mobilePhoneRegex(String commenter){
        
    }
    
}
