import java.util.*;
public class ProjectClass{
    private String name;
    private String description;
    private double initialCost;
    private static String defaultName = "Default NAME";
    private static String defaultDesc = "DEfault DesC";
    public ProjectClass() {
       name = defaultName;
      description=defaultDesc;
    }
    public   ProjectClass(String name) {
        this.name=name;
        this.description=defaultDesc;
    }
    public ProjectClass(String name,String description) {
        this.name = name;
        this.description=description;
        
    }
    public  String elevatorPitch(){
        return this.name +":"+this.description;
    }
    public  String getName(){
        return this.name;
    }
    public  String getDescription(){
        return this.description;
    }
    public  void setName(String name){
        this.name=name;

    }
    public  void setDescription(String description){
        this.description=description;

    }
    
}