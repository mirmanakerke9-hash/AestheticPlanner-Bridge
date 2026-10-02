public abstract class Planner {

    protected PlannerRenderer renderer;

    public Planner(PlannerRenderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(PlannerRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void display();
}