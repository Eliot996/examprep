package question5;

public class JuleGave {
    private boolean isSoft, isRectangular, doesRattle;

    public JuleGave() {
        this.isSoft = Math.random() > 0.5;
        this.isRectangular = Math.random() > 0.5;
        this.doesRattle = Math.random() > 0.5;
    }

    public boolean couldBeLego() {
        return isSoft && isRectangular && doesRattle;
    }

    public static void main(String[] args) {
        JuleGave juleGave = new JuleGave();
        System.out.println(juleGave.couldBeLego());
        System.out.println(juleGave.isRectangular);
        System.out.println(juleGave.isSoft);
        System.out.println(juleGave.doesRattle);
    }
}
