package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class OnlineShop {
    private String webAddress;
    private String name;
    private  String city;

    public OnlineShop(String webAddress, String name, String city) {
        this.webAddress = webAddress;
        this.name = name;
        this.city = city;
    }

    public String getWebAddress() {
        return webAddress;
    }
}
