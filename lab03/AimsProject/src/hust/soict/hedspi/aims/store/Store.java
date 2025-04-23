package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
	private static final int MAX_DISC = 1000;
	private  DigitalVideoDisc[]  itemsInStore = new DigitalVideoDisc[MAX_DISC];
	private static int nbStoreDisc;
	
	public void addDVD(DigitalVideoDisc disc) {
		if( nbStoreDisc == MAX_DISC -1 ) {
			System.out.printf("Maximum storage capacity reached. Unable to add more items.");
			return;
		}
		itemsInStore[nbStoreDisc++] = disc;
		System.out.printf("Added \"" + disc.getTitle()+ "\" disc.\n" );
		
	}


	public void removeDVD (String title ) {
       boolean found = false ;
        for (int i = 0; i < nbStoreDisc; i++) {
            if (itemsInStore[i].isMatch(title)) {
              
                for (int j = i; j < nbStoreDisc - 1; j++) {
                	itemsInStore[j] = itemsInStore[j + 1];
                }
                nbStoreDisc--;
                found = true;
                System.out.println("The disc \"" + title + "\" has been removed.");
                
            }
        }
        if (!found) {
            System.out.println("Disc not found in cart.");
        }
    }

	public void removeDVD (DigitalVideoDisc disc ) {
       boolean found = false ;
        for (int i = 0; i < nbStoreDisc; i++) {
            if (itemsInStore[i].equals(disc)) {
              
                for (int j = i; j < nbStoreDisc - 1; j++) {
                	itemsInStore[j] = itemsInStore[j + 1];
                }
                nbStoreDisc--;
                found = true;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                
            }
        }
        if (!found) {
            System.out.println("Disc not found in cart.");
        }
    }
	  public void printStore() {
	        if (nbStoreDisc == 0) {
	            System.out.println("The store is currently empty.");
	            return;
	        }

	        System.out.println("***********************STORE***********************");
	        System.out.println("The following discs are currently in the store:");
	        for (int i = 0; i < nbStoreDisc; i++) {
	            System.out.println((i + 1) + ". " + itemsInStore[i].getTitle());
	        }
	        System.out.println("**************************************************");
	    }
	}



