package company.lesson1;

import java.util.*;

public class Example {
    public static <T> void change(T[] obj, int n1, int n2) {
        T n = obj[n1];
        obj[n1] = obj[n2];
        obj[n2] = n;
        System.out.println(Arrays.toString(obj));
    }

    public static <T> void arraylist(T[] obj) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(obj));
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        System.out.println("task_1");
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"};
        change(arr1, 0, 4);
        change(arr2, 0, 2);

        System.out.println("");

        System.out.println("task_2");
        arraylist(arr1);

        System.out.println("");

        System.out.println("task_3");

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        System.out.println("Первая коробка с апельсинами - " + orangeBox1.getWeight());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox1.pourFruit(orangeBox2);
        System.out.println("Вторая коробка с апельсинами - " + orangeBox2.getWeight());
        System.out.println("Первая коробка после пересыпания - " + orangeBox1.getWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Коробка с яблоками - " + appleBox.getWeight());

        System.out.println("Равен ли вес коробок ? - " + appleBox.compare(orangeBox1));
    }

    public static <T> T switchArrayItem(List<T> array) {
        if ((Objects.nonNull(array)) & (array.size() > 1)) {
            T temp = array.get(1);
            array.set(1, array.get(0));
            array.set(0, temp);
        }
        return (T) array;
    }

    public static <T> ArrayList<T> convertMasToArrayList(T mas) {
        ArrayList<T> result = new ArrayList<T>(Collections.unmodifiableList(Arrays.asList(mas)));
        return result;
    }
}