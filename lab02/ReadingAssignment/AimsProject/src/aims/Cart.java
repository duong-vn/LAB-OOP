package aims;
import javax.swing.JOptionPane;

public class Cart {
		public static final int MAX_NUMBERS_ORDERED = 20;
	    private  DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	    private  int qtyOrdered = 0;
	   public  void  addDigitalVideoDisc(DigitalVideoDisc disc) {
		   if ( qtyOrdered == MAX_NUMBERS_ORDERED ) {
			//   System.out.println("CART IS FULL CANNOT ADD \"" +disc.getTitle() +"\" DISC");
		JOptionPane.showMessageDialog(null, "CART IS FULL CANNOT ADD \"" + disc.getTitle() +"\" DISC", null, JOptionPane.ERROR_MESSAGE);
		   }else {			 
			   		itemsOrdered[qtyOrdered] = disc;
	    			qtyOrdered++;
	    			System.out.println("The disc  \"" + disc.getTitle() + "\"  has been added");
	    			// co the in thong bao kieu nhu nay
	    		//JOptionPane.showMessageDialog(null, "The disc  \"" + disc.getTitle() + "\"  has been added", null, JOptionPane.INFORMATION_MESSAGE);
	    			if ( qtyOrdered == MAX_NUMBERS_ORDERED - 1 ) {
//	    						System.out.println("The cart is almost full");
	  JOptionPane.showMessageDialog(null, "The cart is almost full", null, JOptionPane.INFORMATION_MESSAGE);

	    				} 	    			
		 	   		}   	
	   		}
	   public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		    for (DigitalVideoDisc dvd : dvdList) {
		        addDigitalVideoDisc(dvd);  
		    }
		}
	   public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		    addDigitalVideoDisc(dvd1);  
		    addDigitalVideoDisc(dvd2);
		
		}


	   
//	   public void removeDigitalVideoDisc(String title) {
//	        boolean found = false;
//	        for (int i = 0; i < qtyOrdered; i++) {
//	            if (itemsOrdered[i].getTitle().equalsIgnoreCase(title)) { 
//	                found = true;
//	                title = itemsOrdered[i].getTitle();
//	                  for (int j = i; j < qtyOrdered - 1; j++) {
//	                    itemsOrdered[j] = itemsOrdered[j + 1];
//	                }
//	                itemsOrdered[qtyOrdered - 1] = null; 
//	                qtyOrdered--;
//	               
//	                JOptionPane.showMessageDialog(null, "The disc \"" + title + "\" has been removed from the cart.", null, JOptionPane.INFORMATION_MESSAGE);
//	               break;
//	            }
//	        }
//	        if (!found) {
//	            //System.out.println("The disc \"" + title + "\" was not found in the cart.");
//	            JOptionPane.showMessageDialog(null, "The disc \"" + title + "\" was not found in the cart.", null, JOptionPane.INFORMATION_MESSAGE);
//	        }
//	    }
	   public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].equals(disc)) {
	              
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemsOrdered[j] = itemsOrdered[j + 1];
	                }
	                qtyOrdered--;
	                found = true;
	                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Disc not found in cart.");
	        }
	    }
	   

	   
	 
	   
	   public float totalCost() {
	        float total = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            total += itemsOrdered[i].getCost();
	        }
	        return total;
	    }
	  
	   public void printCart() {
	        
	        if (qtyOrdered == 0) {
	            //System.out.println("The cart is empty.");
	            JOptionPane.showMessageDialog(null,"The cart is empty.", null, JOptionPane.INFORMATION_MESSAGE);

	        } else {
	            for (int i = 0; i < qtyOrdered; i++) {
	                System.out.printf("%-10d %-25s $%-3.2f\n",itemsOrdered[i]. getId(),itemsOrdered[i].getTitle(), itemsOrdered[i].getCost());
	            }
	            
	            System.out.printf("%-10s %-25s $%-3.2f\n","","Total Cost:", totalCost());
	        }
	       
	    }
//					   public static void main(String[] args) {
//						   Cart ok = new Cart();
//						   DigitalVideoDisc dvd = new DigitalVideoDisc("2","2" , 15.6f);
//						   ok.addDigitalVideoDisc(new DigitalVideoDisc("1","2" , 15.6f));
//						   ok.addDigitalVideoDisc(new DigitalVideoDisc("3","2" , 15.6f));
//						  ok.addDigitalVideoDisc(dvd);
//						   
//						   ok.printCart();
//						   ok.removeDigitalVideoDisc(dvd);
//						   ok.printCart();
//						   
//						 
//					   }
					
}
