package com.iyzico.testbase;

import com.iyzico.pages.ChartPageElements;
import com.iyzico.pages.ConfirmationPageElements;
import com.iyzico.pages.MainPageElements;
import com.iyzico.pages.PaymentConfirmElements;
import com.iyzico.pages.PaymentPageElements;
import com.iyzico.pages.İtemsPageElements;

public class PageInitializer extends BaseClass{
	
	public static MainPageElements mainPage;
	public static İtemsPageElements itemsPage;
	public static ChartPageElements chartPage;
	public static PaymentPageElements paymentPage;
	public static PaymentConfirmElements pconfirmPage;
	public static  ConfirmationPageElements confirmPage;
	
	
	
	public static void initialize() 
	{
		mainPage= new MainPageElements();
		itemsPage=new İtemsPageElements();
		chartPage =new ChartPageElements();
		paymentPage=new PaymentPageElements();
		pconfirmPage=new PaymentConfirmElements();
		confirmPage=new  ConfirmationPageElements();
	}

}
