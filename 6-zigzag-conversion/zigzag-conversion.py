class Solution:
    def convert(self, s: str, numRows: int) -> str:
        n = len(s)

        if numRows == 1 or numRows >= n:
            return s

        rows = ["" for _ in range(numRows)]

        # ZigZag
        current_row = 0
        going_down = False

        for char in s:
            rows[current_row] += char

            if current_row == 0:
                going_down = True

            if current_row == numRows - 1:
                going_down = False

            current_row += 1 if going_down else -1

        return "".join(rows)
