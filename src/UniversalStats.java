import java.lang.reflect.Array;

public class UniversalStats {


//        Class Based Health
    public static int CBH(String species,String type){
        switch (species) {
            case "Kobold":
                        switch (type) {
                case "Common":
                    return 10;
                case "Warrior":
                    return 12;
                case "Shaman":
                    return 8;
                case "Giant":
                    return 14;
                default:
                    return 10;
    }
            case "Human":
                switch (type){
                    case "Fighter":
                        return 10;
                    case "Wizard":
                        return 6;
                    case "Ranger":
                        return 10;
                }

    default:
            return 10;
}
    }



//        Weapon Based Damage
    public static int WBD(String weapon){
        switch (weapon){
            case "Spear":
                return 6;
            case "Sling":
                return 4;
            case "Dagger":
                return 4;
            case "Short_Sword":
                return 6;
            case "Hand_Axe":
                return 4;
            case "Fists":
                return 2;
            case "Sword":
                return 8;
            case "Axe":
                return 6;
            case "Heavy_Branch":
                return 6;
            case "Great_Sword":
                return 10;
            case "Spell_Book":
                return 6;
            case "Short_Bow":
                return 6;
            default:
                return 4;
        }
    }



//        Class Based Weapon
public static String[] CBW(String species,String type){
        switch (species) {
            case "Kobold":
                switch (type) {
                    case "Common":
                        return CommonWeapons;
                    case "Warrior":
                        return WarriorWeapons;
                    case "Shaman":
                        return ShamanWeapons;
                    case "Giant":
                        return GiantWeapons;
                }
            case "Human":
                switch (type) {
                    case "Fighter":
                        return FighterStartingWeapons;
                    case "Wizard":
                        return WizardStartingWeapons;
                    case "Ranger":
                        return RangerStartingWeapons;
                }
            default:
                return CommonWeapons;
        }
}

private static String[] CommonWeapons = {"Dagger","Sling","Fists"};
private static String[] WarriorWeapons = {"Short_Sword","Spear","Hand_Axe"};
private static String[] ShamanWeapons = {"Magic_Staff","Bone_Shiv"};
private static String[] GiantWeapons = {"Sword","Heavy_Branch","Axe"};
private static String[] FighterStartingWeapons = {"Sword","Great_Sword","Axe"};
private static String[] WizardStartingWeapons = {"Spell_Book"};
private static String[] RangerStartingWeapons = {"Short_Bow"};


//        Enemy Type Probability
public static String ETP(String Species,String[] EnemyArray){
    switch (Species){
        case "Kobold":
            double ran = (Math.random()*10)+1;
            if(1 <= ran && ran <= 4){
                return EnemyArray[0];
            }else if (4 < ran && ran <= 7){
                return EnemyArray[1];
            }else if (7 < ran && ran <= 9){
                return EnemyArray[2];
            }else{
                return EnemyArray[3];
            }



        default:
            return "Common";
    }

}




}
