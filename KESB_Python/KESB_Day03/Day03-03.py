#slicing

univ = "Inha University"

print(univ[5:])
print(univ[5:14])
print(univ[5:15])
print(univ[5:-1])
print(univ[-10:])

print(univ[:])

print(univ[::2]) #step

print(univ[-10:-6])

# split -> () 내부에 들어가는 문자를 기준으로 나누어 리스트를 만듬

print(univ.split())
print(univ.split('i')
