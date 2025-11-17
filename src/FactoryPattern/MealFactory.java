package FactoryPattern;

import BuilderPattern.PlanAlimentar;

public class MealFactory {
    public static PlanAlimentar createPlanAlimentar(MealType mealType) {
        switch (mealType) {
            case CUTTING:  return new PlanAlimentar.Builder("salată", "grepfruit", "pui", "fără sare")
                    .ovaz(1)
                    .gratar(1)
                    .desert(0)
                    .build();
            case BULKING: return new PlanAlimentar.Builder("cartofi", "banane", "vită", "normal")
                    .piure(2)
                    .pizza(1)
                    .omleta(3)
                    .gratar(2)
                    .desert(1)
                    .build();
            case MAINTENANCE:    return new PlanAlimentar.Builder("legume mixte", "mere", "curcan", "puțină sare")
                    .omleta(1)
                    .gratar(1)
                    .ovaz(1)
                    .build();
            default:
                throw new IllegalArgumentException("Tip de masă necunoscut");
        }
    }
}