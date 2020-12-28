
# plain recursion
# (O) = 2^n

def fib_plain(n: int) -> int:
    if n <= 2: return 1
    else: return fib_plain(n-1) + fib_plain(n-2)

print(fib_plain(10))

# memoization
# (O) = n

def fib_memo(n: int, memo: dict = {}) -> int:
    try:
        return memo[n]
    except KeyError as err:
        if (n <= 2): return 1
        memo[n] = fib_memo(n-1, memo) + fib_memo(n-2, memo)
        return memo[n]

print(fib_memo(50, {}))

    

