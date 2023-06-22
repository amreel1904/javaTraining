package day8;

import java.util.Scanner;

public class AwekInfo {
    private String negeri;
    private String kerja;
    private int umur;

    public String getNegeri() {
        return this.negeri;
    }

    public void setNegeri(String negeri) {
        this.negeri = negeri;
    }

    public String getKerja() {
        return this.kerja;
    }

    public void setKerja(String kerja) {
        this.kerja = kerja;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String toString() {
        return String.format("AWEK DARI %s KERJA AS %s UMUR %d", this.negeri, this.kerja, this.umur);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AwekInfo awek = new AwekInfo();

        System.out.print("Enter negeri: ");
        String negeri = scanner.nextLine();
        awek.setNegeri(negeri);

        System.out.print("Enter kerja: ");
        String kerja = scanner.nextLine();
        awek.setKerja(kerja);

        System.out.print("Enter umur: ");
        int umur = scanner.nextInt();
        awek.setUmur(umur);

        System.out.println(awek.toString());

        scanner.close();
    }
}
