from datetime import datetime as dt
import pytz

menu = {1: 'Europe/Andorra',
        2: 'Asia/Dubai',
        3: 'Asia/Kabul',
        4: 'America/Antigua',
        5: 'Europe/Tirane',
        6: 'Asia/Yerevan',
        7: 'Africa/Luanda',
        8: 'Europe/Vienna',
        9: 'Asia/Baku',
        0: 'Quit'
        }

while True:
    print("Please, chose one of following timezones to display time accordingly")
    for i in menu:
        print(f'{i}: {menu[i]}')
    else:
        print('='*40)
    inpt = input('Enter your choice')
    if inpt == '0':
        break
    else:
        tz = pytz.timezone(menu[int(inpt)])
        lt = dt.now(tz=tz)
        utc = dt.utcnow()
        print('*' * 40)
        print(f'Name of timezone -> {tz}')
        print(lt.strftime('Date and time -> %c'))
        print(utc.strftime('UTC Date and time -> %c'))
        print('*' * 40)

