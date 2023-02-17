avengers = ["Ironman", "Captain America", "Hulk", "Thor", "Hawkeye"]

print(avengers)

avengers.append(None)

avengers[-1] = "Spiderman"

print(avengers)


#1
avengers.append(None)
print(avengers)

#2
avengers[6] = avengers[5]
avengers[5] = None
print(avengers)

#3
avengers[5] = avengers[4]
avengers[4] = None
print(avengers)

#4
avengers[4] = avengers[3]
avengers[3] = None
print(avengers)

#5
avengers[3] = "black widow"
print(avengers)

#1
avengers[4] = None
print(avengers)

#2
avengers[4] = avengers[5]
avengers[5] = None
print(avengers)

#3
avengers[5] = avengers[6]
avengers[6] = None
print(avengers)
#4

del(avengers[6])
print(avengers)

