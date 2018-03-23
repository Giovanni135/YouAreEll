public class ID {

    public ID(String uderID, String name, String gitHub) {
        this.userID = userID;
        this.name = name;
        this.github = github;
    }
    public ID(String nme, String github) {
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

    private String name;
    private String github;

    @Override
    public String toString() {
        return "Id{" +
                "id='" + this.userID + '\'' +
                ", name='" + this.name + '\'' +
                ", gitHubId='" + this.github + '\'' +
                '}';
    }
}