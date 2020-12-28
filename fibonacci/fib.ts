
// plain recursion
// (O) = 2^n

const fibPlain = (n: number): number => {
    if (n <= 2) return 1
    else {
        return fibPlain(n - 1) + fibPlain(n - 2)
    }
}

const ans: number = fibPlain(10)
console.log(ans)

// memoization
// (O) = n

const fibMemo = (n: number, memo: { [number: number]: number } = {}): number => {
    if (memo[n] !== undefined) {
        return memo[n]
    }
    if (n <= 2) { return 1 }
    memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo)
    return memo[n]
}



console.log(fibMemo(50))