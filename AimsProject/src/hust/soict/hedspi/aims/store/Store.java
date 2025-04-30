package hust.soict.hedspi.aims.store;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class Store {
	private static final int MAX_ITEMS = 1000;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsInStore.size() >= MAX_ITEMS) {
			System.out.println("Maximum storage capacity reached. Unable to add more items.");
			return;
		}
		itemsInStore.add(media);
		System.out.println("Added \"" + media.getTitle() + "\" to the store.");
	}

	public void removeMedia(Media media) {
		boolean removed = itemsInStore.remove(media);
		if (removed) {
			System.out.println("The item \"" + media.getTitle() + "\" has been removed from the store.");
		} else {
			System.out.println("Item not found in the store.");
		}
	}

	public void printStore() {
		if (itemsInStore.isEmpty()) {
			System.out.println("The store is currently empty.");
			return;
		}

		System.out.println("***********************STORE***********************");
		System.out.println("The following items are currently in the store:");
		for (int i = 0; i < itemsInStore.size(); i++) {
			Media media = itemsInStore.get(i);
			System.out.println(media.toString()); // Assuming toString() in Media
		}
		System.out.println("**************************************************");
	}

	
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	public Store() {
        
		addMedia(new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 19.99f));
        addMedia(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 22.50f));
//        addMedia(new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 21.00f));
//        addMedia(new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 23.75f));
       
        // Books
        addMedia(new Book("To Kill a Mockingbird", "Fiction", 14.99f));
//        addMedia(new Book("1984", "Science Fiction", 12.50f));
//        addMedia(new Book("The Great Gatsby", "Fiction", 11.00f));
       

        // CDs
        addMedia(new CompactDisc("OK Computer", "Alternative Rock", "Radiohead", "Radiohead", 53, 13.99f));
        addMedia(new CompactDisc("Nevermind", "Grunge", "Nirvana", "Nirvana", 42, 12.00f));
        addMedia(new CompactDisc("The Joshua Tree", "Rock", "U2", "U2", 50, 14.50f));
        addMedia(new CompactDisc("Dark Side of the Moon", "Progressive Rock", "Pink Floyd", "Pink Floyd", 43, 15.00f));
//        addMedia(new CompactDisc("Led Zeppelin IV", "Hard Rock", 14.00f, 42, "Led Zeppelin", "Led Zeppelin"));
       
            }
}