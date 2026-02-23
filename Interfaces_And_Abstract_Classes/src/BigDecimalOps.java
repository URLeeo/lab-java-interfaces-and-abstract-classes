import java.math.BigDecimal;
import java.math.RoundingMode;

public final class BigDecimalOps {
    private BigDecimalOps() {
    }

    public static double roundToNearestHundredth(BigDecimal value) {
        if (value == null) throw new IllegalArgumentException("value cannot be null");
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSignAndRoundToNearestTenth(BigDecimal value) {
        if (value == null) throw new IllegalArgumentException("value cannot be null");
        return value.negate().setScale(1, RoundingMode.HALF_UP);
    }
}

