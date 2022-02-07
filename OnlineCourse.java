/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fourth_Task.Github;

/**
 *
 * @author ismael
 */
public abstract class OnlineCourse {
    String name;
    String id;
    int duration;
    String teacher;
    
    
    
public OnlineCourse(){
        name="";
        id="";
        duration=0;
        teacher="";
        
    }
    
public OnlineCourse(String nameCours, String idCours, int durationCours, String teacherCours){
        if(nameCours.length()>=4 && nameCours.length()>=40){
            this.name=nameCours;
        }else{
            System.err.println("Error");
        }
        
        int account=0;
        for(int i=0; i<teacherCours.length(); i++){
            if(teacherCours.charAt(i)==' ' && account==0){
                account++;
                teacherCours.replace(" ", ",");
                this.teacher=teacherCours;
        }
    }
        
        for(int i=0; i<idCours.length(); i++){
            if(idCours.charAt(0)==name.charAt(0)){
                if(idCours.charAt(idCours.length()-1)==teacher.charAt(teacher.length()-1)){
                   this.id=idCours; 
                }else{
                    System.err.println("Error");
                }
            }else{
                System.err.println("Error");
        }
        
        
    }
        
        if(durationCours>=30){
            this.duration=durationCours;
        }else{
            System.err.println("Error");
        }
    }
    
    

public OnlineCourse(OnlineCourse copy){
        name=copy.name;
        id=copy.id;
        duration=copy.duration;
        teacher=copy.teacher;
    }
    
    
    
    
    
    
    public void setName(String nameCours){
        if(nameCours.length()>=4 && nameCours.length()>=40){
            this.name=nameCours;
        }else{
            System.err.println("Error");
        }
    }
    
    public void setTeacher(String teacherCours){
        int account=0;
        for(int i=0; i<teacherCours.length(); i++){
            if(teacherCours.charAt(i)==' ' && account==0){
                account++;
                teacherCours.replace(" ", ",");
        }
    }
        this.teacher=teacherCours;
}
    
    public void setID(String idCours){
        for(int i=0; i<idCours.length(); i++){
            if(idCours.charAt(0)==name.charAt(0)){
                if(idCours.charAt(idCours.length()-1)==teacher.charAt(teacher.length()-1)){
                   this.id=idCours; 
                }else{
                    System.err.println("Error");
                }
            }else{
                System.err.println("Error");
            }
        }
        
    }
    
    
    public void setDuration(int durationCours){
        if(durationCours>=30){
            this.duration=durationCours;
        }else{
            System.err.println("Error");
        }
    }
    
    
    
    
    
    
    public String getName(){
        return name;
    }
    
    public String getTeacher(){
        return teacher;
    }
    
    public String getID(){
        return id;
    }
    
    public int getDuration(){
        return duration;
    }
    
    
    
    
    
    
    public String toString(){
        return "The cours of "+this.name+" with id " +this.id+ " have a "+ this.duration+" hours and the name of teacher is "+this.teacher;
    }
    
    public OnlineCourse clone(OnlineCourse other){
        this.name=other.name;
        this.id=other.id;
        this.duration=other.duration;
        this.teacher=other.teacher;
        
        return other;
    }
    
    public boolean equals(OnlineCourse other){
        if(this.name==other.name){
            if(this.id==other.id){
                if(this.duration==other.duration){
                    if(this.teacher==other.teacher){
                        return true;
                    }else{
                        System.err.println("Error");
                        return false;
                    }
                }else{
                    System.err.println("Error");
                    return false;
                }
            }else{
                System.err.println("Error");
                return false;
            }
        }else{
            System.err.println("Error");
            return false;
        }
    }
}
