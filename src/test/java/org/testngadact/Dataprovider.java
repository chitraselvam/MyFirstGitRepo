package org.testngadact;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="AmazonProductSearch")
	public static Object[][] searchProduct() {
		return new Object[][] {
			{"speaker with mic"},
			{"wireless speaker with mic"},
			{"dreamland activity book for age 3+"},
			{"spanish book for kids"},
			{"jbl speakers"},
			{"radio"},
			{"magnetic building blocks"},
			{"frozen elsa dress for girls"},
				
		
		};

	}

}
