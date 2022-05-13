public class Animal {
    private String animName;
    private boolean IsDog;

    public Animal (String animName, boolean IsDog) {
        this.animName = animName;
        this.IsDog = IsDog;
    }

    public String getName() {
        return this.animName;
    }

    public void setName(String animName) {
        this.animName = animName;
    }

    public boolean getDog() {
        return this.IsDog;
    }

    public void setDog(boolean IsDog) {
        this.IsDog = IsDog;
    }

    @Override
    public String toString() {
        return getName() + " is a good doggo = " + getDog();
    }
}