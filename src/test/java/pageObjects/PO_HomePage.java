package pageObjects;
/**
 * @author Marcos Alcazar
 *
 * @Description
 * This Class represents the objects in Liverpool Store Home page.
 *
 */
public class PO_HomePage {
    //Liverpool Store Main Page
    public static final String searchBar = "//input[@label = 'Buscar ...']";
    public static final String searchBtn = "//i[@class = 'icon-zoom']";
    public static final String articleFound = "//li[@class = 'm-product__card card-masonry a']";
    public static final String noArticleFound = "//p[@class = 'o-nullproduct-title-query']";
    public static final String searchBrandFilter = "//input[@id = 'search-filter-brands']";
    public static final String selectedBrand = "//input[@id = 'brand-SAMSUNG']";
    public static final String searchSizeFilter = "//input[@id = 'variants.normalizedSize-55 pulgadas']";
    public static final String minPriceFilter = "//input[@id = 'min-price-filter']";
    public static final String maxPriceFilter = "//input[@id = 'max-price-filter']";
    public static final String priceFilterBtn = "//span[@class = 'next-button__filter']";
    public static final String buyBtn = "//button[@id = 'opc_pdp_buyNowButton']";
    public static final String signInBtn = "//h1[text() = 'Inicia sesión']";
}
