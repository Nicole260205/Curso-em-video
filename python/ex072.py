cont = ('zero','um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze', 'catorze', 'quinze', 'dezesseis', 'dezesete', 'dezoito', 'dezenove', 'vinte')


while True:
    num = int(input('Escolha um número entre 0 e 20: '))
    if 0 < num < 20:
        break
print(f'Você digitou o número {cont[num]}')