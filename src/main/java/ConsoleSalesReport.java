/**
 *
 * @author Vutlharhi.
 */

public class ConsoleSalesReport {

    public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        int[][] salesData = {
            {1000, 2000, 3000}, // CPT
            {2000, 3000, 4000}, // PE
            {1500, 1100, 1200}  // PTA
        };

        System.out.println("------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE SALES REPORT");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-18s%-12s%-12s%-12s\n", "", consoles[0], consoles[1], consoles[2]);

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-12d%-12d%-12d\n", 
                cities[i], salesData[i][0], salesData[i][1], salesData[i][2]);
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        // City totals
        for (int i = 0; i < cities.length; i++) {
            int totalCitySales = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                totalCitySales += salesData[i][j];
            }

            System.out.printf("%-18s%d\n", cities[i], totalCitySales);

            // City with the most sales
            if (totalCitySales > maxSales) {
                maxSales = totalCitySales;
                topCity = cities[i];
            }
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity.toUpperCase());
        System.out.println("------------------------------------------------------------------");
    }
}