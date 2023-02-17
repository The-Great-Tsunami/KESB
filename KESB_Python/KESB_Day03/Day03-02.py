start = "Na" * 4 + "\n"
middle = 'hey' * 3 + '\n'
end = 'Goodbye'
print(start + start + middle + end)

#immutable -> literal 값은 변경이 불가

name = "henny"

#name[0] = 'P'

#replace

name = "henny"

name.replace('h', 'p')

print(name)

# slicing
a = 'P' + name[1:]

print(a)
