package task1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RollNumberFetcher {
    public List<RollNumber> fetchRollNumbersList(List<Student> studentsList) {
        // TODO: COMPLETE THIS METHOD!
        List<RollNumber> fetchRollNumberFromStudent=new ArrayList<>();
        for (Student s:studentsList) {
            fetchRollNumberFromStudent.add(new RollNumber(BigInteger.valueOf(Long.parseLong(String.format("1915000"+s.getRollNumber())))));
        }
        return fetchRollNumberFromStudent;
    }
}
