public class RestRoom {
    private int bathtub;
    private int temperature;
    private String closetBrand;
    private int shower;

    public RestRoom(int bathtub, int temperature, String closetBrand, int shower) {
        this.bathtub = bathtub;
        this.temperature = temperature;
        this.closetBrand = closetBrand;
        this.shower = shower;
    }

    public void waterTemperature(int temperature) {
        this.temperature += temperature;
        if (temperature < 30) {
            System.out.println("Cold water");
        } else if (temperature >= 30 && temperature < 60) {
            System.out.println("Warm water");
        } else {
            System.out.println("Hot water");
        }
    }

    public int getBathtub() {
        return bathtub;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getClosetBrand() {
        return closetBrand;
    }

    public int getShower() {
        return shower;
    }
}
