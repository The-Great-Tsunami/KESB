#strip -> 양 옆 문자열 지우기

inha = '$a duck goes into a sea$'

print(inha.strip('$'))

blurt = "what the ...!?"

print(blurt.strip('.?!')) #순서는 바뀌어도 된다.

#len

len(inha)
len(blurt)

#swith -> 무엇으로 시작?, 무엇으로 마무리? -> True or False 로 마무리

print(inha.startswith('$a'))
print(blurt.endswith("!"))

#find or index

subject = 'python, data, structure, database'

print(subject.find('data'), subject.index('data'))
print(subject.rfind('data'), subject.rindex('data')) #reverse 뒤에서 부터
print(subject.find('inha')) # find는 못찾으면 -1을 반환
#print(subject.index('inha')) # index는 못찾으면 에러

#count

print(subject.count('data')) #해당 문자열의 갯수를 센다.
