package restaurants;

public class GetRestaurants {
	
	String[][] italian = {
			{"Reccomendation 1:\n","La Lanterna\n\nRated #9 of 197 for Italian on Tripadvisor\n\nPrice Range: £10-£15\n\n35 Hope Street\nGlasgow\nG2 6AE\n\nhttps://lalanterna-glasgow.co.uk/\n\n"},
			{"Reccomendation 2:\n","Viva Ristorante\n\nRated #11 of 197 for Italian on Tripadvisor\n\nPrice Range: £9-£13\n\n77 Bothwell Street\nGlasgow\nG2 6TS\n\nhttps://www.viva-ristorante.com/\n\n"},
			{"Reccomendation 3:\n","Celino's\n\nRated #12 of 197 for Italian on Tripadvisor\n\nPrice Range: £9-£30\n\n620 Alexandra Parade\nDennistoun\nGlasgow\nG31 3BT\n\nhttps://www.celinos.com/\n\n"}
			};

	String [][] american = {
			{"Reccomendation 1:\n","Buck's Bar\n\nRated #2 of 100 for American on Tripadvisor\n\nPrice Range: £6-£15\n\n111 West Regent Street\nGlasgow\nG2 2RU\n\nhttp://www.bucksbar.co.uk/\n\n"},
			{"Reccomendation 2:\n","Filling Station\n\nRated #13 of 100 for American on Tripadvisor\n\nPrice Range: £11-£17\n\nUnit C3 200 Woodville Park Industrial Estate\nWoodville Street\nBraehead Shopping Centre\nGlasgow\nG51 2RL\n\nhttps://www.filling-stations.co.uk/restaurants/scotland/glasgow/braehead\n\n"},
			{"Reccomendation 3:\n","Bread Meats Bread\n\nRated #3 of 100 for American on Tripadvisor\n\nPrice Range £5:-£10\n\n104 St.Vincent Street\nGlasgow\nG2 5UB\n\nhttp://www.breadmeatsbread.com/\n\n"}
			};

	String[][] indian = {
			{"Reccomendation 1:\n","Obsession of India\n\n","Rated #2 of 187 for Indian on Tripadvisor\n\n","Price Range: £5-£16\n\n","25 High Street\nMerchant City\nGlasgow\nG1 1LX\n\n","https://www.obsessionofindia.co.uk/\n\n"},
			{"Reccomendation 2:\n","Chaakoo Bombay Cafe\n\n","Rated #5 of 187 for Indian on Tripadvisor\n\n","Price Range: £4-£19\n\n","79 St. Vincent Street\nGlasgow\nG2 5TF\n\n","https://chaakoo.co.uk/\n\n"},
			{"Reccomendation 3:\n","Koolba\n\n","Rated #9 of 187 for Indian on Tripadvisor\n\n","Price Range: £15-£35\n\n","109 Candleriggs\nGlasgow\nG1 1NP\n\n","http://www.koolba.com/\n\n"}
			};

	String[][] mexican = {
			{"Reccomendation 1:\n","Topolabamba\n\n","Rated #1 of 19 for Mexican on Tripadvisor\n\n","Price Range: £4-£20\n\n","89 St. Vincent Street\nGlasgow\nG2 5TF\n\n","https://www.topolabamba.com/\n\n"},
			{"Reccomendation 2:\n","Bibis\n\n","Rated #2 of 19 for Mexican on Tripadvisor\n\n","Price Range: £6-£15\n\n","16 West Nile Street\nGlasgow\nG1 2PW\n\n","https://www.iguanas.co.uk/restaurants/glasgow\n\n"},
			{"Reccomendation 3:\n","Las Iguanas\n\n","Rated #3 of 19 for Mexican on Tripadvisor\n\n","Price Range: £5-£16\n\n","599 Dumbarton Road\nGlasgow\nG11 6HY\n\n","http://bibiscantina.co.uk/\n\n"}
			};
	
	String [][] noneFound = {{"There is no recommendations for you currently in our DB. Would you like to enter another food?"}};
	
	String restaurantArray[][];
	
	public String[][] getReccomendation(String food) {
		
		boolean isIndian = food == "Indian";
		boolean isMexican = food == "Mexican";
		boolean isAmerican = food == "American";
		boolean isItalian = food == "Italian";	

		if (isItalian) {
			restaurantArray = italian;
			return restaurantArray;
		} else if (isAmerican) {
			restaurantArray = american;
			return restaurantArray;
		} else if (isMexican) {
			restaurantArray = mexican;
			return restaurantArray;
		} else if (isIndian) {
			restaurantArray = indian;
			return restaurantArray;
		} else {
			restaurantArray = noneFound;
			return restaurantArray;
		}
	}
	
	public void printRestaurants(String food) {			
		for (String[] a : getReccomendation(food)){
			for (String b : a){
				System.out.print(b);
			}
		System.out.print("\n");
		}
	}

}