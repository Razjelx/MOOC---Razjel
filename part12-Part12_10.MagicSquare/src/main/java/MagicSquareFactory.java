
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        if (size % 2 == 1) {
            int row = 0;
            int col = size / 2;
            
            
            square.placeValue(col , row, 1);
            for (int i = 2; i <= size * size; i++) {
               int currentRow = row;
               int currentCol = col;
               
               col++;
               row--;
               
               if (row < 0) {
                   row = size - 1;
               }
               if (col > size - 1) {
                   col = 0;
               }
               if (square.readValue(col, row) > 0) {
                   row = currentRow + 1;
                   col = currentCol;
               }
               square.placeValue(col, row, i);
            }
            
        }
        
        return square;
    }

}
