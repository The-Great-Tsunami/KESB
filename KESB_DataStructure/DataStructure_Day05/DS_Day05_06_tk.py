import tkinter as tk


memos = [None for _ in range(100)] # 전역 리스트

memos[0], memos[1] = 0, 1

def fibo(n):
	global memo
	memo = [0,1]
	"""
	Memoization(DP)을 사용한 피보나치 수열 처리 함수
	:param n: 
	:return
	"""
	if n <= 1:
		return memo[n]

	else:
		for i in range(2, n+1):
			memo.append(memo[i-1]+memo[i-2])
		return memo[n]

def fact_recu(n):
	if n == 1:
		return 1
	else:
		return n * fact_recu(n-1)

def fact_input():
	lbl_results.config(text = f"팩토리얼 출력 결과 : {fact_recu(int(en_num_input.get()))}")
def fibo_input():
	lbl_results.config(text = f"피보나치 출력 결과 : {fibo(int(en_num_input.get()))}")

win = tk.Tk() #윈도우 생성
win.title("Calculator")
win.geometry("250x150")

en_num_input = tk.Entry() #텍스트 입력 상자
lbl_results = tk.Label(text = "계산기 출력 결과: ")
btn_fact = tk.Button(text="팩토리얼", command = fact_input)
btn_fibo = tk.Button(text="피보나치", command = fibo_input)

en_num_input.pack()
lbl_results.pack()
btn_fact.pack(fill='x')
btn_fibo.pack(fill="x")
