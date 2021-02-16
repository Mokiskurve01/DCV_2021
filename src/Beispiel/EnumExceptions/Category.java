package Beispiel.EnumExceptions;

public enum Category {

    HELM, STOECKE,SCHISCHUHE,SCHIBRILLE,SCHI,JAGERTEE;

    public double getPreis() throws ItemUnknownPriceException {
        switch (this){
            case HELM -> { return 5.90;}
            case STOECKE -> { return 5.90;}
            case SCHISCHUHE -> { return 5.90;}
            case SCHIBRILLE -> { return 5.90;}
            case SCHI -> { return 5.90;}
           // case JAGERTEE -> { return 3.90;}
            default -> {throw new ItemUnknownPriceException(this);}
        }
    }
}
