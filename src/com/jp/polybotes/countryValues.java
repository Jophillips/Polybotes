package com.jp.polybotes;


import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;


public class countryValues {

	//initializes countryValues
	public String countryValue1;
	public String countryValue2;
	public String countryValue3;
	public String countryValue4;
	public String countryValueCorrect;
	public String textMain;
	String textColour = "0";


	public countryValues() {
		
	//sets the temporary arrays this will be deleted once SQLITE is used.	
	String tempButtons[] = {"1", "2", "3", "4"};
	final String countryNames[] = {"Andorra","Afghanistan","Angola","Albania","United Arab Emirates","Argentina","Armenia","Antigua and Barbuda","Australia","Austria","Azerbaijan","Burundi","Belgium","Benin","Burkina Faso","Bangladesh","Bulgaria","Bahrain","Bahamas, The","Bosnia and Herzegovina","Belarus","Belize","Bermuda","Bolivia","Brazil","Barbados","Brunei Darussalam","Bhutan","Botswana","Central African Republic","Canada","Switzerland","Chile","China","Cote d'Ivoire","Cameroon","Congo, Rep.","Colombia","Comoros","Cape Verde","Costa Rica","Cuba","Cyprus","Czech Republic","Germany","Djibouti","Dominica","Denmark","Dominican Republic","Algeria","Ecuador","Egypt, Arab Rep.","Eritrea","Spain","Estonia","Ethiopia","Finland","Fiji","France","Micronesia, Fed. Sts.","Gabon","United Kingdom","Georgia","Ghana","Guinea","the Gambia","Guinea-Bissau","Equatorial Guinea","Greece","Grenada","Guatemala","Guyana","Honduras","Croatia","Haiti","Hungary","Indonesia","India","Ireland","Iran, Islamic Rep.","Iraq","Iceland","Israel","Italy","Jamaica","Jordan","Japan","Kazakhstan","Kenya","Kyrgyz Republic","Cambodia","Kiribati","St. Kitts and Nevis","Korea, Rep.","Kosovo","Kuwait","Lao PDR","Lebanon","Liberia","Libya","St. Lucia","Liechtenstein","Sri Lanka","Lesotho","Lithuania","Luxembourg","Latvia","Morocco","Monaco","Moldova","Madagascar","Maldives","Mexico","Marshall Islands","Macedonia, FYR","Mali","Malta","Myanmar","Montenegro","Mongolia","Mozambique","Mauritania","Mauritius","Malawi","Malaysia","Namibia","Niger","Nigeria","Nicaragua","Netherlands","Norway","Nepal","New Zealand","Oman","Pakistan","Panama","Peru","Philippines","Palau","Papua New Guinea","Poland","Puerto Rico","Korea, Dem. Rep.","Portugal","Paraguay","Qatar","Romania","Russian Federation","Rwanda","Saudi Arabia","Sudan","Senegal","Singapore","Solomon Islands","Sierra Leone","El Salvador","San Marino","Somalia","Serbia","South Sudan","Sao Tome and Principe","Suriname","Slovak Republic","Slovenia","Sweden","Swaziland","Seychelles","Syrian Arab Republic","Chad","Togo","Thailand","Tajikistan","Turkmenistan","Timor-Leste","Tonga","Trinidad and Tobago","Tunisia","Turkey","Tuvalu","Tanzania","Uganda","Ukraine","Uruguay","United States","Uzbekistan","St. Vincent and the Grenadines","Venezuela, RB","Vietnam","Vanuatu","Samoa","Yemen, Rep.","South Africa","Congo, Dem. Rep.","Zambia","Zimbabwe"};
	final double gdp[] = {4.51,15.9,82.4,11.8,287,368,9.26,1.16,1.14,375,52.9,2.02,268,6.55,9.2,100,47.7,25.7,7.88,16.7,55.2,1.39,5.74,19.6,2.14,4.43,12.36,1.58,13.7,1.98,1.57,550,217.6,5.93,22.9,22.5,12,287,543,1.7,36.3,64.3,23.1,198.5,3.28,2.3,472,313.4,51.7,161.2,67.5,218.9,2.1,1.38,18.9,26.3,235.2,3.2,2.55,294,14.5,2.29,11.6,32.2,4.7,952,835,12.3,292.3,784,41.3,2.3,15.7,58.9,6.6,127.5,709.2,1.71,208,422.6,135.5,12.6,231.7,2.04,13.2,26.4,5.50,148.1,32.2,4.8,11.2,150,676,1.01,5.8,119.9,7.2,37.1,1.3,95.9,1.2,3.54,49.6,2.2,36.3,51.7,24,90.8,5.4,5.8,8.8,2.1,1.05,163,9.3,9.4,8.2,111.1,4.1,6.2,9.3,3.7,9.7,5.4,247.5,11.1,5.7,229.5,8.6,772.1,421.2,16,143.2,58.8,177.4,26.6,157.6,199.6,196.5,9.5,469.7,97.1,40,227.4,20,125.1,164.4,1.52,5.6,526.8,64.8,12.9,217.2,679,2.6,21.4,1.17,5.89,37,15.2,201,4.4,87.1,46.9,462.9,3.7,970,59.1,10.7,3.2,318.9,5.6,22.1,934,369,20.7,44.4,731.1,32,22.9,17.2,136.4,38.8,14.96,39.3,675,393.8,115.9,701,572,31.9,363.2,13.1,16.2,7.4};
	final String gdp_end[] = {"B","B","M","B","B","B","B","B","T","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","T","B","B","B","B","B","T","B","B","T","B","B","B","B","M","B","B","B","B","B","T","B","M","B","B","B","B","B","B","T","B","B","B","B","T","M","B","T","B","B","B","M","M","B","B","M","B","B","B","B","B","B","B","T","B","B","B","B","B","T","B","B","T","B","B","B","B","M","M","T","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","T","M","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","M","B","B","B","B","B","B","B","B","T","B","B","B","B","B","M","B","B","B","B","B","B","M","B","B","B","B","B","M","B","B","B","B","B","B","M","M","B","B","B","M","B","B","B","B","T","B","M","B","B","M","M","B","B","B","B","B"};
	final double population[] = {77.9,28.3,19.5,3.15,8.44,40.3,2.96,87.2,22.1,8.38,9.05,9.23,10.8,9.5,15.5,151,7.53,1.25,360,3.84,9.49,308,65.1,10.1,195,280,400,716,1.96,4.34,34.1,7.82,17.2,1.34,18.98,20.62,4.11,46.44,683.1,487.6,4.67,11.28,1.1,10.52,81.78,834,71.2,5.55,10.02,37.06,15,78.08,5.74,46.07,1.34,87.1,5.36,860.56,65.03,103.6,1.56,62.27,4.45,24.26,10.88,1.68,1.59,696.17,11.31,104.7,14.34,786.1,7.62,4.42,9.9,10,240.68,1.21,4.47,74.46,30.96,318,7.62,60.48,2.7,6.05,127.45,16.32,40.91,5.45,14.36,97.7,52.4,49.41,1.78,2.99,6.4,4.34,3.96,6.04,177.4,36.1,20.65,2.01,3.29,507,2.24,31.64,36.8,3.56,21.08,325.7,117.89,52,2.1,13.99,416,51.93,620.1,2.71,23.97,3.61,1.28,15.01,28.28,2.18,15.89,159.71,5.82,16.62,4.89,26.85,4.37,2.8,173.15,3.68,29.26,93.44,20.5,6.86,38.18,3.72,24.5,10.64,6.46,1.75,21.44,142.39,10.84,27.26,35.65,12.95,5.08,526.4,5.75,6.22,30.9,9.64,7.29,9.94,178.2,525,5.43,2.05,9.38,1.19,89.8,21.53,11.72,6.31,66.4,7.63,5.04,1.14,104.1,1.33,10.55,72.14,9.8,44.97,33.99,45.87,3.37,309.33,28.56,109.3,29.04,86.93,236.3,186,22.76,49.99,62.19,13.22,13.08};
	final String population_end[] = {"K","M","M","M","M","M","M","K","M","M","M","M","M","M","M","M","M","M","K","M","M","K","K","M","M","K","K","K","M","M","M","M","M","B","M","M","M","M","K","K","M","M","M","M","M","K","K","M","M","M","M","M","M","M","M","M","M","K","M","K","M","M","M","M","M","M","M","K","M","K","M","K","M","M","M","M","M","B","M","M","M","K","M","M","M","M","M","M","M","M","M","K","K","M","M","M","M","M","M","M","K","K","M","M","M","K","M","M","K","M","M","K","M","K","M","M","K","M","K","M","M","M","M","M","M","M","M","M","M","M","M","M","M","M","M","M","M","M","K","M","M","M","M","M","M","M","M","M","M","M","M","M","M","K","M","M","K","M","M","M","K","K","M","M","M","M","K","M","M","M","M","M","M","M","K","M","M","M","K","M","M","M","M","M","M","K","M","M","K","K","M","M","M","M","M"};

	
    //define ArrayList to hold Integer objects
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    
	int gdpOrPop = (int) (Math.random() * 2);  //Chooses if it's Pop or GDP
    
	/*
	 * 
	 * GDP
	 * 
	 */
	if (gdpOrPop == 1){
		for(int i = 0; i < 4; i++)
		{
		int randoValue = (int) (Math.random() * 195);  //Chooses the country

		double dblgdp = (gdp[randoValue]);
		double gdp90 = dblgdp * 0.9;
		double gdp110 = dblgdp * 1.1;		

	
    	if (numbers.contains(randoValue) || Arrays.asList(tempButtons).contains(gdp[randoValue]) 
    		){
    		i--;
			}
    	else { 

    		//check range
    		for (int z = 0; z <= i;)
    		{
    			if (Double.parseDouble(tempButtons[z]) > gdp90 && Double.parseDouble(tempButtons[z]) < gdp110)
    			{
    				i--;
    				break;
    			}
    			else if (z == i )
    			{
    				//&& (Double.parseDouble(tempButtons[z]) < population90 || Double.parseDouble(tempButtons[z]) > population110)
    	    		numbers.add(randoValue); 
    	    		break;
    			}
    			else 
    			{
    				z++;
    			}
    		}
    		
   // do stuff?   		

    		} // end of else

		} 

    
		//sets the countryValues with tempButtons
		for(int j = 0; j < 4; j++)
		{
    	int k = numbers.get(j);
    	
    	tempButtons[j] =  gdp[k] + gdp_end[k];		
		}
	

		int randoValueTwo = (int) (Math.random() * 195);  //Chooses the country   

		//sets the country Values
		countryValue1 = tempButtons[0];
		countryValue2 = tempButtons[1];	
		countryValue3 = tempButtons[2];
		countryValue4 = tempButtons[3];
		countryValueCorrect = gdp[randoValueTwo] + gdp_end[randoValueTwo];	
		textColour = "1";
	
		textMain = "What is the GDP of " + countryNames[randoValueTwo] + "?";
		
	}
	
	
	/*
	 * 
	 * Population
	 * 
	 */
	
	if (gdpOrPop == 0){
    
		for(int i = 0; i < 4; i++)
		{
		int randoValue = (int) (Math.random() * 195);  //Chooses the country

		double dblPopulation = (population[randoValue]);
		double population90 = dblPopulation * 0.9;
		double population110 = dblPopulation * 1.1;		

	
    	if (numbers.contains(randoValue) || Arrays.asList(tempButtons).contains(population[randoValue]) 
    		){
    		i--;
			}
    	else { 

    		//check range
    		for (int z = 0; z <= i;)
    		{
    			if (Double.parseDouble(tempButtons[z]) > population90 && Double.parseDouble(tempButtons[z]) < population110)
    			{
    				i--;
    				break;
    			}
    			else if (z == i )
    			{
    				//&& (Double.parseDouble(tempButtons[z]) < population90 || Double.parseDouble(tempButtons[z]) > population110)
    	    		numbers.add(randoValue); 
    	    		break;
    			}
    			else 
    			{
    				z++;
    			}
    		}
    		
   // do stuff?   		

    		} // end of else

		} 

    
		//sets the countryValues with tempButtons
		for(int j = 0; j < 4; j++)
		{
    	int k = numbers.get(j);
    	
    	tempButtons[j] =  population[k] + population_end[k];		
		}
	

		int randoValueTwo = (int) (Math.random() * 195);  //Chooses the country   

		//sets the country Values
		countryValue1 = tempButtons[0];
		countryValue2 = tempButtons[1];	
		countryValue3 = tempButtons[2];
		countryValue4 = tempButtons[3];
		countryValueCorrect = population[randoValueTwo] + population_end[randoValueTwo];	
		textColour = "0";
	
		textMain = "What is the Population of " + countryNames[randoValueTwo] + "?";
		


	}
	
	} //end of gdp or Pop if


	//Returns the values	
	public String buttonValue1(Object countryValue1) {return (String) countryValue1;}   
	public String buttonValue2(Object countryValue2) {return (String) countryValue2;}   
	public String buttonValue3(Object countryValue3) {return (String) countryValue3;}   
	public String buttonValue4(Object countryValue4) {return (String) countryValue4;}
	public String textView1(Object textMain) {return (String) textMain;}
	public String buttonValue5(Object countryValueCorrect) {return (String) countryValueCorrect;}
	public String buttonValue6(Object textColour) {return (String) textColour;}


	
	
}
