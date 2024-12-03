package Programming.Unit1.Theme2.POO.src.Exercise2;


public class Runner {

    //PROPERTIES
    private String name;
    private TypeSex sex;
    private Birthday birthday;
    private Hour hour;
    public final static String MALE= "male", FEMALE ="female";

    //CONSTRUCTOR
    public Runner(String name, TypeSex sex, Birthday birthday, Hour hour){
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.hour = hour;
    }

    //GETTER and SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeSex getSex() {
        return sex;
    }

    public void setSex(TypeSex sex) {
        this.sex = sex;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public Hour getHour() {
        return hour;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }

    //TOSTRING
    public String toString(){
        return "===RUNNER INFORMATION===" +
                "\nName = " + name +
                "\nSex = " + sex +
                "\nBirthday = " + birthday +
                "\nHour = " + hour;
    }

    //Method to know if the runner is an adult
    public String isOld(){
        String message;
        if (birthday.isAnAdult()){
            System.out.println();
            message = "----Is an adult the runner?----\n (The runner is an adult) Age =  ";
        }else {
            System.out.println();
            message = "----Is an adult the runner?----\n (The runner is a child) Age = ";
        }

        return message + birthday.age() ;
    }
}
