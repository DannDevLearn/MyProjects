from pprint import pprint
from timeit import Timer

def find_next_empty(board: list[list[int]]) -> int and int:
    # Find the next empty where my number is 0
    
    for row in range(9):
        for col in range(9):
            if board[row][col] == 0:
                return row, col
    return None, None

def is_valid(board, guess, row, col) -> bool:
    # figures out whether the guess at the row/col of puzzle is a valid guess
    # return True if is valid, False otherwise

    # let's start with row
    row_vals = board[row]
    if guess in row_vals:
        return False
    
    # now the column
    col_vals = [board[i][col] for i in range(9)]
    if guess in col_vals:
        return False
    
    # and the square 
    # this is tricky, but we want to get  where  the 3x3 square starts
    # and iterate over 3 values in the row/col
    row_start = (row // 3) * 3
    col_start = (col // 3) * 3

    for r in range(row_start, row_start + 3):
        for c in range(col_start, col_start + 3):
            if board[r][c] == guess:
                return False
            
    return True



def solve_sudoku(board: list[list[int]]) -> bool:
    # solve sudoku with Backtracking (brutte force elegant)
    # our board is a list of list
    # return wether a solution exists

    # step 1: find next empty
    row, col = find_next_empty(board)

    # step 1.1 if there's nowhere left, then we're done because we only allowed valid inputs
    if row is None:
        return True
    
    # step 2 if there  is a place to put a number, then make a guess between 1 and 9
    for guess in range(1, 10):
        # step 3 check if is valid guess
        if is_valid(board, guess, row, col):
            # step 3.1 if this is valid, then place that guess on the puzzle
            board[row][col] = guess
            # now recurse using this board
            # step 4 recursively call all function 
            if solve_sudoku(board):
                return True
        # step 5 if not valid  Or if our guess does not solve the sudoku, then we need to 
        # backtracking and try  a new number 
        board[row][col] = 0 # reset the guess

    # step 6 if none of the numbers that we try work, then this sudolu is unsolvable!
    return False

if __name__ == '__main__':
    example = [
        [0,0,0,  1,0,3,  0,0,0],
        [9,0,0,  8,0,7,  0,0,5],
        [0,0,5,  0,0,0,  7,0,0],

        [4,6,0,  0,0,0,  0,8,7],
        [0,3,0,  0,7,0,  0,4,0],
        [7,2,0,  0,0,0,  0,9,3],

        [0,0,2,  0,0,0,  3,0,0],
        [3,0,0,  5,0,8,  0,0,1],
        [0,0,0,  9,0,2,  0,0,0]
    ]
    solve_sudoku(example)
    pprint(example)