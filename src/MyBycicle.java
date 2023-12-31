import java.util.List;

public class MyBycicle implements IBycicle {
    @Override
    public void f1(List<Bycicle> a) {
        // remove the cheapest bycicle
        float min = Float.MAX_VALUE;
        int index = 0;
        Bycicle bycicle = new Bycicle();
        for (int i = 0; i < a.size(); i++) {
            bycicle = (Bycicle) a.get(i);
            if (bycicle.getPrice() < min) {
                min = bycicle.getPrice();
                index = i;
            }
        }
        a.remove(index);
    }
    @Override
    public int f2(List<Bycicle> a, String name) {
        // count and return number and index of bycicles name contains 'name' with case-insensitive, name contain both numbers and letters
        int count = 0;
        for (Bycicle value : a) {
            if (((Bycicle) value).getName().toLowerCase().contains(name.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}
