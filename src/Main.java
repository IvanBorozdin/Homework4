public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задания 1");
        }
        int age = 15;
        if (age >= 18) {
            System.out.println("Совершеннолетний ");
        } else {
            System.out.println("Нужно немного подождать");
        }

        {System.out.println("Задания 2");}
        int temperature = 4;
        if (temperature >=5){
            System.out.println("Сегодня тепло, можно идти без шапки");
        }else {System.out.println("На улице холодно, нужно надеть шапку"); }



        {System.out.println("Задания 3");}
        int speed=50;
        if(speed>=60){System.out.println("придется заплатить штраф");}
        else {System.out.println("можно ездить спокойно");}

        {System.out.println("Задания 4");}
        int ageOfThePerson = 13;
        if(ageOfThePerson>=2 && ageOfThePerson<=6){
            System.out.println("нужно ходить в детский сад");
        }if (ageOfThePerson>7 && ageOfThePerson<=18){
            System.out.println("нужно ходить в школу");
        }if(ageOfThePerson>18 && ageOfThePerson>24){
            System.out.println("место в университете");
        }if (ageOfThePerson>24){
            System.out.println("пора ходить на работу");
        }
        {System.out.println("Задания 5");}
        int ageOfTheChild = 14;
        if (ageOfTheChild<5){
            System.out.println("не может кататься на аттракционе");
        }if (ageOfTheChild>=5 && ageOfTheChild<14){
            System.out.println("может кататься только в сопровождении взрослого");
        }if (ageOfTheChild>=14){
            System.out.println("может кататься без сопровождения взрослого");
        }
        {System.out.println("Задания 6");}
        int totalSeats=102;
        int seats=65;
        int standingPlaces=43;
        if( seats<=60 || standingPlaces<=42 )
        {
            System.out.println("есть место в вагоне" );
        }else {
            System.out.println("вагон уже полностью забит");
        }
        {
            System.out.println("Задания 7");
        }
        int one =13;
        int two = 57;
        int three = 56;
        if (one>=two && one>=three ) {
            System.out.println("Число "+one+" большее из трех чисел");
        } else if (two>=one && two>=three){
            System.out.println("Число "+two+" большее из трех чисел");
        } else {
            System.out.println("Число "+three+" большее из трех чисел");
        }



    }
}