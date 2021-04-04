package sastsy.project.dentalpass;

import java.util.ArrayList;

public class Tooth {

    public String name;
    public boolean[] state;
    public int number;

    String[] name_list = {"Третий моляр (зуб мудрости)", "Второй моляр", "Первый моляр", "Второй премоляр",
    "Первый премоляр", "Клык", "Боковой резец", "Центральный резец"};


    public Tooth(int number) {
        if (number <= 8 || number >= 17 && number <= 24) {
            if (number / 8 == (float) number / 8) this.name = name_list[7];
            else this.name = name_list[8 - (8 * (number / 8 + 1) - number) - 1];
        }
        else {
            if (number / 8 == (float) number / 8) this.name = name_list[0];
            else this.name = name_list[8 * (number / 8 + 1) - number];
        }
        this.number = number;
        this.state = new boolean[9];
    }
}
