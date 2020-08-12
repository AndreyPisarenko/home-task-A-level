package ua.com.solSys;

public class Venus implements Planet {
    @Override
    public void USP() {
        System.out.println("Ускорение свободного падения на Венере = " + 8.87 + "м/с");
    }

    @Override
    public void inform() {
        System.out.println("Вене́ра — вторая по удалённости от Солнца планета Солнечной системы, наряду с Меркурием, Землёй и Марсом принадлежащая к семейству планет земной группы. " +
                "По ряду характеристик — например, по массе и размерам — Венера считается «сестрой» Земли. " +
                "Венерианский год составляет 224,7 земных суток. " +
                "Она имеет самый длинный период вращения вокруг своей оси - около 243 земных суток");
    }

    public static void main(String[] args) {
        Venus venus = new Venus();
        venus.USP();
        venus.inform();
    }
}
