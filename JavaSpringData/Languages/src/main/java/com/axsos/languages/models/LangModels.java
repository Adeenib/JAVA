package com.axsos.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="languages")
public class LangModels {
	@Id
   	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	private Long id;
	@NotNull
    @Size(min = 2, max = 20)
    private String Name;
	public void setId(Long id) {
		this.id = id;
	}
	@NotNull
    @Size(min = 2, max = 20)
    private String Creator;
	@NotNull
	private Double Version;
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	public LangModels() {
	
	}
	public LangModels(String name,String creator,Double version) {
		super();
		Name = name;
		Creator = creator;
		Version = version;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCreator() {
		return Creator;
	}
	public void setCreator(String creator) {
		Creator = creator;
	}
	public Double getVersion() {
		return Version;
	}
	public void setVersion(Double version) {
		Version = version;
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
