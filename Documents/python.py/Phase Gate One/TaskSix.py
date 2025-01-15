print('''
    0. sunday
    1. monday
    2. tuesday
    3. wednesday
    4. thursday
    5. friday
    6. saturday
''')
dayselected = int(input("ENTER TODAY'S DAY: "))
dayselapsed = int(input('ENTER THE NUMBER OF DAYS ELAPSED SINCE TODAY: '))
days = ['sunday','monday','tuesday','wednesday','thursday','friday','saturday','sunday','monday','tuesday','wednesday','thursday','friday','saturday']
if dayselected in range (0,6):
    future = dayselected + dayselapsed
    print('TODAY IS', days[dayselected],'and the future day is', days[future]) 
    