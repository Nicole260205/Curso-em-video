num = int(input('Digite um valor: '))
tot = 0 

for c in range(1, num + 1):
    if num %c == 0:
        print('\033[33m', end=' ')
        tot += 1
    else:
        print('\033[31m', end=' ')
    print('{}'. format(c), end=' ')
print('\n\033[m O número {} foi divisivel {}x '.format(num, tot))