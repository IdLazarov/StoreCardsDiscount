
public class Card {

	private String ownerName;
	private Integer ownerId;
	private double turnover;
	private double discountRate = 0;
	
	public Card() {
		
	}

	public Card(String ownerName, Integer ownerId, double turnover) {

		this.ownerName = ownerName;
		this.ownerId = ownerId;
		this.turnover = turnover;

	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
