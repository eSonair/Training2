import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryRangesMichael {

    private static class Pair {
        int a;
        int b;

        private Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public String toString() {
            if (a == b) {
                return "\"" + a + "\"";
            } else {
                return "\"" + a + "->" + b + "\"";
            }
        }
    }

    public static void main(String... args) {
        System.out.println(summaryRanges(-5,-2,-1,0,1,2,3,5,6,7,9,11,12));
    }

    public static List<String> summaryRanges(int... nums) {
        Integer prev = null;

        List<Pair> arrayList = new ArrayList<>();

        Integer first = null;

        for (int i = 0; i < nums.length; i++) {
            if (prev == null) {
                prev = first = nums[0];
                continue;
            }

            if (++prev != nums[i]) {
                arrayList.add(new Pair(first, nums[i-1]));
                prev = first = nums[i];
            }

            if (i+1 == nums.length) {
                arrayList.add(new Pair(first, nums[i]));
            }
        }

        return arrayList.stream().map(Pair::toString).collect(Collectors.toList());
            // map.stream().map(element -> element.toString()).collect(Collectors.toList());
            // map.stream().map((Pair element) -> element.toString()).collect(Collectors.toList());
    }
}