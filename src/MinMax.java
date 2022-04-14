import java.util.IntSummaryStatistics;

public record MinMax(int min, int max) {
    public static MinMax fromIntStatistics(IntSummaryStatistics statistics) {
        return new MinMax(statistics.getMin(), statistics.getMax());
    }
}
