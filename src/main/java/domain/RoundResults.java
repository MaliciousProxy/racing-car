package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoundResults {
    private Map<Integer, RoundResult> results = new HashMap<>();

    public void addRoundResult(int round, List<Car> cars) {
        results.put(round, new RoundResult(round, cars));
    }

    public Map<Integer, RoundResult> getResults() {
        return results;
    }
}
