public class PastelRenderer implements PlannerRenderer {

    @Override
    public void renderTitle(String title) {
        System.out.println(" ");
        System.out.println(" " + title + " ");
        System.out.println(" ");
    }

    @Override
    public void renderTask(String task) {
        System.out.println(" " + task);
    }

    @Override
    public void renderDescription(String description) {
        System.out.println(" " + description);
    }

    @Override
    public void renderSeparator() {
        System.out.println(" ");
    }
}