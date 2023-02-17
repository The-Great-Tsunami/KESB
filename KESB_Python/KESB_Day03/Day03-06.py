# 대문자 변경

inha = 'a duck goes into a sea'

print(inha.capitalize())

print(inha.title())

print(inha.upper())

#정렬

print(inha.center(30)) #중앙
print(inha.rjust(30))  #우측
print(inha.ljust(30))  #좌측

#format
thing = "wraith"
place = 'window'

print('the {} is at {}'.format(thing, place))
print('the {:10s} is at the {:10s}.'.format(thing, place))
