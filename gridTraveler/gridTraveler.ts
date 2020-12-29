
// gridTraveler recursive 
// (O) = 2^ (n+m)
const gridTravelerPlain = (m: number, n: number): number => {
    if (m === 1 && n === 1) return 1
    if (m === 0 || n === 0) return 0
    return gridTravelerPlain(m - 1, n) + gridTravelerPlain(m, n - 1)
}

console.log(gridTravelerPlain(2, 3))

// memoization
// (O) = n*m
const gridTraveler = (m: number, n: number, memo: { [string: string]: number }): number => {
    if (memo[`${m}_${n}`] !== undefined) return memo[`${m}_${n}`]
    else {
        if (m === 1 && n === 1) return 1
        if (m === 0 || n === 0) return 0
        memo[`${m}_${n}`] = gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo)
        return memo[`${m}_${n}`]
    }
}

console.log(gridTraveler(18, 18, {})) // 3

