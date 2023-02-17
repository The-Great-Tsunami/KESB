#Class
import random


class Pokemon:

	def __init__(self, name, owner, skills):
		self.name = name
		self.owner = owner
		self.skills = skills.split("/")
		print(f'포켓몬 -  {name} 생성됨')

	def info(self):
		print(f"{self.owner}의 포켓몬, {self.name}가 나타났다!")
		print(f"{self.name}의 스킬목록 - {self.skills}")
	def attack(self):
		print(f"{self.name}, {random.choice(self.skills)}!!")

#p1 = Pokemon("윤정무", '정도윤', "100만 볼트/전광석화/새삥/몸통박치기")
p2 = Pokemon("꼬부기", '오바람', "고속스핀/거품광선/몸통박치기/하이드로펌프")


class MOOMOO(Pokemon): #상속
	pass

moo = MOOMOO("윤정무", '정도윤', "100만 볼트/전광석화/새삥/몸통박치기")

moo.info()
