 package Java;

    public class DataScraper {
        public static void main(String[] args) {
            System.out.println("=== Starting Automation Web Scraper ===");

            // 1. Simulating a collection of web elements (Product Titles)
            String[] webElements = {
                    "iPhone 15 Pro",
                    "Empty Search Result",
                    "Samsung Galaxy S24",
                    "Sony WH-1000XM5 Headphones",
                    "Broken Link Element"
            };

            // 2. Loop through each web element to extract and validate text data
            for (int i = 0; i < webElements.length; i++) {
                String elementText = webElements[i];

                // 3. Conditional logic to filter out bad or broken data
                if (elementText.contains("Empty") || elementText.contains("Broken")) {
                    System.out.println("[WARNING] Skipping invalid element at index " + i + ": " + elementText);
                } else {
                    System.out.println("[SUCCESS] Successfully scraped item: " + elementText.toUpperCase());
                }
            }

            System.out.println("=== Scraper Process Completed Successfully ===");
        }
    }

