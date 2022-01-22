package question10;

import java.util.ArrayList;
import java.util.List;

public class Election {
    ArrayList<Candidate> candidatesList = new ArrayList();

    public void addCandidate(Candidate candidate) {
        candidatesList.add(candidate);
    }

    public int getTotalVotes() {
        int total = 0;

        for (Candidate can : candidatesList) {
            total += can.getNumberOfVotes();
        }

        return total;
    }

    public List<Candidate> getCandidatesFromParty(String party) {
        ArrayList<Candidate> candidates = new ArrayList<>();

        for (Candidate can : candidatesList) {
            if (can.getParty().equals(party)) {
                candidates.add(can);
            }
        }

        return candidates;
    }

    public double calculateVotePercentage(List<Candidate> candidates) {
        var tempTotal = 0.0;
        for (Candidate can : candidates) {
            tempTotal += can.getNumberOfVotes();
        }

        return tempTotal/getTotalVotes();
    }

    public static void main(String[] args) {
        Election election = new Election();

        election.addCandidate(new Candidate("name", "party one", 10));
        election.addCandidate(new Candidate("name1", "party one", 5));
        election.addCandidate(new Candidate("name2", "party one", 40));
        election.addCandidate(new Candidate("name3", "party one", 1));

        election.addCandidate(new Candidate("name", "party two", 10));
        election.addCandidate(new Candidate("name", "party two", 5));
        election.addCandidate(new Candidate("name", "party two", 50));
        election.addCandidate(new Candidate("name", "party two", 1));

        election.addCandidate(new Candidate("name", "party three", 10));
        election.addCandidate(new Candidate("name", "party three", 5));
        election.addCandidate(new Candidate("name", "party three", 40));
        election.addCandidate(new Candidate("name", "party three", 1));

        System.out.println(election.getTotalVotes());

        System.out.println(election.getCandidatesFromParty("party one"));

        System.out.println(election.calculateVotePercentage(election.getCandidatesFromParty("party one")));
    }
}
