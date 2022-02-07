package Bilingual_Fourth_task;

/**
 *
 * @author mohamed
 */
import java.time.LocalTime;

public abstract class Course {

    private String name, id, teacher;
    private LocalTime duration;

    public void setName(String name) {
        if (name.length() >= 4) {
            this.name = name;
        }
    }

    public void setTeacher(String teacher) {
        int account = 0;
        for (int i = 0; i == teacher.length(); i++) {
            if (teacher.charAt(i) == ' ' && account == 0) {
                this.teacher=teacher;
                account++;
                teacher.replace(" ", ",");
            }
        }
    }

    public void setID(String id) {
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(0) == name.charAt(0)) {
                if (id.charAt(id.length() - 1) == teacher.charAt(teacher.length() - 1)) {
                    this.id = id;
                }else{
                    System.err.println("Error, the id is invalid");
                }
            }else{
                System.err.println("Error");
            }
            }
    }
    
    public void setDuration(LocalTime duration){
        if(duration.getHour()>=30){
            this.duration=duration;
        }else{
            System.err.println("Error, the duration is invalid");
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
    
    public LocalTime getDuration(){
        return duration;
    }
    
    public String toString(){
        return "the course" + this.name + "with an id"+this.id + "is with a duration"+ this.duration + "of which is taught by the teacher" + this.teacher;
    }
    
    public Course clone(Course clone){
        this.name=clone.name;
        this.id=clone.id;
        this.duration=clone.duration;
        this.teacher=clone.teacher;
        
        return clone;
    }
    public boolean equals(Course other){
        if(this.name==other.name && this.duration==other.duration && this.teacher==other.teacher && this.id==other.id){
            return true;
        }
        return false;
    }
    
    
    
    
}
