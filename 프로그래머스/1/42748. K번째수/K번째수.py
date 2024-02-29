def solution(array, commands):
    result = []
    for i in range(len(commands)):
        tmp = array[commands[i][0]-1:commands[i][1]]
        tmp.sort()
        result.append(tmp[commands[i][2]-1])
        tmp.clear()
    return result