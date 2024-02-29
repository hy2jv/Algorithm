n, m = map(int, input().split())
arr = list(map(int, input().split()))
left, right = 1, sum(arr)

while left <= right:
    mid = (left + right) // 2
    cnt = 0
    for a in arr:
        if a > mid:
            cnt += a - mid
    if cnt >= m:
        left = mid + 1
    else:
        right = mid - 1
print(right)