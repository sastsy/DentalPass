package sastsy.project.dentalpass;

public class Tooth {

    public String name;
    public String[] state;
    public int number;
    public int list_number;

    String[] name_list = {"Третий моляр (зуб мудрости)", "Второй моляр", "Первый моляр", "Второй премоляр",
    "Первый премоляр", "Клык", "Боковой резец", "Центральный резец"};


    public Tooth(int number) {
        /*if (number / name_list.length != (float) number / name_list.length) list_number = number / name_list.length + 1;
        else list_number = number / name_list.length;
        if (number <= 8 || number >= 16 && number <= 24) this.name = name_list[name_list.length - (list_number * name_list.length - number)];
        else this.name = name_list[list_number * name_list.length - number];*/
        if (number <= 8 || number >= 17 && number <= 24) {
            if (number / 8 == (float) number / 8) this.name = name_list[7];
            else this.name = name_list[8 - (8 * (number / 8 + 1) - number) - 1];
        }
        else {
            if (number / 8 == (float) number / 8) this.name = name_list[0];
            else this.name = name_list[8 * (number / 8 + 1) - number];
        }
        this.number = number;
    }
}
