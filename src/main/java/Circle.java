// Класс Circle, производныйй от класса TwoDShape, контрольное задание 2 глава 7

class TwoDShape {
    private double radius;

    // Параметризированный конструктор
    TwoDShape(double r) {
        radius = r;
    }

    // Методы доступа к закрытой переменной экземпляра radius
    double getRadius () {return  radius ;}
    void setRadius (double r) {radius = r;}

    void showDim (){
        System.out.println("Радиус окружности  " + radius );
    }
}

// Подкласс производный от класса TwoDShape
class Circle extends TwoDShape {
    private String style;

    // Конструктор с одним аргументом для построения токружности
    Circle (double x) {
        super(x); //Вызвать конструктор суперкласса
        style ="Зелёный цвет";
    }

    double area() {
        return getRadius() * getRadius()*3.14;
    }

    void showStyle (){
        System.out.println("Окружность " + style);
    }
}

class  CircleDemo {
    public static void main(String arg []) {
        Circle s = new Circle(10.0);
        System.out.println("Информация о фигуре ");
        s.showStyle();
        s.showDim();
        System.out.println("Площадь - " + s.area()+ " см.кв.");
    }
}