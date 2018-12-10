class cardlist{
	billfold[] billfold;
	public cardlist(){
		billfold = new billfold[3];
		billfold[0] = new billfold("kkk", "drivinglicenses","111-1111", 2018);
		billfold[1] = new billfold("aaa", "idcard", "123-3232");
		billfold[2] = new billfold("ddd", "calling card", "55555y");
	}
	public void payday ()
	   {
	      double amount;

		for (Card count : billfold)
	      {
	         System.out.println (count);
	      }
	   }
}