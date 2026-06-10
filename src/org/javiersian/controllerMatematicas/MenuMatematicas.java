package org.javiersian.controllerMatematicas;

public class MenuMatematicas {
    
    public double calcularSalario(double horas, double pago) { return horas * pago; }
    public double areaTriangulo(double base, double altura) { return (base * altura) / 2.0; }
    public double promedioAcademico(double n1, double n2, double n3) { return (n1 + n2 + n3) / 3.0; }
    public double convertidorTemperatura(double c) { return (c * 9.0 / 5.0) + 32; }
    public double perimetroCirculo(double radio) { return 2 * Math.PI * radio; }
    public double volumenCilindro(double radio, double altura) { return Math.PI * Math.pow(radio, 2) * altura; }
    public double calcularHipotenusa(double a, double b) { return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); }
    public int diasAMinutos(int dias) { return dias * 24 * 60; }
    public double restoDivision(double dividendo, double divisor) { return dividendo % divisor; }
    public int potenciaAlCubo(int numero) { return (int) Math.pow(numero, 3); }
}