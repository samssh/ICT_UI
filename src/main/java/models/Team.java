package models;

import java.util.ArrayList;

public class Team {
    String TeamName;
    String ProgramingLanguageId;
    ArrayList<Member> members;

    public Team(String teamName, String programingLanguageId, ArrayList<Member> members) {
        TeamName = teamName;
        ProgramingLanguageId = programingLanguageId;
        this.members = members;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public String getProgramingLanguageId() {
        return ProgramingLanguageId;
    }

    public void setProgramingLanguageId(String programingLanguageId) {
        ProgramingLanguageId = programingLanguageId;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
