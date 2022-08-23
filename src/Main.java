public class Main {
    public static void main(String[] args) {
    double dog = 8;
    System.out.println(dog);
    double cat = 3.6;
    System.out.println(cat);
    int paper = 763789;
    System.out.println(paper);

    dog = dog + 4;
    System.out.println(dog);
    cat = cat + 4;
    System.out.println(cat);
    paper = paper +4;
    System.out.println(paper);

    dog = dog - 3.5;
    System.out.println(dog);
    cat = cat - 1.6;
    System.out.println(cat);
    paper = paper - 7639;

    int friend = 19;
    System.out.println(friend);
    friend = friend + 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);

    double frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog +4;
    System.out.println(frog);



     double boxer1 = 78.2;
     double boxer2 = 82.7;
     double totalWeightOfBoxer = boxer1 + boxer2;
        System.out.println("Общий вес бойцов: " + totalWeightOfBoxer + " кг.");

     double weightDifference = boxer2 % boxer1;
        System.out.println("Разница между весами бойцов состовляет: " + weightDifference + " кг!");

    /* short bananas = 80;
     short milk = 105;
     short iceCreamSundae = 100;
     short rawEggs = 70;
     double totalWeight = (((bananas * 5) + (milk * 2) + (iceCreamSundae * 2) + (rawEggs * 4) )/ 1000);
     System.out.println("Вес спорт-завтрака, равен: " + totalWeight + " кг.");
     */

     int totalHours = 640;
     int workingHours = 8;
     int totalEmployeesInTheCompany = totalHours / workingHours;
     System.out.println("Всего работников в компании - " + totalEmployeesInTheCompany + " человек");
     totalEmployeesInTheCompany = totalEmployeesInTheCompany + 94;
     int morePeople = totalHours / totalEmployeesInTheCompany;
     System.out.println("Если в компании работает " + totalEmployeesInTheCompany + " человек, то всего " + morePeople + " часов работы может быть поделено между сотруднтками");
    }
}
