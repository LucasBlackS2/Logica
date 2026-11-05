void main() {
    Scanner sc = new Scanner(System.in);
    final int N = 3;
    double[] alturas = new double[N];
    double maior = 0, menor = 0, soma = 0;

    for (int i = 0; i < N; i++) {
        IO.print("Altura da pessoa " + (i + 1) + ": ");
        alturas[i] = sc.nextDouble();
        if (i == 0 || alturas[i] > maior) maior = alturas[i];
        if (i == 0 || alturas[i] < menor) menor = alturas[i];
        soma += alturas[i];
    }

    double media = soma / N;
    int abaixoDaMedia = 0;
    for (int i = 0; i < N; i++) {
        if (alturas[i] < media) abaixoDaMedia++;
    }

    IO.println("Maior altura: " + maior);
    IO.println("Menor altura: " + menor);
    IO.println("Média das alturas: " + media);
    IO.println("Pessoas abaixo da média: " + abaixoDaMedia);
    sc.close();
}

