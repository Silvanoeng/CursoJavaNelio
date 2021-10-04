package curso.nelio;

public class Triangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangle(double ladoA, double ladoB, double ladoc) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoc;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double areaDoTriangle() {
        double p = (this.ladoA + this.ladoB + this.ladoC) / 2.0;
        double areaX = Math.sqrt(p * (p - this.ladoA) * (p - this.ladoB) * (p-this.ladoC));
        return areaX;
    }


    public void compararTriangle(Triangle triangle){
        if(this.areaDoTriangle()>triangle.areaDoTriangle()) {
            System.out.printf("Triangle area: %.4f%n", this.areaDoTriangle());
        }
        else {
            System.out.printf("Triangle area: %.4f%n", triangle.areaDoTriangle());
        }
    }
}

