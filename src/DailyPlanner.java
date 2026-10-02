public class DailyPlanner extends Planner {

    private String date;

    public DailyPlanner(PlannerRenderer renderer, String date) {
        super(renderer);
        this.date = date;
    }

    @Override
    public void display() {

        renderer.renderTitle("Daily Planner - " + date);

        renderer.renderTask("Study Java");
        renderer.renderTask("Complete assignment");
        renderer.renderTask("Read 20 pages");

        renderer.renderDescription(
                "A productive day with a balanced schedule."
        );

        renderer.renderSeparator();
    }
}