/**
 * @author Tri Nguyen, Leonard Winter
 **/

public class MathPlotter {
    //static double beginn, schrittweite, ende;

    public static void main(String[] args) {
        double beginn, schrittweite, ende;
        //String function = MyIO.promptAndRead("Enter a function: ");
        //String[] functionParts = { "sin", "cos", "tan", "log", "exp", "sqrt", "square", "cube", "quad", "tower" };
        // all of these functions are already implemented in the MyMath class
        while (true) {
            String input = MyIO.promptAndRead("Enter an operation: ");
            if (input.equals("stop")) {
                break;
            }
            D2Method m;
            switch (input) {
                case "sin":
                    m = new D2Method() {
                        public double compute(double a) {
                            return MyMath.sin(a);
                        }
                    };
                    break;
                case "cos":
                m = new D2Method() {
                    public double compute(double a) {
                        return MyMath.cos(a);
                    }
                };
                    break;
                case "atan":
                m = new D2Method() {
                    public double compute(double a) {
                        return MyMath.atan(a);
                    }
                };
                    break;
                case "log":
                m = new D2Method() {
                    public double compute(double a) {
                        return MyMath.log(a);
                    }
                };
                    break;
                case "exp":
                m = new D2Method() {
                    public double compute(double a) {
                        return MyMath.exp(a);
                    }
                };
                    break;
                case "sqrt":
                m = new D2Method() {
                    public double compute(double a) {
                        return MyMath.sqrt(a);
                    }
                };
                    break;
                case "square":
                m = new D2Method() {
                        public double compute(double a) {
                            return MyMath.square(a);
                        }
                    };
                    break;
                case "cube":
                 m = new D2Method() {
                        public double compute(double a) {
                            return MyMath.cube(a);
                        }
                    };
                    break;
                case "quad":
                 m = new D2Method() {
                        public double compute(double a) {
                            return MyMath.quad(a);
                        }
                    };
                    break;
                case "tower":
                 m = new D2Method() {
                        public double compute(double a) {
                            return MyMath.powerTower(a,3);
                        }
                    };
                    break;
                default:
                    MyIO.writeln("Invalid operation");
                    continue;
            }
            beginn = MyIO.readDouble("Enter a start value: ");
            schrittweite = MyIO.readDouble("Enter a step value: ");
            ende = MyIO.readDouble("Enter an end value: ");
            for(; beginn <= ende; beginn += schrittweite) {
                MyIO.writeln(beginn+" -> "+m.compute(beginn) + " ");
            }
        }
    }
}