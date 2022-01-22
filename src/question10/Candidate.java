package question10;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
    private String name, party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", party='" + party + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
