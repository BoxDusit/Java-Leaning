public class Health {
    private char gender;
    private int age;
    private double height;
    private double weight;
    private int act_level;

    public Health(char gender, int age, double height, double weight, int act_level) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.act_level = act_level;
    }

    // คำนวณ BMI
    public double calBMI() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    // คำนวณ BMR
    public int calBMR() {
        double bmr;
        if (gender == 'm') {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else {
            bmr = 665 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }
        return (int) bmr;
    }

    // คำนวณ TDEE
    public int calTDEE(int bmr) {
        double factor = switch (act_level) {
            case 0 -> 1.2;
            case 1 -> 1.375;
            case 2 -> 1.55;
            case 3 -> 1.725;
            case 4 -> 1.9;
            default -> 1.2;
        };
        return (int) (bmr * factor);
    }
}

