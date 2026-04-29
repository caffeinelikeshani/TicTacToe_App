public class CoordinateConverter {
    public static void main(String[] args) {
        int slot = 5; 
        int[] indices = convertToIndices(slot);
        
        System.out.println("Slot " + slot + " maps to: Row " + indices[0] + ", Column " + indices[1]);
    }

    public static int[] convertToIndices(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }
}