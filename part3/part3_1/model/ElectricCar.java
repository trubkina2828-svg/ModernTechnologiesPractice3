package part3.part3_1.model;

import part3.part3_1.interfaces.Electric;

public class ElectricCar extends Car implements Electric {
    private double batteryLevel;
    private final double maxRangeKm;

    public ElectricCar(
        String brand, String model, int year, double fuelLevel, int doors, boolean automatic,
        double batteryLevel, double maxRangeKm
    ) {
        super(brand, model, year, fuelLevel, doors, automatic);
        this.batteryLevel = batteryLevel;
        this.maxRangeKm = maxRangeKm;
    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public double getRangeKm() {
        // TODO: запас хода = maxRangeKm * batteryLevel.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return maxRangeKm * (batteryLevel / 100.0);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    @Override
    public void charge(double hours) {
        // TODO: +20% в час, максимум 100%.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double chargeIncrease = hours * 20.0;
        batteryLevel = Math.min(100.0, batteryLevel + chargeIncrease);
        System.out.println(getBrand() + " " + getModel() + " charging... Battery level: " +
                String.format("%.1f%%", batteryLevel));
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    @Override
    public double getFuelConsumption() {
        return 0.0;
    }

    @Override
    public String getType() {
        return "ElectricCar";
    }
}
