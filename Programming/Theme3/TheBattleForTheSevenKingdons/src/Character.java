public class Character {

    //PROPERTIES
    private CharacterType characterType;
    private Intelligence intelligence;
    private Force force;
    private Leadership leadership;
    private Arms arms;

    //CONSTRUCTOR
    public Character(CharacterType characterType, Intelligence intelligence, Force force, Leadership leadership, Arms arms) {
        this.characterType = characterType;
        this.intelligence = intelligence;
        this.force = force;
        this.leadership = leadership;
        this.arms = arms;
    }

    //GETTER and SETTER

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public Force getForce() {
        return force;
    }

    public void setForce(Force force) {
        this.force = force;
    }

    public Leadership getLeadership() {
        return leadership;
    }

    public void setLeadership(Leadership leadership) {
        this.leadership = leadership;
    }

    public Arms getArms() {
        return arms;
    }

    public void setArms(Arms arms) {
        this.arms = arms;
    }

    // Method for calculating the total sum of skills
    public int calculateTotalSkills() {
        return this.force.getForce() + this.intelligence.getIntelligence() + this.leadership.getLeadership() + this.arms.getArms();
    }

    // Method for calculating damage based on skills
    public int calculateDamage() {
        int totalSkills = calculateTotalSkills();

        // Here you can define a damage system based on the sum of the skills
        if (totalSkills <= 50) {
            return 10;  // Low damage
        } else if (totalSkills <= 100) {
            return 20;  // Media damage
        } else if (totalSkills <= 150) {
            return 40;  // High damage
        } else {
            return 60;  //
        }
    }
}
