package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import driverFactory.DriverFactory;

public class SigninPage extends DriverFactory{
    //WebDriver driver=new ChromeDriver();
    boolean isRequired;

    By usernamebtn=By.xpath("//*[@id='id_username']");
    By passwrdbtn=By.xpath("//*[@id='id_password']");
    By loginbtn=By.xpath("//*[@value='Login']");
    By registerbtn=By.xpath("//a[@href='/register']");
    By alert=By.xpath("//div[@class='alert alert-primary']");
    By signoutbtn=By.xpath("//a[@href='/logout']");

    public void SigninPage() {

        PageFactory.initElements(getdriver(), this);
    }

    public void login_page() {
        getdriver().get("https://dsportalapp.herokuapp.com/login");

    }

    public Boolean doLogin(String username, String password) {
        getdriver().findElement(usernamebtn).clear();
        getdriver().findElement(usernamebtn).sendKeys(username);
        getdriver().findElement(passwrdbtn).clear();
        getdriver().findElement(passwrdbtn).sendKeys(password);


        // To check empty fields , we need to check "required" field is on an attribute
        if (username.isBlank()) {
            JavascriptExecutor js_user = (JavascriptExecutor) getdriver();
            isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", usernamebtn);
            return isRequired;
        } else if (password.isBlank()) {
            JavascriptExecutor js_password = (JavascriptExecutor) getdriver();
            isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", passwrdbtn);
            return isRequired;

        }
        return isRequired;
    }

    // input fields empty -click login
    public void login_button() {
        getdriver().findElement(loginbtn).click();

    }

    // login for excel sheet data
    public String click_login() {
        getdriver().findElement(loginbtn).click();
        String res= getdriver().findElement(alert).getText();
        return res;
    }

    public void register_link() {
        getdriver().findElement(registerbtn).click();
    }

    public String register_page() {

        String Title = getdriver().getTitle();
        return Title;
    }
    //
//	public void signout() {
//		getdriver().findElement(signoutbtn).click();
//
//	}
    public void getexcelfilepath() {
        getdriver().get("./src/test/resources/Exceldata/Login.xlsx");
    }
    public void signout()
    {
        By signout_lnk=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
        getdriver().findElement(signout_lnk).click();
    }

}