package ua.com.solSys;

public class Earth implements Planet{
    @Override
    public void USP() {
        System.out.println("Ускорение свободного падения на Земле = " + 9.807 + "м/с");
    }

    @Override
    public void inform() {
        System.out.println("Земля - третья по удалённости от Солнца планета Солнечной системы. " +
                "Самая плотная, пятая по диаметру и массе среди всех планет и крупнейшая среди планет земной группы, в которую входят также Меркурий, Венера и Марс. " +
                "Единственное известное человеку в настоящее время тело Солнечной системы в частности и Вселенной вообще, населённое живыми организмами.");

    }

    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.USP();
        earth.inform();
    }
}
