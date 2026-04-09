class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

enum CargoType {
    PETROLEUM,
    COAL,
    GRAINS
}

abstract class GoodsBogie {
    protected CargoType cargo;

    public abstract String getShape();

    public void assignCargo(CargoType cargoType) {
        try {
            validateCargo(cargoType);
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully -> " + cargoType);
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo validation completed for " + getShape() + " bogie");
        }
    }

    private void validateCargo(CargoType cargoType) {
        if (cargoType == CargoType.PETROLEUM && getShape().equalsIgnoreCase("Rectangular")) {
            throw new CargoSafetyException("Unsafe cargo assignment!");
        }
    }
}

class CylindricalBogie extends GoodsBogie {
    public String getShape() {
        return "Cylindrical";
    }
}

class RectangularBogie extends GoodsBogie {
    public String getShape() {
        return "Rectangular";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("=======================================\n");

        GoodsBogie cylindrical = new CylindricalBogie();
        cylindrical.assignCargo(CargoType.PETROLEUM);

        System.out.println();

        GoodsBogie rectangular = new RectangularBogie();
        rectangular.assignCargo(CargoType.PETROLEUM);

        System.out.println();

        System.out.println("UC15 runtime handling completed...");
    }
}