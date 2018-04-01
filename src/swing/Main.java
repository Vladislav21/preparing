package swing;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {

            String select = JOptionPane.showInputDialog("1 - Старт\n" + "2 - Выход\n", "Введите одно из предложенных чисел");
            int selectI = Integer.parseInt(select);

            switch (selectI) {
                case 1:
                    String fn = JOptionPane.showInputDialog("Введите первое число");
                    String fs = JOptionPane.showInputDialog("Введите второе число");
                    int first = Integer.parseInt(fn);
                    int second = Integer.parseInt(fs);
                    int dif = Math.abs(first - second);
                    JOptionPane.showMessageDialog(null, "Разность двух чисел = " + dif, "Тест 1", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    flag = false;
                    break;
            }

        }
    }
}
