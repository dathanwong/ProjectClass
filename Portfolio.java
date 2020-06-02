import java.util.ArrayList;

public class Portfolio {
    ArrayList<Project> projects;

    public Portfolio(){
        projects = new ArrayList<Project>();
    }

    public void addProject(Project project){
        projects.add(project);
    }

    public Project getProject(int index){
        return projects.get(index);
    }

    public Double getPortfolioCost(){
        Double cost = 0.0;
        for(Project project : projects){
            cost += project.getCost();
        }
        return cost;
    }

    public void showPortfolio(){
        for(Project project : projects){
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total Cost: " + getPortfolioCost());
    }
}