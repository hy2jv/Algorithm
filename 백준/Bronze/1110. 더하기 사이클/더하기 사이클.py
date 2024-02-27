n = int(input())
org = n
result = 0
while True:
    if n < 10:
        x = 0
        y = n
    else:
        x, y = n//10, n%10
    newNum = x + y
    n = y * 10 + newNum%10
    result += 1
    if n == org:
        break
print(result)