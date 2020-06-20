package characters;

public abstract class Character {
    
    protected static final String[] they = {"they", "them", "their", "theirs", "themself"};
    protected static final String[] she = {"she", "her", "her", "hers", "herself"};
    protected static final String[] he = {"he", "him", "his", "his", "himself"};
	
	
	
    public Character() {
    }
	
    public abstract String name();
	
}