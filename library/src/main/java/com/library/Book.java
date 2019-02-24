package com.library;

import java.io.Serializable;

public class Book implements Serializable {
	private String asin;
    private String title;
    private String author;
    private String genre;
    private String publicationYear;
    private String link;
    private String imgURL;
    private String ratings;
    
    public Book() {
    	
    }
    
	@Override
	public String toString() {
		return "Book [asin=" + asin + ", title=" + title + ", author=" + author + ", genre=" + genre
				+ ", publicationYear=" + publicationYear + ", link=" + link + ", imgURL=" + imgURL + ", ratings="
				+ ratings + "]";
	}
	public Book(String asin, String title, String author, String genre, String publicationYear, String link,
			String imgURL, String ratings) {
		super();
		this.asin = asin;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publicationYear = publicationYear;
		this.link = link;
		this.imgURL = imgURL;
		this.ratings = ratings;
	}
	public String getAsin() {
		return asin;
	}
	public void setAsin(String asin) {
		this.asin = asin;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

    
    
}
