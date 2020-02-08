package com.phoenix.services;

import com.phoenix.models.GetBookAuthor;

import java.util.ArrayList;
import java.util.List;

public class GetBookService {
	 public List<String> getAvailableBooks(GetBookAuthor author){

	        List<String> books = new ArrayList<String>();

	        if(author.equals(GetBookAuthor.DANBROWN)){
	        	books.add("Angels and Demons");
	        	books.add("Lost Symbol");
			books.add("Deception Point");
			books.add("Digital Fortress");

	        }else if(author.equals(GetBookAuthor.PAULOCOELHO)){
	        	books.add("Alchemist");
	        	books.add("The Zahir");
			books.add("Eleven Minutes");

	        }else if(author.equals(GetBookAuthor.SIDNEYSHELDON)){
	            books.add("Tell me your dreams");
	            books.add("Bloodline");
	            books.add("Master of the game");

	        }else {
	            books.add("No book Available");
	        }
	    return books;
	    }

}
