n = int(input())
money = 1000 - n
result = 0
arr = [500, 100, 50, 10, 5, 1]

for i in arr:
    result += money // i
    money %= i
print(result)