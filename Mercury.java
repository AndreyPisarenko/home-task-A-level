package ua.com.solSys;

public class Mercury implements Planet {

    @Override
    public void USP() {
        System.out.println("Ускорение свободного падения на Меркурии = " + 3.7 + "м/с");
    }

    @Override
    public void inform() {
        System.out.println("Меркурий — ближайшая к Солнцу планета Солнечной системы, наименьшая из планет земной группы. " +
                "Названа в честь древнеримского бога торговли — быстрого Меркурия, поскольку она движется по небу быстрее других планет. " +
                "Её период обращения вокруг Солнца составляет всего 87,97 дней — самый короткий среди всех планет Солнечной системы.");
    }

    public static void main(String[] args) {
        Mercury mercury = new Mercury();
        mercury.USP();
        mercury.inform();
    }
}
