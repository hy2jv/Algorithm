import sys

input = sys.stdin.readline


def is_possible(dist):
    cnt, prev = 1, arr[0]
    for i in range(1, n):
        if arr[i] - prev >= dist:
            cnt += 1
            prev = arr[i]
    if cnt >= c:
        return True
    return False


n, c = map(int, input().split())
arr = []
for i in range(n):
    arr.append(int(input()))

arr.sort()
low, high = 1, arr[n - 1] - arr[0]
result = 0
while low <= high:
    mid = (low + high) // 2
    if is_possible(mid):
        result = max(result, mid)
        low = mid + 1
    else:
        high = mid - 1
print(result)