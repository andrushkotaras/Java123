public class DentalStudents extends Students {

    DentalStudents ( String sex, int number){
        this.sex = sex;
        this.number = number;
    }
    public void getYearsOfStudy(){
        System.out.println("5 years of study");
    }
    public void getSex(){
        System.out.println(sex);
    }
    public void getNumber (){
        System.out.println(number);
    }
    @Override
    public void fullInfo() {
        getYearsOfStudy();
        getSex();
        getNumber();
    }
}
