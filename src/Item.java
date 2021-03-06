
public abstract class Item {
	
	protected String title;
	protected float cost;
	protected String status;
	protected int articleNumber;
	
	public Item(int articleNumber, String title, float cost, String status) {
		this.title = title;
		this.articleNumber = articleNumber;
		this.status = status;
		this.cost = cost;
	}
	
	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getArticleNumber() {
		return articleNumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String itemCsvRecord() {
		return String.format("%s,%.2f,%s,%d,%d,%s,", title, cost, status, articleNumber); 
	}
	
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       	
	public static String getCsvHeaderString() {
		return "article number,title,cost,status";
		
	}
	
	public static Item parseItem(String csvRecord) {
		String[] values = csvRecord.split(",");
		int articleNumber = Integer.parseInt(values[0]);
		String title = values[1];
		float cost = Float.parseFloat(values[2]);
		int pages = Integer.parseInt(values[3]);
		String publisher = values[4];
		String status = values[5];
		return new Book(articleNumber, title, cost, pages, publisher, status);
	}
	
	@Override
	public String toString() {
		super.toString();
		return String.format("%s: Title %.2f: Price %s: Status %d Article Number", title, cost, status, articleNumber);
	}

}
