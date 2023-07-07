import random
import time

from python.sort1 import sort1
from python.sort2 import sort2


myList = []
for i in range(10000):
    myList.append(random.randint(-10000, 10000))

begin = time.perf_counter()
sort1(myList)
end = time.perf_counter()
print(f"sort1() took {end - begin:f} seconds")

begin = time.perf_counter()
sort2(myList)
end = time.perf_counter()
print(f"sort2() took {end - begin:f} seconds")

begin = time.perf_counter()
myList.sort()
end = time.perf_counter()
print(f"list sort() took {end - begin:f} seconds")

begin = time.perf_counter()
sorted(myList)
end = time.perf_counter()
print(f"sorted() took {end - begin:f} seconds")