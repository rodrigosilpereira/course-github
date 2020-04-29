package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Used_Product_Polimorfismo extends Product_Polimorfismo {
	
private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public Used_Product_Polimorfismo(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}

}
