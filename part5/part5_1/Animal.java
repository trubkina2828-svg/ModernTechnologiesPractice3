package part5.part5_1;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected int energyLevel;

    protected Animal(String name, int age, double weight, int energyLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = energyLevel;
    }

    public void eat(int calories) {
        // TODO: увеличьте energyLevel, но не выше 100.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int energyIncrease = calories / 10; // 10 калорий = 1 единица энергии
        energyLevel = Math.min(100, energyLevel + energyIncrease);
        System.out.println(name + " поел(а). Энергия: " + energyLevel);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public void sleep(int hours) {
        // TODO: увеличьте energyLevel в зависимости от часов, но не выше 100.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int energyIncrease = hours * 5; // 5 единиц энергии в час
        energyLevel = Math.min(100, energyLevel + energyIncrease);
        System.out.println(name + " поспал(а) " + hours + " ч. Энергия: " + energyLevel);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public abstract void makeSound();

    public int getEnergyLevel() {
        return energyLevel;
    }

    public String getName() {
        return name;
    }
}
