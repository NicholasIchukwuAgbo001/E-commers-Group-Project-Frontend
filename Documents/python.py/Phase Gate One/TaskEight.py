import random
incorrect = 0
correct = 0
question = 0
for question in range(10):
    print("QUESTION", question+1)
    numberone = random.randrange(1,1000)
    numbertwo = random.randrange(1,1000)
    print(numberone, '-', numbertwo)
    answer = int(input('ENTER THE CORRECT ANSWER FOR THE ABOVE: '))
    result = ('incorrect' if answer != (numberone - numbertwo) else 'correct')
    print(result)
    print()
    if result == 'incorrect':
        incorrect+1
    if result == 'correct':
        correct+1
        
print('passed', correct + correct)
print('failed', incorrect + incorrect)
        