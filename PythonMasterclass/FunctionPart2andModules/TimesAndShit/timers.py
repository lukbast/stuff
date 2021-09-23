import time
from time import time as t
import random

input("press enter to start")

wait_tm = random.randint(1, 5)
time.sleep(wait_tm)
start_time = t()
input('press enter to stop')
stop_time = t()


print(f'Started at {time.strftime("%X", time.localtime(start_time))}')
print(f'Ended at {time.strftime("%X", time.localtime(stop_time))}')
print(f'Your reaction was {stop_time-start_time}')
