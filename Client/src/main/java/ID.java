public class ID {

    private String name;
    private String github;

    public ID(String userID, String name, String github) {
        this.userID = userID;
        this.name = name;
        this.github = github;
    }
    public ID(String name, String github) {
        this.name = name;
        this.github = github;
    }

    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id='" + this.userID + '\'' +
                ", name='" + this.name + '\'' +
                ", gitHubId='" + this.github + '\'' +
                '}';
    }
}