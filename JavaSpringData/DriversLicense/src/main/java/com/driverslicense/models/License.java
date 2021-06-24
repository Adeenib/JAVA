package com.driverslicense.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
		return id;
	}
	@Column(name="number")
    private Integer number;
    @Column(name="expirationdate")
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date expirationDate;
    @Column(name="state")
    private String state;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
 
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
    public License() {
    
        
    }
	
    
    public  License(Integer number,Date expirationDate, String state, Person person) {
		super();
		
		this.number=number;
		this.expirationDate = expirationDate;
		this.state = state;
		this.person = person;
	}


//	public String getNumber() {
//		
//			int numZeros = 7 - String.valueOf(this.number).length();
//			StringBuilder sb = new StringBuilder();
//			for(int i = 0; i < numZeros; i++)
//				sb.append('0');
//			return String.format("%s%d", sb, this.number);
//		
//	}




    public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}


	public Date getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
