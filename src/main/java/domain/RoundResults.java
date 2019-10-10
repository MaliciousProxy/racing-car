package domain;

import java.util.HashMap;
import java.util.Map;

public class RoundResults {
    private Map<Integer, RoundResult> results = new HashMap<>();

    void addRoundResult(int round, Cars cars) {
        results.put(round, new RoundResult(round, cars));
    }

    public Map<Integer, RoundResult> getResults() {
        return results;
    }
}
