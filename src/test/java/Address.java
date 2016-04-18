import org.testng.annotations.Test;

/**
 * Created by tjmaher on 4/18/16.
 */
public class Address {

  private String name;
  private String streetAddress1;
  private String streetAddress2;
  private String city;
  private String state;
  private String zipCode;
  private String country;

  Address ( String name, String streetAddress1, String city,
            String state, String zipCode, String country){
    this.name = name;
    this.streetAddress1 = streetAddress1;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
  }

  Address ( String name, String streetAddress1, String streetAddress2,
            String city, String state, String zipCode, String country){
    this.name = name;
    this.streetAddress1 = streetAddress1;
    this.streetAddress2 = streetAddress2;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + "\n"
        + "Address1: " + this.streetAddress1 + "\n"
        + "Address2: " + this.streetAddress2 + "\n"
        + "City: " + this.city + "\n"
        + "State: " + this.state + "\n"
        + "Zip: " + this.zipCode + "\n"
        + "Country: " + this.country + "\n";
  }

  @Test
  public static void testAssigningAddresses() {
    Address billingAddress = new Address(
        "FITBIT", "ONE MARINA PARK DRIVE",
        "SUITE 701",
        "BOSTON", "MA", "02210", "United States");
    System.out.println(billingAddress);

    Address shippingAddress = new Address(
        "Mr. Address Argentine",
        "Piedras No 623",
        "Piso2 Dto.4",
        "C1070AAM",  // WRONG: Should be City
        "Capital Federal", // WRONG: Should be zipCode
        "ARGENTINA");
    System.out.println(shippingAddress);

  }

}
