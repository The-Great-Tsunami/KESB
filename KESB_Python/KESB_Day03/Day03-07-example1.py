#example - 1

song = """When an eel grabs your arm,
And it causes great harm
That's - a moray"""

song_find = song.split()

print(song_find)

for i in song_find:
	if i.startswith(("m")) == True:
		a = i.capitalize()
		b = song_find.index(i)
		song_find[b] = a
		print(' '.join(song_find))
