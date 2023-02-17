###None

def do_nothing():
	pass

do_nothing()
print(do_nothing()) #함수가 명시적으로 retuen을 호출하지 않으면 반환 값으로 'None'을 출력

#mamamoo = ["화사", "솔라", "휘인", "문별"]

#print(mamamoo.pop()) -> 지정하지 않으면 마지막 요소를 반환하며 삭제
#print(mamamoo.remove('문별')) -> pop()과는 다르게 반환 값이 없어, 'None'을 반환하며 삭제.

#'None'은 boolean의 'False'와는 다름.

##'None'을 구분하는 법 -> is연산자

thing = None

if thing is None:
	print("It's nothing")
else:
	print("It'something")
