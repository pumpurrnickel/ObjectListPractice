public class TVShowsOOP{
    private String ShowName;
    private int Episodes;
    private String Genre;

    public TVShowsOOP(String ShowName, int Episodes, String Genre){
        this.ShowName = ShowName;
        this.Episodes = Episodes;
        this.Genre = Genre;
    }

    public String getShowName(){
        return this.ShowName;
    }

    public int getEpisodes(){
        return this.Episodes;
    }

    public String getGenre(){
        return this.Genre;
    }
    
    @Override
    public String toString() {
        return "Show Name: " + getShowName() + "\n" + "Number of Episodes: " + getEpisodes() + "\n" + "Show Genre: " + getGenre();
    }
}
