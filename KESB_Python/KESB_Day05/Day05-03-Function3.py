def menu(wine, entree, dessert):
	return {'wine':wine, 'entree':entree, 'dessert':dessert}

#위치인수 -> 딕셔너리로 사용가능
Ex1 = menu('beef', 'chicken', 'cake')

print(Ex1)

#키워드인수

Ex2 = menu(entree = 'beef', dessert = 'chicken', wine = 'cake')

print(Ex2)

#디폴트 -> 디폴트 값을 설정할 수 있음

def menus(wine, entree, dessert = 'podding'):
	return {'wine':wine, 'entree':entree, 'dessert':dessert}

Ex3 = menus(wine= 'chardonnay', entree= 'chicken')

print(Ex3) #dessert를 입력하지 않아도 디폴트 값인 'podding'이 반환


#way1

def buggy(arg, result = []):

	'''
	이 함수의 문제점은 이전에 호출했던 result 리스트가 그대로 남아
	계속해서 누적된다는 점이다.
	'''

	result.append(arg)
	print(result)

#way2

def buggys(arg):

	'''
	다음과 같이 작성할 경우 results 리스트가 누적되지 않게
	동작시킬 수 있다.
	'''

	results = []
	results.append(arg)
	return results

#way3

def buggyss(arg, resultss = None):

	'''
	resultss의 매개변수에 'None'을 넣어 수정하는 방법도 가능하다.
	'''
	if resultss is None:
		resultss = []
	resultss.append(arg)
	print(resultss)