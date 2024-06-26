public class ProductAnalyzer {

  public static Map<Double, PriceRangeData> analyze(List<Double> prices) {
    Map<Double, PriceData> results = new HashMap<>();
    for (double price : prices) {
      int rangeStart = (int) (price / 50) * 50;
      PriceData rangeData = results.get(rangeStart);
      if (rangeData == null) {
        rangeData = new PriceData(rangeStart, rangeStart + 50);
        results.put(rangeStart.doubleValue(), rangeData);
      }
      rangeData.count++;
      rangeData.totalRevenue += price;
    }
    return results;
  }

  static class PriceData {
    final int startPrice;
    final int endPrice;
    int count;
    double totalRevenue;

    public PriceRangeData(int startPrice, int endPrice) {
      this.startPrice = startPrice;
      this.endPrice = endPrice;
    }
  }
}