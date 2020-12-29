
# memoization
# (O) = n*m

def gridTraveler(m: int, n: int, memo: dict = {}) -> int: 
    try:
        return memo[f"{m}_{n}"]
    except KeyError as err:
        if m == 0 or n == 0: return 0
        if m == 1 and n == 1: return 1
        memo[f"{m}_{n}"] = gridTraveler(m-1, n, memo) + gridTraveler(m, n-1, memo)
        return memo[f"{m}_{n}"]

print(gridTraveler(18, 18, {}))