package tueAlgorithim;
import java.util.*;
public class GeomitrecObject {
	private String color;
	private boolean filled=false;
	protected Date dateCreated=new Date();
	public GeomitrecObject() {
		super();
		
	}
	public GeomitrecObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated=new Date();
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	@Override
	public String toString() {
		return "GeomitrecObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
	

}
