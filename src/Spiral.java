/* @author Joni-Pekka Vesto <blog.jonivesto.com>
 * @since 28.6.2019 18:43
 */

public class Spiral {

    public static void main(String[] args) {

        // X and Y size of the 2d array
        // Value must be odd
        int size = 5;

        // X and Y center index of the 2d array
        int center = size / 2;

        // Create the array
        int[][] spiralArray = new int[size][size];

        // These directions define the spiral pattern
        int[] dirX = {1, 0, 0, -1, -1, 0, 0, 1};
        int[] dirY = {0, -1, -1, 0, 0, 1, 1, 0};

        // Current coordinates when drawing the spiral
        int x, y;

        // Current progress
        // In the end value will be size*size-1
        int p = 0;

        // Start drawing the spiral
        // Center of the spiral
        spiralArray[center][center] = p;
        p++;

        // Each layer around the center point
        for (int layer = 1; layer <= center; layer++) {

            // Set starting coordinates for each layer
            x = center;
            y = center + layer;

            // Phase = index in dirX and dirY array's
            // Do each phase for each layer
            for (int phase = 0; phase < 8; phase++) {

                // Iterate through the phase
                for (int step = 1; step <= layer; step++, p++) {

                    // Update current coordinates
                    x += dirX[phase];
                    y += dirY[phase];

                    // Add the current progress to the spiral array
                    spiralArray[x][y] = p;
                }
            }

        }


        // Print the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(spiralArray[i][j] + " ");

                if(spiralArray[i][j] < 10) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
