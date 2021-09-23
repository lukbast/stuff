import time
# print(time.gmtime(0))
#
# print(time.localtime())
#
# print(time.time())

date = time.localtime()

# print(f'Today is {date[2]}, {date[1]}, {date[0]}')
# print(f'Time: {date[3]}:{date[4]}')

# print(f'Today is {date.tm_year}, {date.tm_mon}, {date.tm_mday}')
# print(f'Time: {date.tm_hour}:{date.tm_min}')
# epoch on this computer starts at
print(time.strftime('%c', time.gmtime(0)))  # epoch on this computer starts at

# current time zone name
print(time.timezone)

if time.daylight != 0:
    print('Daylight Saving Time is in effect in this location')
    print('The DST time zone is: ' + time.tzname[1])
else:
    print(time.tzname[0])

print('Local time is ' + time.strftime('%d-%h-%Y %H:%M:%S', time.localtime()))
print('UTC time is ' + time.strftime('%d-%h-%Y %H:%M:%S', time.gmtime()))
