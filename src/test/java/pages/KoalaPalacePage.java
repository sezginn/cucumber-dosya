package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class KoalaPalacePage {
    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }
    @FindBy ( id = "UserName")
    public WebElement userNameKutusu;
    @FindBy ( id = "Password" )
    public WebElement passwordKutusu;
    @FindBy ( xpath = "//button[.='Log in']")
    public WebElement girisButonu;
    @FindBy ( id = "Code")
    public WebElement hotelCreateCodeKutusu;
    @FindBy ( id = "Name")
    public WebElement hotelCreateNameKutusu;
    @FindBy ( id = "Address")
    public WebElement hotelCreateAddressKutusu;
    @FindBy ( id = "Phone")
    public WebElement hotelCreatePhoneKutusu;
    @FindBy (id = "Email")
    public WebElement hotelCreateEmailKutusu;
    @FindBy (id = "IDGroup")
    public WebElement hotelCreateIDGroupDropdown;
    @FindBy (id = "btnSubmit")
    public WebElement hotelCreateSaveButonu;
    @FindBy (className = "bootbox-body")
    public WebElement hotelCreateBasariliYazisi;
    @FindBy ( id = "IDHotel" )
    public WebElement hotelRoomCreateIDHotelDropdown ;
    @FindBy ( id = "Code" )
    public WebElement hotelRoomCreateCodeKutusu ;
    @FindBy ( id = "Name" )
    public WebElement hotelRoomCreateNameKutusu ;
    @FindBy ( id = "Location" )
    public WebElement hotelRoomCreateLocationKutusu ;
    @FindBy ( xpath = "//*[@id='cke_1_contents']/textarea")
    public WebElement hotelRoomCreateDescriptionKutusu ;
    @FindBy ( id = "Price" )
    public WebElement hotelRoomCreatePriceKutusu ;
    @FindBy ( xpath = "//*[@data-id='500']/a")
    public WebElement hotelRoomCreatePrice500 ;
    @FindBy ( id = "IDGroupRoomType" )
    public WebElement hotelRoomCreateIDGroupRoomTypeDropDown;
    @FindBy ( id = "MaxAdultCount" )
    public WebElement hotelRoomCreateMaxAdultKutusu;
    @FindBy ( id = "MaxChildCount" )
    public WebElement hotelRoomCreateMaxChildKutusu;
    @FindBy ( id = "btnSubmit" )
    public WebElement hotelRoomCreateSaveButonu ;

    @FindBy ( className = "bootbox-body")
    public WebElement hotelRoomCreateBasariliYazisi;
}
