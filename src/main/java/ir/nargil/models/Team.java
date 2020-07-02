package ir.nargil.models;

import java.util.ArrayList;

public class Team {
    String TeamName;
    int ProgramingLanguageId;
    ArrayList<Member> members;

    public Team(String teamName, int programingLanguageId, ArrayList<Member> members) {
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

    public int getProgramingLanguageId() {
        return ProgramingLanguageId;
    }

    public void setProgramingLanguageId(int programingLanguageId) {
        ProgramingLanguageId = programingLanguageId;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
