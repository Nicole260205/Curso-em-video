listagem = ('Lápis', 1.75,
            'Borracha', 2,
            'Caderno', 15.9,
            'Estojo' , 25,
            'Tranferidor', 4.2,
            'Compasso', 9.99,
            'Mochila', 120.32,
            'Caneta', 22.3,
            'Livro', 34.9)

for pos in range(0,len(listagem)):
    if pos % 2 == 0:
        print(f'{listagem[pos]:.<30}', end=' ')
    else:
        print(f'R${listagem[pos]:.>1.2f}')