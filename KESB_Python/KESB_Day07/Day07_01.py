# class

class Pokemon:
    def __init__(self, owner, skills):
        self.owner = owner
        self.skills = skills.split('/')
        print(f"포켓몬 생성 :", end=' ')

    def info(self):
        print(f"{self.owner}의 포켓몬이 사용 가능한 스킬")
        for skill in self.skills:
            print(skill)

    def attack(self, idx):
        print(f'{self.skills[idx]} 공격 시전!')


class Pikachu(Pokemon):  # inheritance
    def __init__(self, owner, skills):
        super().__init__(owner, skills)
        self.name = "피카츄"
        print(f"{self.name}")

    def attack(self, idx):  # override
        print(f'{self.owner}의 {self.name}가 {self.skills[idx]} 공격(전기) 시전!')


class Ggoboogi(Pokemon):  # inheritance
    def __init__(self, owner, skills):
        super().__init__(owner, skills)
        self.name = "꼬부기"
        print(f"{self.name}")

    def attack(self, idx):  # override
        print(f'{self.owner}의 {self.name}가 {self.skills[idx]} 공격(물) 시전!')

    def swim(self):
        print(f'{self.name}가 수영을 합니다')


p0 = Pokemon('아이리스', '어떤공격')
p0.attack(0)
# p0.swim()  # 꼬부기 클래스의 객체들이 사용할 수 있는 고유 메서드

pk1 = Pikachu('한지우', '번개/100만 볼트')
#pk1.info()
ggo1 = Ggoboogi('오바람', '고속스핀/거품/몸통박치기')
#ggo1.info()
ggo1.swim()
ggo1.attack(2)
pk1.attack(1)


#pi1.info()
# p1 = Pokemon('한지우', '50만 볼트/100만 볼트/번개')
# p2 = Pokemon('오바람', '고속스핀/거품/몸통박치기/하이드로펌프')