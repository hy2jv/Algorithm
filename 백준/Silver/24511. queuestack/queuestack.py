from collections import deque
import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split()))
brr = list(map(int, input().split()))
M = int(input())
crr = list(map(int, input().split()))

queue = deque()

for i in range(N):
    if arr[i] == 0:
        queue.appendleft(brr[i])

for i in range(M):
    queue.append(crr[i])
    print(queue.popleft(), end=' ')