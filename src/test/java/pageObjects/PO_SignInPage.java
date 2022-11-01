package pageObjects;
/**
 * @author Marcos Alcazar
 *
 * @Description
 * This Class represents the objects in Liverpool Store Home page.
 *
 */
public class PO_SignInPage {
    //Liverpool Sign In Main Page
    public static final String signInLink = "//span[text() = 'Iniciar sesión']";
    public static final String createAccountLink = "//a[text() = 'Crear cuenta']";
    public static final String emailTextField = "//input[@id = 'email']";
    public static final String passwordTextField = "//input[@id = 'password']";
    public static final String createAccountBtn = "//button[text() = 'Crear cuenta']";
    public static final String firstNameTextField = "//input[@id = 'input-user__name']";
    public static final String middleNameTextField = "//input[@id = 'input-user__apaterno']";
    public static final String lastNameTextField = "//input[@id = 'input-user__amaterno']";
    public static final String dayDropdown = "//select[@id = 'daySelectorLabel']";
    public static final String daySelected = "//option[@id = '7']";
    public static final String monthDropdown = "//select[@id = 'monthSelectorLabel']";
    public static final String monthSelected = "//option[@id = '10']";
    public static final String yearDropdown = "//select[@id = 'yearSelectorLabel']";
    public static final String yearSelected = "//option[@id = '35']";
    public static final String genderOption = "//input[@id = 'male']";
    public static final String phoneTextField = "//input[@id = 'phone']";
    public static final String continueBtn = "//button[text() = 'Continuar']";


}
