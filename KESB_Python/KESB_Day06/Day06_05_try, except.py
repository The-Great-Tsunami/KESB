# def div_calc(first, second):
# 	"""
# 	나누기 함수
# 	:param first: 분자
# 	:param second: 분모
# 	:return: 계산결과
# 	"""
# 	return first/second

try:
	#raise TypeError("타입에러")
	expression = input("분자 분모 입니다.").split()
	print(int(expression[0]) / int(expression[1]))

except ValueError as err:
	print(f"숫자를 입력해주세요.({err})")

except ZeroDivisionError as err:
	print(f"분모에 0이 올 수 없습니다.({err})")

except IndexError:
	print("입력 값의 범위에 문제가 있습니다.")

except Exception as error:
	print(f"예외 발생({error})")

else: #예외가 발생하지 않았을 때
	print("프로그램 정상", end=" ")

finally: #예외 발생 여부와 상관 없이 무조건 실행
	print("종료")

# print(div_calc(15, 3))
# print(div_calc(7, 0))