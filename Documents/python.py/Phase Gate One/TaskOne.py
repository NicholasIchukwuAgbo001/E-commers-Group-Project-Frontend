import random
numberone = random.randrange(1,100)
numbertwo = random.randrange(1,100)
print(numberone, '+', numbertwo)
answer = int(input('ENTER THE CORRECT ANSWER FOR THE ABOVE: '))
result = ('false' if answer != (numberone + numbertwo) else 'true')
print(result)
if result == 'false':
    print(f'{numberone} plus {numbertwo} is {numberone + numbertwo}')