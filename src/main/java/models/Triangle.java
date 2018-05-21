package models;

public class Triangle {
    public int sideA;
    public int sideB;
    public int sideC;

    public String triangleChecker(){
        if (this.sideA > this.sideB + this.sideC || this.sideB > this.sideA + this.sideC || this.sideC > this.sideA + this.sideB){
            return "not a triangle";
        } else if (this.sideA == this.sideB && this.sideB == this.sideC){
            return "equilateral";
        } else if (this.sideA == this.sideB || this.sideB == this.sideC || this.sideA == this.sideC){
            return "isoceles";
        } else {
            return "scalene";
        }
    }

//    public String triangleChecker(int sideA, int sideB, int sideC){
//        if (sideA > sideB + sideC || sideB > sideA + sideC || sideC > sideA + sideB){
//            return "not a triangle";
//        } else if (sideA == sideB && sideB == sideC){
//            return "equilateral";
//        } else if (sideA == sideB || sideB == sideC || sideA == sideC){
//            return "isoceles";
//        } else {
//            return "scalene";
//        }
//    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}


