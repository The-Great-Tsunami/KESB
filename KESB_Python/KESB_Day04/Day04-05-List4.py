 ###List 복사방법

import copy #deepcopy를 위해선 import 필요

a = [1, 2, [5, -9]]
b = copy.deepcopy(a)
a[2][1] = 7  # mutable, deepcopy
print(a, b)

a = [1, 2, [5, -9]]
b = a.copy()
c = list(a)
d = a[:]
a[2][1] = 7  # mutable, b/c/d affects
print(a, b, c, d)


a = [1, 2, 3]
b = a.copy()
c = list(a)
d = a[:]
a[2] = 'sw'  # immutable
print(a, b, c, d)
