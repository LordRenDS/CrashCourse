package HW;

import java.util.*;

import static java.util.Map.entry;

public class HW5 {
}

class Task5_1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        ));
        OptionalDouble result = arr.stream().mapToInt(Integer::intValue).filter(x -> x % 2 != 0 && x % 5 == 0).average();
        if (result.isPresent()) {
            System.out.println(result.getAsDouble());
        }
    }
}

class Task5_2 {
    public static void main(String[] args) {
        String text = """
                It’s always darkest before the leopard’s kiss.

                Where there’s smoke there is emphasis.

                A bird in the hand is bound for the stove.

                The pen is no mightier than the soul.

                Never underestimate the nib of corruption.

                Better late than suffer the long introduction.

                All work and no play is the way of the sloth.

                If you can dream it bring the child the moth.

                He is not wise that parrots the wise.

                All that glitters has been revised.

                An idle mind is a sign of the time.

                The less things change the more we doubt design.""";

        Map<String, Integer> count_words = new HashMap<>();
        var splitText = text.replace(",", "")
                .replace(".", "")
                .replace("!", "")
                .replace("?", "")
                .replace("\n", " ")
                .split(" ");
        Arrays.stream(splitText).filter(word -> word.length() > 6).map(String::toLowerCase)
                .forEach(word -> count_words.put(word, count_words.getOrDefault(word, 0) + 1));
        //count_words.entrySet().forEach(System.out::println);
        System.out.println(count_words.size());
    }
}

class Task5_3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.ofEntries(
                entry("acknowledge", 12),
                entry("advantage", 5),
                entry("aid", 8),
                entry("beginning", 1),
                entry("bend", 99),
                entry("bike", 7),
                entry("carefully", 19)
        ));
        double result = map.entrySet().stream().filter(val -> val.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue).sum();
        System.out.println(result);
    }
}

class Task5_4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        ));
        String str = nums.toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", "");
        System.out.println(str);
    }
}

class Task5_5 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Billy", "Herinhton", 22),
                new Person("Van", "Darkholm", 25),
                new Person("Mihail", "Zubencov", 27)
        ));
        Optional<Person> result = personList.stream().filter(person -> person.getFirst_name().length() < 15)
                .max(Comparator.comparingInt(Person::getAge));
        Person older;
        if (result.isPresent()) {
            older = result.get();
            System.out.println(older.getFirst_name() + " " + older.getLast_name());
        }
    }
}

class Person {
    private String first_name, last_name;
    private int age;

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}