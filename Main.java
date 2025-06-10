public final class Constants {
    public static final double PI = 3.14159;
    public static final String APP_NAME = "OOP Trainer";

    // Final class cannot be extended
}

public class BaseCalculator {
    // Final method cannot be overridden
    public final void displayAppName() {
        System.out.println("App: " + Constants.APP_NAME);
    }

    public void calculateSomething() {
        System.out.println("Doing some base calculation...");
    }
}


public class AdvancedCalculator extends BaseCalculator {
    @Override
    public void displayAppName() { // ❌ ERROR: Cannot override final method
        System.out.println("Hacked App Name");
    }
}

public class Main {
    public static void main(String[] args) {
        BaseCalculator calc = new BaseCalculator();
        calc.displayAppName(); // Uses final method
        calc.calculateSomething();

        System.out.println("PI: " + Constants.PI);
    }
}

