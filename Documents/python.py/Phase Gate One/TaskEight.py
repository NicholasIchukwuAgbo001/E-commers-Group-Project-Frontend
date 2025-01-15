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
    if answer != (numberone - numbertwo):
        incorrect+1
        print('incorrect')
        print()
    if answer == (numberone - numbertwo):
        correct+1
        print('correct')
        print()
                
print('passed', correct)
print('failed', incorrect)
        