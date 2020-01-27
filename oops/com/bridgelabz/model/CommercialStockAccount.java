package com.bridgelabz.model;

public class CommercialStockAccount 
{
	private String stock_symbol;
	private String stock_name;
	private long share_price;
	private long share_no;

	public String getStock_symbol() 
	{
		return stock_symbol;
	}

	public void setStock_symbol(String stock_symbol) 
	{
		this.stock_symbol = stock_symbol;
	}

	public String getStock_name() 
	{
		return stock_name;
	}

	public void setStock_name(String stock_name) 
	{
		this.stock_name = stock_name;
	}

	public long getShare_price() 
	{
		return share_price;
	}

	public void setShare_price(long share_price) 
	{
		this.share_price = share_price;
	}

	public long getShare_no() 
	{
		return share_no;
	}

	public void setShare_no(long share_no) 
	{
		this.share_no = share_no;
	}

}
