package sastsy.project.dentalpass;

public class Tooth {

    public final String name;
    public String state;
    private final int number;
    int list_number;

    String[] name_list = {"Третий моляр (зуб мудрости)", "Второй моляр", "Первый моляр", "Второй премоляр",
    "Первый премоляр", "Клык", "Боковой резец", "Центральный резец"};


    public Tooth(int number) {
        /*if (number / name_list.length != (float) number / name_list.length) list_number = number / name_list.length + 1;
        else list_number = number / name_list.length;
        this.name = name_list[list_number * name_list.length - number];*/
        if (number <= 8 || number >= 16 && number <= 24) {
            if (number % name_list.length == 0) this.name = name_list[7];
            else this.name = name_list[number % name_list.length];
        }
        else {
            if (number % name_list.length == 0) this.name = name_list[-number];
            else this.name = name_list[(number / name_list.length + 1) * name_list.length - number];
        }
        this.number = number;
    }
}
