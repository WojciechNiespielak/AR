public class Character {

    String name;
    String gender;
    int level;
    int windsome;
    int inteligence;
    int charming;

Character (String name, String gender){

    this.name=name;
    this.gender=gender;
this.level=1;
this.windsome=1;
this.charming=1;
this.inteligence=1;
}

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setCharming(int charming) {
        this.charming = charming;
    }
}
