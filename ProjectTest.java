
class ProjectTest{
    public static void main(String[] args){
        Project p = new Project();
        p.setName("My Project");
        p.setDescription("This is my project");
        p.setCost(10000.0);
        System.out.println(p.elevatorPitch());

        Project p1 = new Project();
        p1.setName("Second project");
        p1.setDescription("This is my second project");
        p1.setCost(1200000.0);

        Portfolio portfolio = new Portfolio();
        portfolio.addProject(p);
        portfolio.addProject(p1);

        portfolio.showPortfolio();

    }
}