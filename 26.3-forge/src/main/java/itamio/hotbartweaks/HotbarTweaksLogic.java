package itamio.hotbartweaks;

/** Pure hotbar rules: non-wrapping scroll and row/column shifting. */
public final class HotbarTweaksLogic {
    private HotbarTweaksLogic() {}

    /** Scrolling wraps only when looping is enabled; otherwise it clamps. */
    public static int scroll(int index, int delta, int size, boolean loop) {
        int next = index + delta;
        if (loop) return ((next % size) + size) % size;
        return Math.max(0, Math.min(size - 1, next));
    }

    /** Arrow-key style shifting between hotbar rows/columns. */
    public static int shift(int index, int columns, int rows, int dColumn, int dRow) {
        int col = Math.floorMod(index, columns) + dColumn;
        int row = Math.floorDiv(index, columns) + dRow;
        row = Math.floorMod(row, rows);
        col = Math.floorMod(col, columns);
        return Math.min(columns * rows - 1, row * columns + col);
    }
}
