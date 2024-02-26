n = int(input())
money = 1000 - n
result = 0
while money > 0:
    if money >= 500:
        result += (money // 500)
        money -= 500 * (money // 500)
    elif money >= 100:
        result += (money // 100)
        money -= 100 * (money // 100)
    elif money >= 50:
        result += (money // 50)
        money -= 50 * (money // 50)
    elif money >= 10:
        result += (money // 10)
        money -= 10 * (money // 10)
    elif money >= 5:
        result += (money // 5)
        money -= 5 * (money // 5)
    else:
        result += (money // 1)
        money -= 1 * (money // 1)

result += (money // 1)
print(result)