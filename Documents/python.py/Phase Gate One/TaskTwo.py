numberone = int(input('ENTER FIRST NUMBER: '))
numbertwo = int(input('ENTER SECOND NUMBER: '))
numberthree = int(input('ENTER THIRD NUMBER: '))
mini = min(numberone, numbertwo, numberthree)
maxi = max(numberone, numbertwo, numberthree)
if (numberone != mini and numberone != maxi):
    print(mini,numberone,maxi)
if (numbertwo != mini and numbertwo != maxi):
    print(mini,numbertwo,maxi)
if (numberthree != mini and numberthree != maxi):
    print(mini,numberthree,maxi)