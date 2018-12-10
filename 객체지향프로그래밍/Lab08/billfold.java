class billfold{
	protected String name;
	protected String type;
	protected int day;
	protected String sday;
	protected String card1;
	protected String card2;
	
	public billfold(String ename, String etype, int eday) {
		name = ename;
		type = etype;
		day = eday;
	}
	public billfold(String ename, String etype, String eday) {
		name = ename;
		type = etype;
		sday = eday;
	}
	void addCard() {
		if (card1!=null) {
			card1 = "\n" + name + "\n" + type + "\n" + day;
		}
		if (card2 != null) {
			card2 = "\n" + name + "\n" + type + "\n" + day;
		}
	}
	public String formatCards() {
		String result = "Name" + name + "\n";
	    result += "Termination: " + day;

	    return result;
	}
	
}
