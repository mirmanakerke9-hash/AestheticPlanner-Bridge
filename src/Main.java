public class Main {

    public static void main(String[] args) {

        PlannerRenderer pastelRenderer = new PastelRenderer();
        PlannerRenderer minimalRenderer = new MinimalRenderer();

        System.out.println(" AESTHETIC PLANNER ");

        System.out.println("\n DAILY PLANNER: PASTEL STYLE ");

        Planner dailyPlanner =
                new DailyPlanner(pastelRenderer, "October 2, 2026");

        dailyPlanner.display();


        System.out.println("\n SWITCHING TO MINIMAL STYLE ");

        dailyPlanner.setRenderer(minimalRenderer);

        dailyPlanner.display();


        System.out.println("\n WEEKLY PLANNER: PASTEL STYLE ");

        Planner weeklyPlanner =
                new WeeklyPlanner(pastelRenderer, "October 1-7, 2026");

        weeklyPlanner.display();


        System.out.println("\n WEEKLY PLANNER: MINIMAL STYLE ");

        weeklyPlanner.setRenderer(minimalRenderer);

        weeklyPlanner.display();
    }
}