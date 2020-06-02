class Project{
    private String name;
    private String description;
    private Double initialCost;

    public Project(){
    }

    public Project(String name){
        this.setName(name);
    }

    public Project(String name, String description){
        this.setName(name);
        this.setDescription(description);
    }

    public Project(String name, String description, Double cost){
        this.setName(name);
        this.setDescription(description);
        this.setCost(cost);
    }

    public void setCost(Double cost){
        this.initialCost = cost;
    }

    public Double getCost(){
        return this.initialCost;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String desc){
        this.description = desc;
    }

    public String getDescription(){
        return this.description;
    }

    public String elevatorPitch(){
        return getName() + "(" + getCost() + ")" + " : " + getDescription();
    }
}