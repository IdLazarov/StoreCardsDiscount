public class PayDesk {

	private static BronzeCard bronzeCard = new BronzeCard();
	private static SilverCard silverCard = new SilverCard();
	private static GoldCard goldCard = new GoldCard();

	public PayDesk(BronzeCard bronzeCard, SilverCard silverCard, GoldCard goldCard) {

		PayDesk.bronzeCard = bronzeCard;
		PayDesk.silverCard = silverCard;
		PayDesk.goldCard = goldCard;
	}

	public BronzeCard getBronzeCard() {
		return bronzeCard;
	}

	public void setBronzeCard(BronzeCard bronzeCard) {
		PayDesk.bronzeCard = bronzeCard;
	}

	public SilverCard getSilverCard() {
		return silverCard;
	}

	public void setSilverCard(SilverCard silverCard) {
		PayDesk.silverCard = silverCard;
	}

	public GoldCard getGoldCard() {
		return goldCard;
	}

	public void setGoldCard(GoldCard goldCard) {
		PayDesk.goldCard = goldCard;
	}

	public static void payDesk(Card card, Double purchaseValue) {

		double discount;
		double totalPrice;
		if (card.getClass().getName().equals(bronzeCard.getClass().getName())) {

			if (card.getTurnover() < 100) {

				card.setDiscountRate(0.0);

			} else if (card.getTurnover() >= 100 && card.getTurnover() <= 300) {
				card.setDiscountRate(1.0);
			} else {
				card.setDiscountRate(2.5);
			}

			discount = (card.getTurnover() * card.getDiscountRate()) / 100;
			totalPrice = purchaseValue - discount;

			System.out.println("Purchase value: $" + purchaseValue + "\n" + "Discount rate: " + card.getDiscountRate()
					+ "\n" + "Discount: $" + discount + "\n" + "Total: $" + totalPrice);

		}
		if (card.getClass().getName().equals(silverCard.getClass().getName())) {

			if (card.getTurnover() > 300) {

				card.setDiscountRate(3.5);

			} else {
				card.setDiscountRate(2.0);
			}

			discount = (card.getTurnover() * card.getDiscountRate()) / 100;
			totalPrice = purchaseValue - discount;

			System.out.println("Purchase value: $" + purchaseValue + "\n" + "Discount rate: " + card.getDiscountRate()
					+ "\n" + "Discount: $" + discount + "\n" + "Total: $" + totalPrice);

		}
		if (card.getClass().getName().equals(goldCard.getClass().getName())) {

			if (card.getTurnover() < 100) {
				card.setDiscountRate(2.0);
			} else if (card.getTurnover() >= 100 && card.getTurnover() < 200) {
				card.setDiscountRate(3.0);
			} else if (card.getTurnover() >= 200 && card.getTurnover() < 300) {
				card.setDiscountRate(4.0);
			} else if (card.getTurnover() >= 300 && card.getTurnover() < 400) {
				card.setDiscountRate(5.0);
			} else if (card.getTurnover() >= 400 && card.getTurnover() < 500) {
				card.setDiscountRate(6.0);
			} else if (card.getTurnover() >= 500 && card.getTurnover() < 600) {
				card.setDiscountRate(7.0);
			} else if (card.getTurnover() >= 600 && card.getTurnover() < 700) {
				card.setDiscountRate(8.0);
			} else if (card.getTurnover() >= 700 && card.getTurnover() < 800) {
				card.setDiscountRate(9.0);
			} else {
				card.setDiscountRate(10.0);
			}

			discount = (card.getTurnover() * card.getDiscountRate()) / 100;
			totalPrice = purchaseValue - discount;

			System.out.println("Purchase value: $" + purchaseValue + "\n" + "Discount rate: " + card.getDiscountRate()
					+ "\n" + "Discount: $" + discount + "\n" + "Total: $" + totalPrice);

		}

		
	}

}
