class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter {
    private boolean spellPrepared = false;
    
    public String toString() {
        return "Fighter is a Wizard";
    }
    
    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }
    
    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }
}