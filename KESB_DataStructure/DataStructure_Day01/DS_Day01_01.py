pokemons = list()


def add_data(pokemon):
	pokemons.append(None)
	#pokemons[len(pokemons) - 1] = pokemon
	pokemons[-1] = pokemon


add_data('피카츄')
add_data('라이츄')
add_data('파이리')
add_data('꼬부기')
add_data('이상해씨')

print(pokemons)


add_data("정연")