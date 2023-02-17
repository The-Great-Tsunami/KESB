big_bang = ["GD", "태양", "탑", "대성", "승리"]

#index()

big_bang.index("태양") #해당 원소의 오프셋 값을 반환

#in

"태양" in big_bang #존재여부를 확인

#count

big_bang.count("태양") # 해당 원소의 개수를 반환

#join

" ".join(big_bang) #문자열로 변환

#정렬에 대한 함수 sort(), sorted()

sort_ = [4,6,1,4,2,7,9]

#sort() -> 리스트 자체를 내부적으로 정렬

a = sort_.sort()

### id(sort_) == id(a)

#sorted() -> 한 리스트를 정렬한 새로운 복사본을 반환

b = sorted(sort_)

### id(sort_) != id(b)

### if 내림차순 정렬을 원한다면?

sort_.sort(reverse=True) # reverse=True를 삽입

#리스트 내부에 숫자와 문자가 섞여있는 경우 -> 불가능

mixed = [6, 4, 7, "A", 3, "트와이스", "B", "b", "마마무"]
#mixed.sort() #서로 다른 타입은 정렬이 불가능

new_mixed = ['6', '4', '7', 'A', '3', '트와이스', 'B', 'b', '마마무']
new_mixed.sort() # 숫자 -> 문자(오름차순)