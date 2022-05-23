package Lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Address {
    private String country;
    private String city;
    
//    public Address(String country, String city) {
//    	this.country = country;
//    	this.city = city;
//    } // @AllArgsConstructor
    
//  public String getCountry() { return country; } // @Getter
//	public String getCity() { return city; } // @Getter
}
