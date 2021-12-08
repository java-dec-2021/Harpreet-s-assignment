public class Project {
    private String name;
    private String description;
// methods
    public String elevatorPitch(){
        return this.name + ":" + this.description;
    }
//  overload constructor method in 3 ways
    public Project() {
        this.name = "Please provide a name";
        this.description = "Please provide a description";
    }
    public Project(String name){
        this.name = name;
        this.description = "Please provide a description";
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
// create getter and setter for each field
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description= description;
    }


}


