def solution(x, n):
    ans = []
    add = x
    for i in range(n):
        ans.append(add)
        add += x
    return ans