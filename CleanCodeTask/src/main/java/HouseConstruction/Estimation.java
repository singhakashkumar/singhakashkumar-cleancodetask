package HouseConstruction;
import HouseConstruction.Dimensions;

import java.util.HashMap;
import java.util.Map;

public class Estimation extends Dimensions {
       
	   Integer Construction_Cost;
	   String selected_plan;
	   public Map<String,Integer> Construction_Details;
	   
       public Estimation(){
    	   
       }
       
       public void ShowConstructionDetails() {
    	   
    	   Construction_Details = new HashMap<String,Integer>();
    	   
    	   Construction_Details.put("standard materials",1200);
    	   
    	   Construction_Details.put("above standard materials",1500);
    	   
    	   Construction_Details.put("high standard materials",1800);
    	   
    	   Construction_Details.put("high standard materials and fully automated home",2500);
    	   

       }
       
       public void SetDimensions(Integer length,Integer width) {
    	

    	   this.length=length;	   
    	   this.width=width;

       
       }
       
       public Map<String,Integer> getConstructionDetails() {
    	   
    	   
    	   ShowConstructionDetails();
    	   return this.Construction_Details;
    	   
       }
       
       public void Selected(String selected){
    	   
    	   this.selected_plan = selected;
    	   
       }
       
       public Integer getCost_Estimation() {
    	     
    	   return (this.length*this.width*Construction_Details.get(selected_plan));
       
       }
       
       

}
