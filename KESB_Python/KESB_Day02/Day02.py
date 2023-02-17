#CHAP4 - if3-random
import random


limits = 20
tweets = "pass" * random.randint(1, 10) #난수 발생


diff = limits - len(tweets)

if diff >= 0:
	print("A fitting tweet")
else:
	print(f'글자 수 {abs(diff)} 초과')


