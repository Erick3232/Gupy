public class Exercise4 {
    public static void main(String[] args) {
        double distancia = 100;
        double carroV = 110;
        double caminhaoV = 80;

        double temp = carroV / distancia;
        double temp2 = caminhaoV / distancia + 0.16;
        System.out.println("Tempo do carro: " + temp);
        System.out.println("Tempo do caminhão: " + String.format("%.2f", temp2));
        //O carro estará mais próximo, pois o caminhão tem mais 10 minutos para passar em pedágio
        // Adicionando mais 0.16 horas já que 1h --> 60 minutos então, x horas --> 10minutos == 0.16
    }
}
