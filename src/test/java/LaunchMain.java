import org.openqa.selenium.By;
public class LaunchMain {
    public static void main(String[] args) {
        LaunchMethods obj=new LaunchMethods();
        obj.Browsermethods();

        obj.Openurl("https://demo.opencart.com");

        obj.Clickelement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/i[2]"));
        obj.Clickelement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a"));

        obj.Clickenterelements(By.xpath("//*[@id=\"input-firstname\"]"),"Srinivas");
        obj.Clickenterelements(By.xpath("//*[@id=\"input-lastname\"]"),"Reddy");
        obj.Clickenterelements(By.xpath("//*[@id=\"input-email\"]"),"p.sri.rdy@gmail.com");
        obj.Clickenterelements(By.xpath("//*[@id=\"input-password\"]"),"Psrinivas@66");

        obj.Javascriptexecutorclickable(By.xpath("//input[@id='input-newsletter-no']"));
        obj.Javascriptexecutorclickable(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));
        obj.Javascriptexecutorclickable(By.xpath("//*[@id=\"form-register\"]/div/div/button"));

        //obj.Clickelement(By.xpath("//*[@id=\"input-newsletter-no\"]"));
        //obj.Clickelement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));
        //obj.Clickelement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));

    }
}
