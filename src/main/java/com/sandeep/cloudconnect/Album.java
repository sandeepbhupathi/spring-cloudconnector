package com.sandeep.cloudconnect;

public class Album {

	@Override
	public String toString() {
		return "Album [id=" + id + ", albumID=" + albumID + ", artist=" + artist + ", genre=" + genre + ", releaseYear="
				+ releaseYear + ", title=" + title + ", trackCount=" + trackCount + "]";
	}
	
	private String id;
	private String albumID;
	private String artist;
	private String genre;
	private String releaseYear;
	private String title;
	private int trackCount;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAlbumID() {
		return albumID;
	}
	public void setAlbumID(String albumID) {
		this.albumID = albumID;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}
	
	
	
}
