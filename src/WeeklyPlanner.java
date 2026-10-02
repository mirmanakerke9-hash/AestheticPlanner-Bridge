public class WeeklyPlanner extends Planner {

    private String week;

    public WeeklyPlanner(PlannerRenderer renderer, String week) {
        super(renderer);
        this.week = week;
    }

    @Override
    public void display() {

        renderer.renderTitle("Weekly Planner - " + week);

        renderer.renderTask("Monday - Study");
        renderer.renderTask("Tuesday - Programming");
        renderer.renderTask("Wednesday - Exercise");
        renderer.renderTask("Thursday - Project");
        renderer.renderTask("Friday - Review");

        renderer.renderDescription(
                "A simple weekly plan for staying organized."
        );

        renderer.renderSeparator();
    }
}